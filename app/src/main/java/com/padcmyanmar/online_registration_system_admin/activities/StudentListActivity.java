package com.padcmyanmar.online_registration_system_admin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;
import com.padcmyanmar.online_registration_system_admin.VOs.SecondYearStudentVO;
import com.padcmyanmar.online_registration_system_admin.viewholders.SecondYearStudentViewHolder;

public class StudentListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DatabaseReference databaseReference;
    String year, major;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        String anction = getIntent().getStringExtra("tap");

        String arr[] = MajorDivision(anction);
        year = arr[0];
        major = arr[1];


        recyclerView = findViewById(R.id.recyclerView1);
        layoutManager = new LinearLayoutManager(getParent());
        recyclerView.setLayoutManager(layoutManager);
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

                    @Override
                    public SecondYearStudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                        SecondYearStudentViewHolder secondYearStudentViewHolder = super.onCreateViewHolder(parent, viewType);
                        secondYearStudentViewHolder.setOnClickListener(new SecondYearStudentViewHolder.ClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent intent = new Intent(view.getContext(), StudentListDetailActivity.class);
                                startActivity(intent);
                            }
                        });
                        return secondYearStudentViewHolder;
                    }
                };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public String[] MajorDivision(String action) {

        String[] ref = new String[3];

        switch (action) {
            case "SecondIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("IT");
                ref[0] = "SecondYear";
                ref[1] = "IT";
                break;
            case "SecondEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("EP");
                ref[0] = "SecondYear";
                ref[1] = "EP";
                break;
            case "SecondEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("EC");
                ref[0] = "SecondYear";
                ref[1] = "EC";
                break;
            case "SecondMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("MP");
                ref[0] = "SecondYear";
                ref[1] = "MP";
                break;
            case "SecondMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("MC");
                ref[0] = "SecondYear";
                ref[1] = "MC";
                break;
            case "SecondCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("Civil");
                ref[0] = "SecondYear";
                ref[1] = "Civil";
                break;
            case "SecondArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SecondYear").child("Archi");
                ref[0] = "SecondYear";
                ref[1] = "Archi";
                break;

            case "ThirdIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("IT");
                ref[0] = "ThirdYear";
                ref[1] = "IT";
                break;
            case "ThirdEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("EP");
                ref[0] = "ThirdYear";
                ref[1] = "EP";
                break;
            case "ThirdEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("EC");
                ref[0] = "ThirdYear";
                ref[1] = "EC";
                break;
            case "ThirdMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("MP");
                ref[0] = "ThirdYear";
                ref[1] = "MP";
                break;
            case "ThirdMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("MC");
                ref[0] = "ThirddYear";
                ref[1] = "MC";
                break;
            case "ThirdCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("Civil");
                ref[0] = "ThirdYear";
                ref[1] = "Civil";
                break;
            case "ThirdArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("ThirdYear").child("Archi");
                ref[0] = "ThirdYear";
                ref[1] = "Archi";
                break;

            case "FourthIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("IT");
                ref[0] = "FourthYear";
                ref[1] = "IT";
                break;
            case "FourthEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("EP");
                ref[0] = "FourthYear";
                ref[1] = "EP";
                break;
            case "FourthEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("EC");
                ref[0] = "FourthYear";
                ref[1] = "EC";
                break;
            case "FourthMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("MP");
                ref[0] = "FourthYear";
                ref[1] = "MP";
                break;
            case "FourthMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("MC");
                ref[0] = "FourthYear";
                ref[1] = "MC";
                break;
            case "FourthCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("Civil");
                ref[0] = "FourthYear";
                ref[1] = "Civil";
                break;
            case "FourthArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FourthYear").child("Archi");
                ref[0] = "FourthYear";
                ref[1] = "Archi";
                break;

            case "FifthIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("IT");
                ref[0] = "FifthYear";
                ref[1] = "IT";
                break;
            case "FifthEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("EP");
                ref[0] = "FifthYear";
                ref[1] = "EP";
                break;
            case "FifthEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("EC");
                ref[0] = "FifthYear";
                ref[1] = "EC";
                break;
            case "FifthMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("MP");
                ref[0] = "FifthYear";
                ref[1] = "MP";
                break;
            case "FifthMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("MC");
                ref[0] = "FifthYear";
                ref[1] = "MC";
                break;
            case "FifthCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("Civil");
                ref[0] = "FifthYear";
                ref[1] = "Civil";
                break;
            case "FifthArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FifthYear").child("Archi");
                ref[0] = "FifthYear";
                ref[1] = "Archi";
                break;

            case "SixthIT":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("IT");
                ref[0] = "SixthYear";
                ref[1] = "IT";
                break;
            case "SixthEP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("EP");
                ref[0] = "SixthYear";
                ref[1] = "EP";
                break;
            case "SixthEC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("EC");
                ref[0] = "SixthYear";
                ref[1] = "EC";
                break;
            case "SixthMP":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("MP");
                ref[0] = "SixthYear";
                ref[1] = "MP";
                break;
            case "SixthMC":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("MC");
                ref[0] = "SixthYear";
                ref[1] = "MC";
                break;
            case "SixthCivil":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("Civil");
                ref[0] = "SixthYear";
                ref[1] = "Civil";
                break;
            case "SixthArchi":
                databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("SixthYear").child("Archi");
                ref[0] = "SixthYear";
                ref[1] = "Archi";
                break;
        }
        return ref;
    }
}
