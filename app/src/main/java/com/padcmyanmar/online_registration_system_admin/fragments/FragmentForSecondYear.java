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

public class FragmentForSecondYear extends Fragment {

    MMButton IT, Civil, EP, EC, Archi, MP, MC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_second_year, container, false);

        IT = v.findViewById(R.id.btnSecondYearIT);
        Civil = v.findViewById(R.id.btnSecondYearCivil);
        EP = v.findViewById(R.id.btnSecondYearEP);
        EC = v.findViewById(R.id.btnSecondYearEC);
        Archi = v.findViewById(R.id.btnSecondYearArchi);
        MP = v.findViewById(R.id.btnSecondYearMP);
        MC = v.findViewById(R.id.btnSecondYearMC);


        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondIT");
                startActivity(intent);
            }
        });

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondCivil");
                startActivity(intent);
            }
        });

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondEP");
                startActivity(intent);
            }
        });

        EC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondEC");
                startActivity(intent);
            }
        });

        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondArchi");
                startActivity(intent);
            }
        });

        MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondMP");
                startActivity(intent);
            }
        });

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SecondYearITActivity.class);
                intent.putExtra("action", "SecondMC");
                startActivity(intent);
            }
        });

        return v;
    }


}
