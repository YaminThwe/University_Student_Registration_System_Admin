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

public class FragmentForFourthYear extends Fragment {
    MMButton IT, Civil, EP, EC, Archi, MP, MC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_fourth_year, container, false);

        IT = v.findViewById(R.id.btnFourthYearIT);
        Civil = v.findViewById(R.id.btnFourthYearCivil);
        EP = v.findViewById(R.id.btnFourthYearEP);
        EC = v.findViewById(R.id.btnFourthYearEC);
        Archi = v.findViewById(R.id.btnFourthYearArchi);
        MP = v.findViewById(R.id.btnFourthYearMP);
        MC = v.findViewById(R.id.btnFourthYearMC);


        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthIT");
                startActivity(intent);
            }
        });

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthCivil");
                startActivity(intent);
            }
        });

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthEP");
                startActivity(intent);
            }
        });

        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthEC");
                startActivity(intent);
            }
        });

        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthArchi");
                startActivity(intent);
            }
        });

        MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthMP");
                startActivity(intent);
            }
        });

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FourthMC");
                startActivity(intent);
            }
        });


        return v;
    }
}
