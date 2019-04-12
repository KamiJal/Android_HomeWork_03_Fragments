package com.kamijal.home_work_03.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.viewholders.BaseItemViewHolder;
import com.kamijal.home_work_03.viewholders.VideoItemViewHolder;
import com.kamijal.home_work_03.models.Video;

import androidx.annotation.NonNull;

public class VideoItemViewAdapter extends BaseAdapter<Video> {

    public VideoItemViewAdapter() {
        Log.d(TAG, "Constructor: called.");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseItemViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called; position: " + position + ".");

        ((VideoItemViewHolder) holder).setTitle(dataSet.get(position).getTitle());
        ((VideoItemViewHolder) holder).setAdditionalInfo(dataSet.get(position).getAdditionalInfo());
        ((VideoItemViewHolder) holder).setPreviewImage(dataSet.get(position).getPreviewResId());
        ((VideoItemViewHolder) holder).setChannelOwnerLogo(dataSet.get(position).getChannelLogoResId());
        ((VideoItemViewHolder) holder).setMoreActions();
    }

    @NonNull
    @Override
    public BaseItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: called.");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, parent, false);
        return new VideoItemViewHolder(view);
    }


}
