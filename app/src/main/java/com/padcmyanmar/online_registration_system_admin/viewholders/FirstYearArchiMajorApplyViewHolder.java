package com.padcmyanmar.online_registration_system_admin.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMTextView;

public class FirstYearArchiMajorApplyViewHolder extends RecyclerView.ViewHolder {
    View view;
    private FirstYearArchiMajorApplyViewHolder.ClickListener mClickListener;

    DatabaseReference databaseReference;


    public FirstYearArchiMajorApplyViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        databaseReference = FirebaseDatabase.getInstance().getReference("FirstYear2018").child("Archi");

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

    public void setOnClickListener(FirstYearArchiMajorApplyViewHolder.ClickListener clickListener) {
        mClickListener = clickListener;
    }

    public void setData(Context context, String No, String Name, String Marks, int i) {

        MMTextView Number = view.findViewById(R.id.tvArchiNo);
        MMTextView name = view.findViewById(R.id.tvArchiName);
        MMTextView marks = view.findViewById(R.id.tvArchiMarks);
        Number.setText(String.valueOf(i));
        name.setText(Name);
        marks.setText(Marks);

    }


}
