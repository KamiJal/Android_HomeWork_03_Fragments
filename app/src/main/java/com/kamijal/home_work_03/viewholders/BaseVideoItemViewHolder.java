package com.kamijal.home_work_03.viewholders;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class BaseVideoItemViewHolder extends BaseItemViewHolder {

    protected final String TAG;

    ImageView preview;
    ImageView channelOwnerLogo;
    ImageView moreActions;

    TextView title;
    TextView additionalInfo;

    BaseVideoItemViewHolder(@NonNull View itemView) {
        super(itemView);
        TAG = getClass().getSimpleName();
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
