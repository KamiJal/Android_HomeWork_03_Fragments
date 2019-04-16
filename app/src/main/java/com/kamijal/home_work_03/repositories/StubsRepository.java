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
        videos = new ArrayList<>();
        videos.add(new Video("C# Tutorial - Full Course for Beginners", "freeCodeCamp • 631K views • 7 months ago", R.drawable.video_preview_01, R.drawable.channel_logo_01));
        videos.add(new Video("Learn C# Basics in 1 Hour - C# Tutorial For Beginners", "Programming with Mosh • 1.4M views • 3 years ago", R.drawable.video_preview_02, R.drawable.channel_logo_02));
        videos.add(new Video("Java Programming", "Derek Banas • 4.2M views • 4 years ago", R.drawable.video_preview_03, R.drawable.channel_logo_03));
        videos.add(new Video("Should you learn Java in 2018?", "Stefan Mischook • 323K views • 1 year ago", R.drawable.video_preview_04, R.drawable.channel_logo_04));
        videos.add(new Video("PHP in 2019 - Let's talk about it", "Hitesh Choudhary • 141K views • 3 months ago", R.drawable.video_preview_05, R.drawable.channel_logo_05));
        videos.add(new Video("C# Tutorial - Full Course for Beginners", "freeCodeCamp • 631K views • 7 months ago", R.drawable.video_preview_01, R.drawable.channel_logo_01));
        videos.add(new Video("Learn C# Basics in 1 Hour - C# Tutorial For Beginners", "Programming with Mosh • 1.4M views • 3 years ago", R.drawable.video_preview_02, R.drawable.channel_logo_02));
        videos.add(new Video("Java Programming", "Derek Banas • 4.2M views • 4 years ago", R.drawable.video_preview_03, R.drawable.channel_logo_03));
        videos.add(new Video("Should you learn Java in 2018?", "Stefan Mischook • 323K views • 1 year ago", R.drawable.video_preview_04, R.drawable.channel_logo_04));
        videos.add(new Video("PHP in 2019 - Let's talk about it", "Hitesh Choudhary • 141K views • 3 months ago", R.drawable.video_preview_05, R.drawable.channel_logo_05));

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
