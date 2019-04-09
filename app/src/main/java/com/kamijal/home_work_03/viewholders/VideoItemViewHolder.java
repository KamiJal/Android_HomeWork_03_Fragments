package com.kamijal.home_work_03.viewholders;

import android.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kamijal.home_work_03.R;

import androidx.annotation.NonNull;

public class VideoItemViewHolder extends BaseItemViewHolder {

    private static final String TAG = "VideoItemViewHolder";

    private final ImageView preview;
    private final ImageView channelOwnerLogo;
    private final ImageView moreActions;

    private final TextView title;
    private final TextView additionalInfo;

    public VideoItemViewHolder(@NonNull View itemView) {
        super(itemView);

        this.preview = itemView.findViewById(R.id.item_video_img_preview);
        this.channelOwnerLogo = itemView.findViewById(R.id.item_video_img_channel_owner_logo);
        this.moreActions = itemView.findViewById(R.id.item_video_img_more_actions);
        this.additionalInfo = itemView.findViewById(R.id.item_video_txt_additional_info);
        this.title = itemView.findViewById(R.id.item_video_txt_video_title);

        Log.d(TAG, "VideoItemViewHolder: created.");
    }

    public void setTitle(final String title) {
        this.title.setText(title);
    }

    public void setAdditionalInfo(final String additionalInfo) {
        this.additionalInfo.setText(additionalInfo);
    }

    public void setMoreActions() {
        this.moreActions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(context)
                        .setTitle(title.getText().toString())
                        .setMessage("more actions")
                        .setCancelable(true)
                        .create().show();
            }
        });
    }

    public void setChannelOwnerLogo(int resId) {
        this.channelOwnerLogo.setImageResource(resId);
    }

    public void setPreviewImage(int resId) {
        this.preview.setImageResource(resId);
    }


}
