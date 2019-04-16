package com.kamijal.home_work_03.models;

public class Channel {
    private String title;
    private int channelLogoResId;

    public Channel(String title, int channelLogoResId) {
        this.title = title;
        this.channelLogoResId = channelLogoResId;
    }

    public String getTitle() {
        return title;
    }

    public int getChannelLogoResId() {
        return channelLogoResId;
    }
}
