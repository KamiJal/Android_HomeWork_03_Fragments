package com.kamijal.home_work_03.observers;

import com.kamijal.home_work_03.adapters.BaseVideoAdapter;
import com.kamijal.home_work_03.models.Video;

import java.util.List;

public class VideoObserver extends BaseObserver<List<Video>, BaseVideoAdapter> {

    public VideoObserver(BaseVideoAdapter adapter) {
        super(adapter);
    }

    @Override
    public void onChanged(List<Video> dataSet) {
        adapter.setDataSet(dataSet);
        adapter.notifyDataSetChanged();
    }
}
