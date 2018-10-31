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

public class FragmentForSixthYear extends Fragment {
    MMButton IT, Civil, EP, EC, Archi, MP, MC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_sixth_year, container, false);

        IT = v.findViewById(R.id.btnSixthYearIT);
        Civil = v.findViewById(R.id.btnSixthYearCivil);
        EP = v.findViewById(R.id.btnSixthYearEP);
        EC = v.findViewById(R.id.btnSixthYearEC);
        Archi = v.findViewById(R.id.btnSixthYearArchi);
        MP = v.findViewById(R.id.btnSixthYearMP);
        MC = v.findViewById(R.id.btnSixthYearMC);

        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthIT");
                startActivity(intent);
            }
        });

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthCivil");
                startActivity(intent);
            }
        });

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthEP");
                startActivity(intent);
            }
        });

        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthEC");
                startActivity(intent);
            }
        });

        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthArchi");
                startActivity(intent);
            }
        });

        MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthMP");
                startActivity(intent);
            }
        });

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SixthMC");
                startActivity(intent);
            }
        });


        return v;
    }
}
