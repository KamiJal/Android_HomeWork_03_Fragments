package com.kamijal.home_work_03.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.models.Video;
import com.kamijal.home_work_03.viewholders.BaseItemViewHolder;
import com.kamijal.home_work_03.viewholders.LibraryVideoItemViewHolder;

import androidx.annotation.NonNull;

public class LibraryVideoItemViewAdapter extends BaseVideoAdapter {

    public LibraryVideoItemViewAdapter() {
        Log.d(TAG, "Constructor: called.");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseItemViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called; position: " + position + ".");

        Video video = dataSet.get(position);

        ((LibraryVideoItemViewHolder) holder).setTitle(video.getTitle());
        ((LibraryVideoItemViewHolder) holder).setAdditionalInfo(video.getChannel().getTitle());
        ((LibraryVideoItemViewHolder) holder).setPreviewImage(video.getPreviewResId());
        ((LibraryVideoItemViewHolder) holder).setMoreActions();
    }

    @NonNull
    @Override
    public BaseItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: called.");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_library, parent, false);
        return new LibraryVideoItemViewHolder(view);
    }


}
