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

public class VideoItemViewAdapter extends BaseVideoAdapter {

    public VideoItemViewAdapter() {
        Log.d(TAG, "Constructor: called.");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseItemViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called; position: " + position + ".");

        String delimiter = " • ";
        Video video = dataSet.get(position);

        ((VideoItemViewHolder) holder).setTitle(video.getTitle());
        ((VideoItemViewHolder) holder).setAdditionalInfo(video.getChannel().getTitle() + delimiter + video.getNumberOfViews() + delimiter + video.getPostedTime());
        ((VideoItemViewHolder) holder).setPreviewImage(video.getPreviewResId());
        ((VideoItemViewHolder) holder).setChannelOwnerLogo(video.getChannel().getChannelLogoResId());
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
