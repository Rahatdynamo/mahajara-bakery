package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.util.ArrayList;

import java.util.List;


public class MainActivity extends AppCompatActivity  implements ItemClickListener {


    RecyclerView recycler_one;

    BottomNavigationView btm_Nav;
    String names[] = {"RichPlumCake", "Beverages", "BirthdayCake", "Breads", "Chat", "Cookies", "Pastries", "Puffs", "Rusks", "Savouries", "Snacks", "Sweets"};
    int Sweet_Images[] = {R.drawable.rich_plum_cake, R.drawable.beverages1, R.drawable.birthday_cake1, R.drawable.breads1, R.drawable.chat1, R.drawable.cookies1, R.drawable.pastries1, R.drawable.puffs1, R.drawable.rusk1, R.drawable.savories1, R.drawable.snack1, R.drawable.sweet1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);
        recycler_one = findViewById(R.id.recycler_one);

        btm_Nav = findViewById(R.id.btm_nav);



        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.diwali, "Diwali"));
        sliderItems.add(new SliderItem(R.drawable.christmas, "Christmas"));
        sliderItems.add(new SliderItem(R.drawable.raksha, "rakshaBhandan"));


        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2, 3000));

        new SliderAdapter((position, title, view) -> {
            // Toast.makeText(this, " Festival "+title, Toast.LENGTH_SHORT).show();
        });

        btm_Nav.setSelectedItemId(R.id.btn_Nav_Home);


        btm_Nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btn_Nav_Home:
                        item.setChecked(true);
                        break;


                    case R.id.btn_nav_profile:
                        Intent intent1 = new Intent(getApplicationContext(), Login_Screen.class);
                        item.setChecked(true);
                        startActivity(intent1);
                        overridePendingTransition(0, 0);
                        break;


                    case R.id.btn_Nav_Notification:
                        Intent intent2 = new Intent(getApplicationContext(), Notification_Page.class);
                        item.setChecked(true);

                        startActivity(intent2);
                        overridePendingTransition(0, 0);
                        break;

                    case R.id.btn_Nav_Mycart:
                        Intent intent3 = new Intent(getApplicationContext(), My_Cart_Screen.class);
                        item.setChecked(true);
                        //getData();
                        //getResponse();
                        startActivity(intent3);
                        overridePendingTransition(0, 0);
                        break;

                }
                return false;
            }
        });
        int selectedMenuItemId = getIntent().getIntExtra("selectedMenuItemId", R.id.btn_Nav_Home);


        btm_Nav.setSelectedItemId(selectedMenuItemId);


        MyAdapter adapter = new MyAdapter(this, names, Sweet_Images,this);
        recycler_one.setLayoutManager(new GridLayoutManager(this, 2));

        recycler_one.setAdapter(adapter);





    }

    @Override
    public void onBackPressed() {

        if (btm_Nav.getSelectedItemId() != R.id.btn_Nav_Home) {
            btm_Nav.setSelectedItemId(R.id.btn_Nav_Home);
        } else {

            super.onBackPressed();}

    }
    @Override
    public void onItemClick(int position) {

      String name=names[position];
        Intent i=new Intent(getApplicationContext(),Item_list.class);
        i.putExtra("name_key",name);
        startActivity(i);
    }


}







