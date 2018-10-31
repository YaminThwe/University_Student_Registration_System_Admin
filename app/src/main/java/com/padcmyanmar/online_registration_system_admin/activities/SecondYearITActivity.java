package com.padcmyanmar.online_registration_system_admin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;
import com.padcmyanmar.online_registration_system_admin.VOs.SecondYearStudentVO;
import com.padcmyanmar.online_registration_system_admin.viewholders.SecondYearStudentViewHolder;

import org.mmtextview.components.MMButton;

public class SecondYearITActivity extends AppCompatActivity {

    DatabaseReference databaseReference;
    EditText etNo, etrollNo, etName;
    MMButton btnPost;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year_it);

        etNo = findViewById(R.id.etSecondYearStudentNo);
        etrollNo = findViewById(R.id.etSecondYearStudentRollNo);
        etName = findViewById(R.id.etSecondYearStudentName);
        btnPost = findViewById(R.id.btnPost);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getParent());
        recyclerView.setLayoutManager(layoutManager);



        String action = getIntent().getStringExtra("action");
        MajorDivision(action);

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = etNo.getText().toString();
                String rollNo = etrollNo.getText().toString();
                String name = etName.getText().toString();
                String id = databaseReference.push().getKey();
                SecondYearStudentVO secondYearStudentVO = new SecondYearStudentVO(no, name, rollNo,id);


                databaseReference.child(id).setValue(secondYearStudentVO);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<SecondYearStudentVO, SecondYearStudentViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<SecondYearStudentVO, SecondYearStudentViewHolder>(
                        SecondYearStudentVO.class,
                        R.layout.view_holder_second_year_list,
                        SecondYearStudentViewHolder.class,
                        databaseReference
                ) {
                    @Override
                    protected void populateViewHolder(SecondYearStudentViewHolder viewHolder, SecondYearStudentVO model, int position) {
                        viewHolder.setData(getApplicationContext(), model.getNo(), model.getRollNo(), model.getName());
                    }
                };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public void MajorDivision(String action) {
        switch (action) {
            case "SecondIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("IT");
                break;
            case "SecondCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("Civil");
                break;
            case "SecondEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("EC");
                break;
            case "SecondEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("EP");
                break;
            case "SecondArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("Archi");
                break;
            case "SecondMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("MP");
                break;
            case "SecondMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("MC");
                break;
            case "ThirdIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("IT");
                break;
            case "ThirdCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("Civil");
                break;
            case "ThirdEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("EC");
                break;
            case "ThirdEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("EP");
                break;
            case "ThirdArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("Archi");
                break;
            case "ThirdMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("MP");
                break;
            case "ThirdMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("MC");
                break;
            case "FourthIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("IT");
                break;
            case "FourthCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("Civil");
                break;
            case "FourthEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("EC");
                break;
            case "FourthEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("EP");
                break;
            case "FourthArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("Archi");
                break;
            case "FourthMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("MP");
                break;
            case "FourthMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("MC");
                break;
            case "FifthIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("IT");
                break;
            case "FifthCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("Civil");
                break;
            case "FifthEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("EC");
                break;
            case "FifthEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("EP");
                break;
            case "FifthArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("Archi");
                break;
            case "FifthMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("MP");
                break;
            case "FifthMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("MC");
                break;
            case "SixthIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("IT");
                break;
            case "SixthCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("Civil");
                break;
            case "SixthEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("EC");
                break;
            case "SixthEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("EP");
                break;
            case "SixthArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("Archi");
                break;
            case "SixthMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("MP");
                break;
            case "SixthMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("MC");
                break;
            default:
                setContentView(R.layout.activity_second_year_it);
        }


    }


}
