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

public class FragmentForFifthYear extends Fragment {
    MMButton IT, Civil, EP, EC, Archi, MP, MC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_fifth_year, container, false);

        IT = v.findViewById(R.id.btnFifthYearIT);
        Civil = v.findViewById(R.id.btnFifthYearCivil);
        EP = v.findViewById(R.id.btnFifthYearEP);
        EC = v.findViewById(R.id.btnFifthYearEC);
        Archi = v.findViewById(R.id.btnFifthYearArchi);
        MP = v.findViewById(R.id.btnFifthYearMP);
        MC = v.findViewById(R.id.btnFifthYearMC);

        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthIT");
                startActivity(intent);
            }
        });

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthCivil");
                startActivity(intent);
            }
        });

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthEP");
                startActivity(intent);
            }
        });

        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthEC");
                startActivity(intent);
            }
        });

        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthArchi");
                startActivity(intent);
            }
        });

        MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthMP");
                startActivity(intent);
            }
        });

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "FifthMC");
                startActivity(intent);
            }
        });


        return v;
    }
}
