package com.padcmyanmar.online_registration_system_admin.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;
import com.padcmyanmar.online_registration_system_admin.VOs.FirstYearStudentInformationVO;
import com.padcmyanmar.online_registration_system_admin.viewholders.FirstYearArchiMajorApplyViewHolder;
import com.padcmyanmar.online_registration_system_admin.viewholders.FirstYearCivilMajorApplyViewHolder;

public class FirstYearArchiMajorApplyActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DatabaseReference databaseReference, databaseReference1, databaseReference2;
    Button button;
    EditText StudentNumber;
    int i = 0;
    String arr[];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year_archi_major_apply);
        button = findViewById(R.id.divideForArchi);
        StudentNumber = findViewById(R.id.etStudentNumberForArchi);

        databaseReference = FirebaseDatabase.getInstance().getReference("StudentInformation").child("FirstYear");
        databaseReference1 = FirebaseDatabase.getInstance().getReference("FirstYear2018").child("Archi");

        recyclerView = findViewById(R.id.recyclerviewforFirstArchi);
        layoutManager = new LinearLayoutManager(getParent());
        recyclerView.setLayoutManager(layoutManager);

        FirebaseRecyclerAdapter<FirstYearStudentInformationVO, FirstYearArchiMajorApplyViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<FirstYearStudentInformationVO, FirstYearArchiMajorApplyViewHolder>(
                        FirstYearStudentInformationVO.class,
                        R.layout.view_holder_first_year_archi_major_apply,
                        FirstYearArchiMajorApplyViewHolder.class,
                        databaseReference.orderByChild("firstName").equalTo("Archi")
                ) {
                    @Override
                    protected void populateViewHolder(final FirstYearArchiMajorApplyViewHolder viewHolder, final FirstYearStudentInformationVO model, int position) {

                        int marks = Integer.parseInt(model.getMarks());
                        String index = model.getKey();
                        i++;
                        viewHolder.setData(getApplicationContext(), model.getNo(), model.getStudentNameInMyanmar(), model.getMarks(), i);
                     /*   if (marks >= marks) {
                            databaseReference1.child(index).setValue(model.getStudentNameInMyanmar());
                        } else {
                            String SecondName = model.getSecondName();
                            databaseReference.child(index).setValue(model.setFirstName(SecondName));
                        } */
                    }
                };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
