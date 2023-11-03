package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login_fragment extends Fragment {
  View v;
  TextView SignUp_tv;
  EditText login_phone,login_pass;
  Button login_button;
  DpHelper dpHelper;
    private SharedViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_login_, container, false);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        SignUp_tv=v.findViewById(R.id.SignUp_tv);
        login_phone=v.findViewById(R.id.login_phone);
        login_pass=v.findViewById(R.id.login_pass);
        login_button=v.findViewById(R.id.login_button);
        dpHelper=new DpHelper(getActivity());
        SignUp_tv.setClickable(true);


        SignUp_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,new SignUp_Fragment()).commit();
            }
        });
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone1=login_phone.getText().toString();
                String pass1=login_pass.getText().toString();
                viewModel.setUserData(phone1);
                boolean b=  dpHelper.userLoginhelper(phone1,pass1);
              if(b==true){

                 getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,new Profile_Fragment()).commit();

              }else{
                  Toast.makeText(getActivity(), "Error Ocurred", Toast.LENGTH_SHORT).show();
              }
            }
        });
        return v;
    }


}