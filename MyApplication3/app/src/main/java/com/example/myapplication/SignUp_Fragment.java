package com.example.myapplication;

import android.content.Intent;
import android.media.MediaParser;
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


public class SignUp_Fragment extends Fragment {
    View v;
    TextView login_tv;
    EditText signUp_name,signUp_email,signUp_phone,signUp_pass;
    Button signUp_button;
    DpHelper dpHelper;
    private SharedViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_sign_up_, container, false);
        login_tv=v.findViewById(R.id.Login_tv);
        signUp_name=v.findViewById(R.id.signUp_name);
        signUp_email=v.findViewById(R.id.signUp_email);
        signUp_phone=v.findViewById(R.id.signUp_phone);
        signUp_pass=v.findViewById(R.id.signUp_pass);
        signUp_button=v.findViewById(R.id.signUp_button);
        dpHelper=new DpHelper(getActivity());
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        signUp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String name1=signUp_name.getText().toString();
              String email1=signUp_email.getText().toString();
              String phone1=signUp_phone.getText().toString();
              String pass1=signUp_pass.getText().toString();
                viewModel.setUserData(phone1);
                boolean b1=dpHelper.checkPhoneExist(phone1);
                if(b1){
                    Toast.makeText(getActivity(), "PhoneNo is already register", Toast.LENGTH_SHORT).show();
                }else{

                    boolean b=  dpHelper.userSignUphelper(name1,email1,phone1,pass1);


                    if(b==true){

                        getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,new Profile_Fragment()).commit();
                    }
                    else{
                        Toast.makeText(getActivity(), "Error occured", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


        login_tv.setClickable(true);
        login_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,new Login_fragment()).commit();
            }
        });
        return v;
    }


}