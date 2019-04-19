package com.kamijal.home_work_03.viewholders;

import android.util.Log;
import android.view.View;

import com.kamijal.home_work_03.R;

import androidx.annotation.NonNull;

public class VideoItemViewHolder extends BaseVideoItemViewHolder {

    public VideoItemViewHolder(@NonNull View itemView) {
        super(itemView);

        this.preview = itemView.findViewById(R.id.item_video_img_preview);
        this.channelOwnerLogo = itemView.findViewById(R.id.item_video_img_channel_owner_logo);
        this.moreActions = itemView.findViewById(R.id.item_video_img_more_actions);
        this.additionalInfo = itemView.findViewById(R.id.item_video_txt_additional_info);
        this.title = itemView.findViewById(R.id.item_video_txt_video_title);

        Log.d(TAG, "VideoItemViewHolder: created.");
    }
}
