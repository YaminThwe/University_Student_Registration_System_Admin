package com.padcmyanmar.online_registration_system_admin.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMButton;

public class RegisterActivity extends AppCompatActivity {

    MMButton btnFirst, btnSecond, btnThird, btnFourth, btnFifth, btnSixth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnFirst = findViewById(R.id.btnForFirstYear);
        btnSecond = findViewById(R.id.btnForSecondYear);
        btnThird = findViewById(R.id.btnForThirdYear);
        btnFourth = findViewById(R.id.btnForForthYear);
        btnFifth = findViewById(R.id.btnforFifthYear);
        btnSixth = findViewById(R.id.btnForSixthYear);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterControlActivity.class);
                intent.putExtra("action_type",1111);
                startActivity(intent);
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterControlActivity.class);
                intent.putExtra("action_type",2222);
                startActivity(intent);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterControlActivity.class);
                intent.putExtra("action_type",3333);
                startActivity(intent);
            }
        });

        btnFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterControlActivity.class);
                intent.putExtra("action_type",1234);
                startActivity(intent);
            }
        });

        btnFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterControlActivity.class);
                intent.putExtra("action_type",4321);
                startActivity(intent);
            }
        });

        btnSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterControlActivity.class);
                intent.putExtra("action_type",1122);
                startActivity(intent);
            }
        });










    }
}
