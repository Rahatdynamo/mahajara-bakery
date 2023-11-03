package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Profile_Fragment extends Fragment {

    TextView profile_name;
    TextView profile_email;
    TextView profile_phone;
    DpHelper dbHelper;
    Button profile_button;
    Button profile_btn_edit;
    private SharedViewModel viewModel;
    UserModal userModal;
    Bundle bundle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile, container, false);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        profile_name=v.findViewById(R.id.profile_name);
        profile_button=v.findViewById(R.id.profile_button);
        profile_email=v.findViewById(R.id. profile_email);
        profile_phone=v.findViewById(R.id.profile_phone);
        profile_btn_edit=v.findViewById(R.id.profile_btn_edit);

        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.LogOutSession();
                getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,new Login_fragment()).commit();
            }
        });

       getUserDetails();
        profile_btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditProfile();
            }
        });
        return v;
    }
    public void getUserDetails(){
        String userData = viewModel.getUserData();
        dbHelper=new DpHelper(getActivity());
        ArrayList<UserModal> al=dbHelper.getLoggedinUserDetails(userData);
         userModal=al.get(0);
        profile_name.setText(userModal.getName());
        profile_email.setText(userModal.getEmail());
        profile_phone.setText("+91"+userModal.getPhone());
    }
    public void EditProfile(){
        bundle=new Bundle();
        bundle.putString("User_Name_Key",userModal.getName());
        bundle.putString("User_Email_Key",userModal.getEmail());
        bundle.putString("User_Phone_Key",userModal.getPhone());
        Fragment fragment=new edit_profile();
        fragment.setArguments(bundle);
        getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,fragment).commit();
    }

}