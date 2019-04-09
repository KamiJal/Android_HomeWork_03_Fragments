package com.kamijal.home_work_03.adapters;

import com.kamijal.home_work_03.viewholders.BaseItemViewHolder;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseItemViewHolder> {

    protected List<T> dataSet;

    BaseAdapter(List<T> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
