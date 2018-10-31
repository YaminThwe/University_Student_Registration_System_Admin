package com.padcmyanmar.online_registration_system_admin.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.online_registration_system_admin.R;

import org.mmtextview.components.MMTextView;

public class FirstYearStudentViewHolder extends RecyclerView.ViewHolder {

    View view;
    private FirstYearStudentViewHolder.ClickListener mClickListener;

    public FirstYearStudentViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public interface ClickListener{
        void onItemClick(View view,int position);
    }

    public void setData(Context context, String name, String marks){


    }

    public void setOnClickListener(FirstYearStudentViewHolder.ClickListener clickListener)
    {
        mClickListener = clickListener;
    }



}
