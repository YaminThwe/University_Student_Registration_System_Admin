package com.padcmyanmar.online_registration_system_admin.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;
import com.padcmyanmar.online_registration_system_admin.VOs.VerifyVO;

import org.mmtextview.components.MMButton;
import org.mmtextview.components.MMProgressDialog;

import java.util.concurrent.TimeUnit;

public class FragmentForFirstYear extends Fragment {

    DatabaseReference databaseReference;
    MMProgressDialog progressDialog;

    EditText etNumber,etTenthNumber,etName,etNRCNumber,etMarks,etPhoneNumber;
    MMButton btnPostForFirstYear;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_first_year, container, false);

        databaseReference = FirebaseDatabase.getInstance().getReference("verifyPhoneNumber");

        etNumber = v.findViewById(R.id.etNumber);
        etTenthNumber = v.findViewById(R.id.etTenthNumber);
        etName= v.findViewById(R.id.etStudentName);
        etNRCNumber = v.findViewById(R.id.etNRCnumber);
        etMarks = v.findViewById(R.id.etMarks);
        etPhoneNumber = v.findViewById(R.id.etPhoneNumber);
        btnPostForFirstYear = v.findViewById(R.id.btnPostForFirstYear);

        progressDialog = new MMProgressDialog(getContext());

        btnPostForFirstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNo = etPhoneNumber.getText().toString();

                VerifyVO verifyVO = new VerifyVO(phoneNo);

                databaseReference.setValue(verifyVO);
            }
        });

        return v;
    }



}
