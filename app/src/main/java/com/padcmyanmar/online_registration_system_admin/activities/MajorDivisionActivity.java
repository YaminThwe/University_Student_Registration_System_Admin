package com.padcmyanmar.online_registration_system_admin.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.padcmyanmar.online_registration_system_admin.R;

public class MajorDivisionActivity extends AppCompatActivity {

    Button Civil, EP, EC, MP, MC, Archi, IT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_division);

        Civil = findViewById(R.id.btnCivilDivide);
        EP = findViewById(R.id.btnEPDivide);
        EC = findViewById(R.id.btnECDivide);
        MP = findViewById(R.id.btnMPDivide);
        MC = findViewById(R.id.btnMCDivide);
        Archi = findViewById(R.id.btnArchiDivide);
        IT = findViewById(R.id.btnITDivide);

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearCivilMajorApplyActivity.class);
                startActivity(intent);
            }
        });

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearEPMajorApplyActivity.class);
                startActivity(intent);
            }
        });

        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearECMajorApplyActivity.class);
                startActivity(intent);
            }
        });

        MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearMPMajorApplyActivity.class);
                startActivity(intent);
            }
        });

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearMCMajorApplyActivity.class);
                startActivity(intent);
            }
        });

        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearArchiMajorApplyActivity.class);
                startActivity(intent);
            }
        });

        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstYearITMajorApplyActivity.class);
                startActivity(intent);
            }
        });






    }
}
