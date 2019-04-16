package com.kamijal.home_work_03.observers;

import com.kamijal.home_work_03.adapters.ChannelItemViewAdapter;
import com.kamijal.home_work_03.models.Channel;

import java.util.List;

public class ChannelObserver extends BaseObserver<List<Channel>, ChannelItemViewAdapter> {

    public ChannelObserver(ChannelItemViewAdapter adapter) {
        super(adapter);
    }

    @Override
    public void onChanged(List<Channel> dataSet) {
        adapter.setDataSet(dataSet);
        adapter.notifyDataSetChanged();
    }
}
