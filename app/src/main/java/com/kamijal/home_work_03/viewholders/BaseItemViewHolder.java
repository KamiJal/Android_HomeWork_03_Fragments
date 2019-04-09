package com.kamijal.home_work_03.viewholders;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseItemViewHolder extends RecyclerView.ViewHolder {

    protected final Context context;

    public BaseItemViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
    }
}
