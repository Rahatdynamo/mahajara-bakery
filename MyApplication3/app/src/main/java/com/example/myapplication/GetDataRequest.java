//package com.example.myapplication;
//
//import android.content.Context;
//
//import com.android.volley.Request;
//import com.android.volley.RequestQueue;
//import com.android.volley.Response;
//import com.android.volley.toolbox.JsonArrayRequest;
//import com.android.volley.toolbox.JsonObjectRequest;
//import com.android.volley.toolbox.Volley;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//public class GetDataRequest {
//
//    private static final String BASE_URL = "http://192.168.43.202:3001/api/data";
//
//    public static void getDataWithParameters(
//            Context context,
//            String parameter1,
//            Response.Listener<JSONObject> successListener,
//            Response.ErrorListener errorListener) {
//
//        RequestQueue requestQueue = Volley.newRequestQueue(context);
//
//        // Create the JSON object for POST request
//        JSONObject jsonBody = new JSONObject();
//        try {
//            jsonBody.put("parameter1", parameter1);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JsonObjectRequest request = new JsonObjectRequest(
//                Request.Method.POST,
//
//                BASE_URL,
//                jsonBody,
//                successListener,
//                errorListener
//        );
//
//        requestQueue.add(request);
//    }
//}
