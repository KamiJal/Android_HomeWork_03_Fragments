package com.kamijal.home_work_03.models;

public class Video {
    private String title;
    private String additionalInfo;
    private int previewResId;
    private int channelLogoResId;

    public Video(String title, String additionalInfo, int previewResId, int channelLogoResId) {
        this.title = title;
        this.additionalInfo = additionalInfo;
        this.previewResId = previewResId;
        this.channelLogoResId = channelLogoResId;
    }

    public String getTitle() {
        return title;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public int getPreviewResId() {
        return previewResId;
    }

    public int getChannelLogoResId() {
        return channelLogoResId;
    }
}
