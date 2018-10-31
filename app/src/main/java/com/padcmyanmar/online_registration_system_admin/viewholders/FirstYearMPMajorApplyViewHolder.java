package com.padcmyanmar.online_registration_system_admin.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMTextView;

public class FirstYearMPMajorApplyViewHolder extends RecyclerView.ViewHolder {
    View view;
    private FirstYearMPMajorApplyViewHolder.ClickListener mClickListener;

    DatabaseReference databaseReference;


    public FirstYearMPMajorApplyViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        databaseReference = FirebaseDatabase.getInstance().getReference("FirstYear2018").child("MP");

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onItemClick(view, getAdapterPosition());
            }
        });
    }

    public interface ClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnClickListener(FirstYearMPMajorApplyViewHolder.ClickListener clickListener) {
        mClickListener = clickListener;
    }

    public void setData(Context context, String No, String Name, String Marks, int i) {

        MMTextView Number = view.findViewById(R.id.tvMpNo);
        MMTextView name = view.findViewById(R.id.tvMPName);
        MMTextView marks = view.findViewById(R.id.tvMPMarks);
        Number.setText(String.valueOf(i));
        name.setText(Name);
        marks.setText(Marks);

    }


}
