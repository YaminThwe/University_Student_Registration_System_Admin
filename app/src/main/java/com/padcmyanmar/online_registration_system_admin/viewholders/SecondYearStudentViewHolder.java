package com.padcmyanmar.online_registration_system_admin.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMTextView;

public class SecondYearStudentViewHolder extends RecyclerView.ViewHolder {
    View view;
    private SecondYearStudentViewHolder.ClickListener mClickListener;

    public SecondYearStudentViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
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

    public void setData(Context context, String no, String rollNo, String name) {


        MMTextView number = view.findViewById(R.id.tvSecondYearNo);
        MMTextView roll = view.findViewById(R.id.tvRollNo);
        MMTextView Name = view.findViewById(R.id.tvStudentName);

        number.setText(no);
        roll.setText(rollNo);
        Name.setText(name);


    }


    public void setOnClickListener(SecondYearStudentViewHolder.ClickListener clickListener) {
        mClickListener = clickListener;
    }


}
