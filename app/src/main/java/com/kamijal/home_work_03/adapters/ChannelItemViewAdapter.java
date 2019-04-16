package com.kamijal.home_work_03.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.models.Channel;
import com.kamijal.home_work_03.viewholders.BaseItemViewHolder;
import com.kamijal.home_work_03.viewholders.ChannelItemViewHolder;

import androidx.annotation.NonNull;

public class ChannelItemViewAdapter extends BaseAdapter<Channel> {

    public ChannelItemViewAdapter() {
        Log.d(TAG, "Constructor: called.");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseItemViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called; position: " + position + ".");

        ((ChannelItemViewHolder) holder).setTitle(dataSet.get(position).getTitle());
        ((ChannelItemViewHolder) holder).setChannelOwnerLogo(dataSet.get(position).getChannelLogoResId());
    }

    @NonNull
    @Override
    public BaseItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: called.");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_channel, parent, false);
        return new ChannelItemViewHolder(view);
    }
}
