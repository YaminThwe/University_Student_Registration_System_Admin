package com.padcmyanmar.online_registration_system_admin.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.online_registration_system_admin.R;
import com.padcmyanmar.online_registration_system_admin.activities.SecondYearITActivity;

import org.mmtextview.components.MMButton;

public class FragmentForThirdYear extends Fragment {
    MMButton IT, Civil, EP, EC, Archi, MP, MC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_third_year, container, false);

        IT = v.findViewById(R.id.btnThirdYearIT);
        Civil = v.findViewById(R.id.btnThirdYearCivil);
        EP = v.findViewById(R.id.btnThirdYearEP);
        EC = v.findViewById(R.id.btnThirdYearEC);
        Archi = v.findViewById(R.id.btnThirdYearArchi);
        MP = v.findViewById(R.id.btnThirdYearMP);
        MC = v.findViewById(R.id.btnThirdYearMC);

        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdIT");
                startActivity(intent);
            }
        });

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdCivil");
                startActivity(intent);
            }
        });

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdEP");
                startActivity(intent);
            }
        });

        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdEC");
                startActivity(intent);
            }
        });

        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdArchi");
                startActivity(intent);
            }
        });

        MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdMP");
                startActivity(intent);
            }
        });

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "ThirdMC");
                startActivity(intent);
            }
        });


        return v;
    }
}
