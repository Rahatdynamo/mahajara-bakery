package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Item_list extends AppCompatActivity {
    RecyclerView recycler_two;
   private MyAdapter2 adapter2;
   ArrayList<itemModel>  object;
   String name1;
   TextView item_list_no,item_list_price;
   String price_Value;
   int value=0;
   int item_no=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        object=new ArrayList<>();

       item_list_no=findViewById(R.id.item_list_no);
       item_list_price=findViewById(R.id.item_list_price);
        recycler_two=(RecyclerView) findViewById(R.id.recycler_two);
        Intent i=getIntent();
        name1 = i.getStringExtra("name_key");


        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recycler_two.setLayoutManager(layoutManager);
        adapter2=new MyAdapter2(object);
       //item_list_price.setText(adapter2.itemPrice());
        recycler_two.setAdapter(adapter2);
        getData();
       adapter2.setOnClickListener(new ItemClickListener2() {
           @Override
           public void onItemClick(String item) {
               price_Value=item;
               item_no++;
               value+=Integer.parseInt(price_Value);
               item_list_price.setText("$ "+ String.valueOf(value));
               item_list_no.setText(String.valueOf(item_no)+" Item");
           }
       });





    }
    private void getData(){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.43.202:3002/api/"+name1;

        // Request a JSON response from the provided URL
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                ArrayList<itemModel> posts=parseJsonResponse(response.toString());
                adapter2.setData(posts);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle errors
                        Log.e("Volley Error", error.getMessage());
                    }
                });


        // Add the request to the RequestQueue
        queue.add(jsonObjectRequest);


    }
    private ArrayList<itemModel> parseJsonResponse(String response){
        ArrayList<itemModel> posts=new ArrayList<>();
        try {
            JSONObject object=new JSONObject(response);

            JSONArray usersArray = object.getJSONArray("users");

            for (int i = 0; i < usersArray.length(); i++) {
                JSONObject userObject = usersArray.getJSONObject(i);

                int id = userObject.getInt("id");
                String cakeType = userObject.getString("cake_type");
                String image = userObject.getString("image");
                String name = userObject.getString("name");
                String price = userObject.getString("price");
                String weight = userObject.getString("weight");

             itemModel post=new itemModel();
             post.setName(name);
             post.setPrice(price);
             post.setWeight(weight);
             posts.add(post);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return posts;
    }






    }

