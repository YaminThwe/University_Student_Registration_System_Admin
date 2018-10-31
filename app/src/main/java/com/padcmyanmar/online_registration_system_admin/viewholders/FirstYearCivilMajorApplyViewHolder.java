package com.padcmyanmar.online_registration_system_admin.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class FirstYearCivilMajorApplyViewHolder extends RecyclerView.ViewHolder {
    View view;
    private FirstYearCivilMajorApplyViewHolder.ClickListener mClickListener;


    public FirstYearCivilMajorApplyViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onItemClick(view,getAdapterPosition());
            }
        });
    }

    public interface ClickListener{
        void onItemClick(View view, int position);
    }

    public void setOnClickListener(FirstYearCivilMajorApplyViewHolder.ClickListener clickListener){
        mClickListener = clickListener;
    }

    public void setData(){}
}
