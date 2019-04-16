package com.kamijal.home_work_03.viewholders;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kamijal.home_work_03.R;

import androidx.annotation.NonNull;

public class ChannelItemViewHolder extends BaseItemViewHolder {

    private static final String TAG = "ChannelItemViewHolder";

    private final ImageView channelOwnerLogo;
    private final TextView title;

    public ChannelItemViewHolder(@NonNull View itemView) {
        super(itemView);

        this.channelOwnerLogo = itemView.findViewById(R.id.item_channel_logo);
        this.title = itemView.findViewById(R.id.item_channel_text);

        Log.d(TAG, "ChannelItemViewHolder: created.");
    }

    public void setTitle(final String title) {
        this.title.setText(title);
    }

    public void setChannelOwnerLogo(int resId) {
        this.channelOwnerLogo.setImageResource(resId);
    }
}
