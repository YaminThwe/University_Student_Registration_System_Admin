package com.padcmyanmar.online_registration_system_admin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMButton;

public class StudentListTableActivity extends AppCompatActivity implements View.OnClickListener {

    MMButton FirstIT, FirstEP, FirstEC, FirstMP, FirstMC, FirstArchi, FirstCivil,
            SecondIT, SecondEP, SecondEC, SecondMP, SecondMC, SecondArchi, SecondCivil,
            ThirdIT, ThirdEP, ThirdEC, ThirdMP, ThirdMC, ThirdCivil, ThirdArchi,
            FourthIT, FourthCivil, FourthEP, FourthEC, FourthMP, FourthMC, FourthArchi,
            FifthIT, FifthCivil, FifthArchi, FifthEP, FifthEC, FifthMP, FifthMC,
            SixthIT, SixthCivil, SixthMP, SixthMC, SixthEP, SixthEC, SixthArchi;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list_table);

        FirstArchi = findViewById(R.id.btnFirstArchi);
        FirstCivil = findViewById(R.id.btnFirstCivil);
        FirstMC = findViewById(R.id.btnFirstMC);
        FirstMP = findViewById(R.id.btnFirstMP);
        FirstEC = findViewById(R.id.btnFirstEC);
        FirstEP = findViewById(R.id.btnFirstEP);
        FirstIT = findViewById(R.id.btnFirstIT);

        SecondIT = findViewById(R.id.btnSecondIT);
        SecondEP = findViewById(R.id.btnSecondEP);
        SecondEC = findViewById(R.id.btnSecondEC);
        SecondMP = findViewById(R.id.btnSecondMP);
        SecondMC = findViewById(R.id.btnSecondMC);
        SecondArchi = findViewById(R.id.btnSecondArchi);
        SecondCivil = findViewById(R.id.btnSecondCivil);

        ThirdIT = findViewById(R.id.btnThirdIT);
        ThirdEP = findViewById(R.id.btnThirdEP);
        ThirdEC = findViewById(R.id.btnThirdEC);
        ThirdMP = findViewById(R.id.btnThirdMP);
        ThirdMC = findViewById(R.id.btnThirdMC);
        ThirdCivil = findViewById(R.id.btnThirdCivil);
        ThirdArchi = findViewById(R.id.btnThirdArchi);

        FourthIT = findViewById(R.id.btnFourthIT);
        FourthEP = findViewById(R.id.btnFourthEP);
        FourthEC = findViewById(R.id.btnFourthEC);
        FourthCivil = findViewById(R.id.btnFourthCivil);
        FourthMP = findViewById(R.id.btnFourthMP);
        FourthMC = findViewById(R.id.btnFourthMC);
        FourthArchi = findViewById(R.id.btnFourthArchi);

        FifthIT = findViewById(R.id.btnFifthIT);
        FifthEP = findViewById(R.id.btnFifthEP);
        FifthEC = findViewById(R.id.btnFifthEC);
        FifthCivil = findViewById(R.id.btnFifthCivil);
        FifthMP = findViewById(R.id.btnFifthMP);
        FifthMC = findViewById(R.id.btnFifthMC);
        FifthArchi = findViewById(R.id.btnFifthArchi);

        SixthIT = findViewById(R.id.btnSixthIT);
        SixthEP = findViewById(R.id.btnSixthEP);
        SixthEC = findViewById(R.id.btnSixthEC);
        SixthMP = findViewById(R.id.btnSixthMP);
        SixthMC = findViewById(R.id.btnSixthMC);
        SixthCivil = findViewById(R.id.btnSixthCivil);
        SixthArchi = findViewById(R.id.btnSixthArchi);

        FirstIT.setOnClickListener(this);
        FirstEP.setOnClickListener(this);
        FirstEC.setOnClickListener(this);
        FirstMC.setOnClickListener(this);
        FirstMP.setOnClickListener(this);
        FirstCivil.setOnClickListener(this);
        FirstArchi.setOnClickListener(this);

        SecondIT.setOnClickListener(this);
        SecondEP.setOnClickListener(this);
        SecondEC.setOnClickListener(this);
        SecondMP.setOnClickListener(this);
        SecondMC.setOnClickListener(this);
        SecondCivil.setOnClickListener(this);
        SecondArchi.setOnClickListener(this);

        ThirdIT.setOnClickListener(this);
        ThirdEP.setOnClickListener(this);
        ThirdEC.setOnClickListener(this);
        ThirdMP.setOnClickListener(this);
        ThirdMC.setOnClickListener(this);
        ThirdCivil.setOnClickListener(this);
        ThirdArchi.setOnClickListener(this);

        FourthIT.setOnClickListener(this);
        FourthEP.setOnClickListener(this);
        FourthEC.setOnClickListener(this);
        FourthMP.setOnClickListener(this);
        FourthMC.setOnClickListener(this);
        FourthCivil.setOnClickListener(this);
        FourthArchi.setOnClickListener(this);

        FifthIT.setOnClickListener(this);
        FifthEP.setOnClickListener(this);
        FifthEC.setOnClickListener(this);
        FifthMP.setOnClickListener(this);
        FifthMC.setOnClickListener(this);
        FifthCivil.setOnClickListener(this);
        FifthArchi.setOnClickListener(this);

        SixthIT.setOnClickListener(this);
        SixthEP.setOnClickListener(this);
        SixthEC.setOnClickListener(this);
        SixthMP.setOnClickListener(this);
        SixthMC.setOnClickListener(this);
        SixthCivil.setOnClickListener(this);
        SixthArchi.setOnClickListener(this);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSecondEP:
                Intent intent1 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent1.putExtra("tap", "SecondEP");
                startActivity(intent1);
                break;
            case R.id.btnSecondEC:
                Intent intent2 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent2.putExtra("tap", "SecondEC");
                startActivity(intent2);
                break;
            case R.id.btnSecondArchi:
                Intent intent3 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent3.putExtra("tap", "SecondArchi");
                startActivity(intent3);
                break;
            case R.id.btnSecondMC:
                Intent intent4 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent4.putExtra("tap", "SeocndMC");
                startActivity(intent4);
                break;
            case R.id.btnSecondMP:
                Intent intent5 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent5.putExtra("tap", "SecondMP");
                startActivity(intent5);
                break;
            case R.id.btnSecondCivil:
                Intent intent6 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent6.putExtra("tap", "SecondCivil");
                startActivity(intent6);
                break;
            case R.id.btnSecondIT:
                Intent intent7 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent7.putExtra("tap", "SecondIT");
                startActivity(intent7);
                break;

            case R.id.btnThirdCivil:
                Intent intent8 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent8.putExtra("tap", "ThirdCivil");
                startActivity(intent8);
                break;
            case R.id.btnThirdArchi:
                Intent intent = new Intent(getApplicationContext(), StudentListActivity.class);
                intent.putExtra("tap", "ThirdArchi");
                startActivity(intent);
                break;
            case R.id.btnThirdMC:
                Intent intent9 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent9.putExtra("tap", "ThirdMC");
                startActivity(intent9);
                break;
            case R.id.btnThirdMP:
                Intent intent10 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent10.putExtra("tap", "ThirdMP");
                startActivity(intent10);
                break;
            case R.id.btnThirdEP:
                Intent intent11 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent11.putExtra("tap", "ThirdEP");
                startActivity(intent11);
                break;
            case R.id.btnThirdEC:
                Intent intent12 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent12.putExtra("tap", "ThirdEC");
                startActivity(intent12);
                break;
            case R.id.btnThirdIT:
                Intent intent13 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent13.putExtra("tap", "ThirdIT");
                startActivity(intent13);
                break;

            case R.id.btnFourthArchi:
                Intent intent14 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent14.putExtra("tap", "FourthArchi");
                startActivity(intent14);
                break;
            case R.id.btnFourthCivil:
                Intent intent15 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent15.putExtra("tap", "FourthCivil");
                startActivity(intent15);
                break;
            case R.id.btnFourthEC:
                Intent intent16 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent16.putExtra("tap", "FourthEC");
                startActivity(intent16);
                break;
            case R.id.btnFourthEP:
                Intent intent17 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent17.putExtra("tap", "FourthEP");
                startActivity(intent17);
                break;
            case R.id.btnFourthIT:
                Intent intent18 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent18.putExtra("tap", "FourthIT");
                startActivity(intent18);
                break;
            case R.id.btnFourthMC:
                Intent intent19 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent19.putExtra("tap", "FourthMC");
                startActivity(intent19);
                break;
            case R.id.btnFourthMP:
                Intent intent20 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent20.putExtra("tap", "FourthMP");
                startActivity(intent20);
                break;
            case R.id.btnFifthArchi:
                Intent intent21 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent21.putExtra("tap", "FifthArchi");
                startActivity(intent21);
                break;
            case R.id.btnFifthCivil:
                Intent intent22 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent22.putExtra("tap", "FifthCivil");
                startActivity(intent22);
                break;
            case R.id.btnFifthEC:
                Intent intent23 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent23.putExtra("tap", "FifthEC");
                startActivity(intent23);
                break;
            case R.id.btnFifthEP:
                Intent intent24 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent24.putExtra("tap", "FifthEP");
                startActivity(intent24);
                break;
            case R.id.btnFifthIT:
                Intent intent25 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent25.putExtra("tap", "FifthIT");
                startActivity(intent25);
                break;
            case R.id.btnFifthMC:
                Intent intent26 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent26.putExtra("tap", "FifthMC");
                startActivity(intent26);
                break;
            case R.id.btnFifthMP:
                Intent intent27 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent27.putExtra("tap", "FifthMP");
                startActivity(intent27);
                break;
            case R.id.btnSixthArchi:
                Intent intent28 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent28.putExtra("tap", "SixthArchi");
                startActivity(intent28);
                break;
            case R.id.btnSixthCivil:
                Intent intent29 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent29.putExtra("tap", "SixthCivil");
                startActivity(intent29);
                break;
            case R.id.btnSixthEC:
                Intent intent30 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent30.putExtra("tap", "SixthEC");
                startActivity(intent30);
                break;
            case R.id.btnSixthEP:
                Intent intent31 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent31.putExtra("tap", "SixthEP");
                startActivity(intent31);
                break;
            case R.id.btnSixthIT:
                Intent intent32 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent32.putExtra("tap", "SixthIT");
                startActivity(intent32);
                break;
            case R.id.btnSixthMC:
                Intent intent33 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent33.putExtra("tap", "SixthMC");
                startActivity(intent33);
                break;
            case R.id.btnSixthMP:
                Intent intent34 = new Intent(getApplicationContext(), StudentListActivity.class);
                intent34.putExtra("tap", "SixthMP");
                startActivity(intent34);
                break;
        }
    }
}
