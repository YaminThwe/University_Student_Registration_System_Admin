package com.padcmyanmar.online_registration_system_admin.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.padcmyanmar.online_registration_system_admin.R;
import com.padcmyanmar.online_registration_system_admin.fragments.FragmentForFifthYear;
import com.padcmyanmar.online_registration_system_admin.fragments.FragmentForFirstYear;
import com.padcmyanmar.online_registration_system_admin.fragments.FragmentForFourthYear;
import com.padcmyanmar.online_registration_system_admin.fragments.FragmentForSecondYear;
import com.padcmyanmar.online_registration_system_admin.fragments.FragmentForSixthYear;
import com.padcmyanmar.online_registration_system_admin.fragments.FragmentForThirdYear;

public class RegisterControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_control);
        final android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        int action_type = getIntent().getIntExtra("action_type", 1111);

        if (action_type == 1111) {

            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentForFirstYear f1 = new FragmentForFirstYear();
            fragmentTransaction.replace(R.id.flContainer, f1);
            fragmentTransaction.commit();
        }

        if (action_type == 2222) {

            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentForSecondYear f1 = new FragmentForSecondYear();
            fragmentTransaction.replace(R.id.flContainer, f1);
            fragmentTransaction.commit();

        }

        if (action_type == 3333) {


            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentForThirdYear f1 = new FragmentForThirdYear();
            fragmentTransaction.replace(R.id.flContainer, f1);
            fragmentTransaction.commit();
        }

        if (action_type == 1234) {


            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentForFourthYear f1 = new FragmentForFourthYear();
            fragmentTransaction.replace(R.id.flContainer, f1);
            fragmentTransaction.commit();
        }

        if (action_type == 4321) {

            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentForFifthYear f1 = new FragmentForFifthYear();
            fragmentTransaction.replace(R.id.flContainer, f1);
            fragmentTransaction.commit();
        }

        if (action_type == 1122) {

            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentForSixthYear f1 = new FragmentForSixthYear();
            fragmentTransaction.replace(R.id.flContainer, f1);
            fragmentTransaction.commit();
        }


    }

}
