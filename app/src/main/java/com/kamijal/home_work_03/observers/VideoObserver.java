package com.kamijal.home_work_03.observers;

import com.kamijal.home_work_03.adapters.VideoItemViewAdapter;
import com.kamijal.home_work_03.models.Video;

import java.util.List;

public class VideoObserver extends BaseObserver<List<Video>, VideoItemViewAdapter> {

    public VideoObserver(VideoItemViewAdapter adapter) {
        super(adapter);
    }

    @Override
    public void onChanged(List<Video> dataSet) {
        adapter.setDataSet(dataSet);
        adapter.notifyDataSetChanged();
    }
}
