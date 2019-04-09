package com.kamijal.home_work_03.viewholders;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

abstract class BaseItemViewHolder extends RecyclerView.ViewHolder {

    private final Context context;

    BaseItemViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
    }
}
