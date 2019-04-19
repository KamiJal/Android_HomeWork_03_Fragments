package com.kamijal.home_work_03.viewholders;

import android.util.Log;
import android.view.View;

import com.kamijal.home_work_03.R;

import androidx.annotation.NonNull;

public class NotificationItemViewHolder extends BaseVideoItemViewHolder {

    public NotificationItemViewHolder(@NonNull View itemView) {
        super(itemView);

        this.preview = itemView.findViewById(R.id.item_notification_img_video_preview);
        this.channelOwnerLogo = itemView.findViewById(R.id.item_notification_img_channel_logo);
        this.moreActions = itemView.findViewById(R.id.item_notification_img_more_actions);
        this.additionalInfo = itemView.findViewById(R.id.item_notification_txt_uploaded_time);
        this.title = itemView.findViewById(R.id.item_notification_txt_title);

        Log.d(TAG, "VideoItemViewHolder: created.");
    }
}
