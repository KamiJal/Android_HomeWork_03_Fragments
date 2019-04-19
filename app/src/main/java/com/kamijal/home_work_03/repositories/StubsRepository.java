package com.kamijal.home_work_03.repositories;

import android.util.Log;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.models.Channel;
import com.kamijal.home_work_03.models.Video;

import java.util.ArrayList;
import java.util.List;

public class StubsRepository implements RepositoryInterface {

    private static final String TAG = "StubsRepository";

    private final List<Video> videos;
    private final List<Channel> channels;

    public StubsRepository() {
        channels = new ArrayList<>();
        channels.add(new Channel("freeCodeCamp", R.drawable.channel_logo_01));
        channels.add(new Channel("Programming with Mosh", R.drawable.channel_logo_02));
        channels.add(new Channel("Derek Banas", R.drawable.channel_logo_03));
        channels.add(new Channel("Stefan Mischook", R.drawable.channel_logo_04));
        channels.add(new Channel("Hitesh Choudhary", R.drawable.channel_logo_05));
        channels.add(new Channel("freeCodeCamp", R.drawable.channel_logo_01));
        channels.add(new Channel("Programming with Mosh", R.drawable.channel_logo_02));
        channels.add(new Channel("Derek Banas", R.drawable.channel_logo_03));
        channels.add(new Channel("Stefan Mischook", R.drawable.channel_logo_04));
        channels.add(new Channel("Hitesh Choudhary", R.drawable.channel_logo_05));

        videos = new ArrayList<>();
        videos.add(new Video("C# Tutorial - Full Course for Beginners", "7 months ago", "631K views", R.drawable.video_preview_01, channels.get(0)));
        videos.add(new Video("Learn C# Basics in 1 Hour - C# Tutorial For Beginners", "3 years ago", "1.4M views", R.drawable.video_preview_02, channels.get(1)));
        videos.add(new Video("Java Programming", "4 years ago", "4.2M views", R.drawable.video_preview_03, channels.get(2)));
        videos.add(new Video("Should you learn Java in 2018?", "1 year ago", "323K views", R.drawable.video_preview_04, channels.get(3)));
        videos.add(new Video("PHP in 2019 - Let's talk about it", "3 months ago", "141K views", R.drawable.video_preview_05, channels.get(4)));
        videos.add(new Video("C# Tutorial - Full Course for Beginners", "7 months ago", "631K views", R.drawable.video_preview_01, channels.get(5)));
        videos.add(new Video("Learn C# Basics in 1 Hour - C# Tutorial For Beginners", "3 years ago", "1.4M views", R.drawable.video_preview_02, channels.get(6)));
        videos.add(new Video("Java Programming", "4 years ago", "4.2M views", R.drawable.video_preview_03, channels.get(7)));
        videos.add(new Video("Should you learn Java in 2018?", "1 year ago", "323K views", R.drawable.video_preview_04, channels.get(8)));
        videos.add(new Video("PHP in 2019 - Let's talk about it", "3 months ago", "141K views", R.drawable.video_preview_05, channels.get(9)));

        Log.d(TAG, "StubsRepository: created.");
    }


    @Override
    public List<Video> getVideoList() {
        return videos;
    }

    @Override
    public List<Channel> getChannelList() {
        return channels;
    }

}
