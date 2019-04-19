package com.kamijal.home_work_03.models;

public class Video {
    private String title;
    private String postedTime;
    private String numberOfViews;
    private int previewResId;
    private Channel channel;

    public Video(String title, String postedTime, String numberOfViews, int previewResId, Channel channel) {
        this.title = title;
        this.postedTime = postedTime;
        this.numberOfViews = numberOfViews;
        this.previewResId = previewResId;
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }

    public String getPostedTime() {
        return postedTime;
    }

    public String getNumberOfViews() {
        return numberOfViews;
    }

    public int getPreviewResId() {
        return previewResId;
    }

    public Channel getChannel() {
        return channel;
    }
}
