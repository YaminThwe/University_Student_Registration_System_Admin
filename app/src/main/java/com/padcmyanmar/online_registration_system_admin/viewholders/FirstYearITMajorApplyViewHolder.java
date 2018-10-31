package com.padcmyanmar.online_registration_system_admin.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMTextView;

public class FirstYearITMajorApplyViewHolder extends RecyclerView.ViewHolder {
    View view;
    private FirstYearITMajorApplyViewHolder.ClickListener mClickListener;

    DatabaseReference databaseReference;


    public FirstYearITMajorApplyViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        databaseReference = FirebaseDatabase.getInstance().getReference("FirstYear2018").child("IT");

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

    public void setOnClickListener(FirstYearITMajorApplyViewHolder.ClickListener clickListener) {
        mClickListener = clickListener;
    }

    public void setData(Context context, String No, String Name, String Marks, int i) {

        MMTextView Number = view.findViewById(R.id.tvITNo);
        MMTextView name = view.findViewById(R.id.tvITName);
        MMTextView marks = view.findViewById(R.id.tvITMarks);
        Number.setText(String.valueOf(i));
        name.setText(Name);
        marks.setText(Marks);

    }


}
