package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class edit_profile extends Fragment {

EditText edit_profile_name,edit_profile_email,edit_profile_phone;
DpHelper dpHelper;
Button edit_profile_button;
private SharedViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_edit_profile, container, false);
        edit_profile_name=v.findViewById(R.id.edit_profile_name);
        edit_profile_email=v.findViewById(R.id.edit_profile_email);
        edit_profile_phone=v.findViewById(R.id.edit_profile_phone);
        edit_profile_button=v.findViewById(R.id.edit_profile_button);
        dpHelper=new DpHelper(getActivity());
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        Bundle bundle=this.getArguments();
        edit_profile_name.setText(bundle.getString("User_Name_Key"));
        edit_profile_email.setText(bundle.getString("User_Email_Key"));
        edit_profile_phone.setText(bundle.getString("User_Phone_Key"));
        edit_profile_phone.setEnabled(false);
        String phone1=edit_profile_phone.getText().toString();


        edit_profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setUserData(phone1);

                updateUserDetails();
                getParentFragmentManager().beginTransaction().replace(R.id.user_account_fl,new Profile_Fragment()).commit();
            }
        });


        return v;
    }
    public void updateUserDetails(){
        String name1=edit_profile_name.getText().toString();
        String email1=edit_profile_email.getText().toString();
        String phone1=edit_profile_phone.getText().toString();
        boolean b=dpHelper.UpdateUserDetail(email1,name1,phone1);
        if(b){
            Toast.makeText(getActivity(), "Details  Updated", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getActivity(), "some Error Occured", Toast.LENGTH_SHORT).show();
        }

    }
}