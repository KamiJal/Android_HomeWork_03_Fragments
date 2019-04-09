package com.kamijal.home_work_03.models;

public class Video {
    private String title;
    private String additionalInfo;

    public Video(String title, String additionalInfo) {
        this.title = title;
        this.additionalInfo = additionalInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
