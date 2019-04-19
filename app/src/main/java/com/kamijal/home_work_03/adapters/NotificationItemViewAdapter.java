package com.kamijal.home_work_03.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.models.Video;
import com.kamijal.home_work_03.viewholders.BaseItemViewHolder;
import com.kamijal.home_work_03.viewholders.NotificationItemViewHolder;

import androidx.annotation.NonNull;

public class NotificationItemViewAdapter extends BaseVideoAdapter {

    public NotificationItemViewAdapter() {
        Log.d(TAG, "Constructor: called.");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseItemViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called; position: " + position + ".");

        Video video = dataSet.get(position);

        ((NotificationItemViewHolder) holder).setTitle(video.getChannel().getTitle() + " uploaded: " + video.getTitle());
        ((NotificationItemViewHolder) holder).setAdditionalInfo(video.getPostedTime());
        ((NotificationItemViewHolder) holder).setPreviewImage(video.getPreviewResId());
        ((NotificationItemViewHolder) holder).setChannelOwnerLogo(video.getChannel().getChannelLogoResId());
        ((NotificationItemViewHolder) holder).setMoreActions();
    }

    @NonNull
    @Override
    public BaseItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: called.");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification, parent, false);
        return new NotificationItemViewHolder(view);
    }
}
