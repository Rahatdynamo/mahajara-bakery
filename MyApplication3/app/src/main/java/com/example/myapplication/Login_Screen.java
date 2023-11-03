package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class Login_Screen extends AppCompatActivity {
  ImageView return_btn;
  FrameLayout user_account_fl;
  DpHelper dpHelper;
    private SharedViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        return_btn=findViewById(R.id.return_btn);
        user_account_fl=findViewById(R.id.user_account_fl);
        dpHelper=new DpHelper(getApplicationContext());
        return_btn.setClickable(true);
        dpHelper=new DpHelper(getApplicationContext());
        viewModel = new ViewModelProvider(this).get(SharedViewModel.class);
        String userdata=dpHelper.getSessionDetails("User_Key");


        viewModel.setUserData(userdata);
        return_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),MainActivity.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent4);
                overridePendingTransition(0,0);


            }
        });
        if(dpHelper.checkUserLoggedIn()){

            getSupportFragmentManager().beginTransaction().add(R.id.user_account_fl,new Profile_Fragment()).commit();
        }else {
            getSupportFragmentManager().beginTransaction().add(R.id.user_account_fl,new Login_fragment()).commit();}


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("selectedMenuItemId", R.id.btn_Nav_Home);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // Change to the desired item
        startActivity(intent);
        overridePendingTransition(0,0);
        finish();
    }
}