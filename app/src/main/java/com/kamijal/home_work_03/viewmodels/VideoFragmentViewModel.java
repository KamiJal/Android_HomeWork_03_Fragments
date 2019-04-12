package com.kamijal.home_work_03.viewmodels;

import android.util.Log;

import com.kamijal.home_work_03.models.Video;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class VideoFragmentViewModel extends BaseViewModel {

    private final MutableLiveData<List<Video>> mVideoList = new MutableLiveData<>();

    public LiveData<List<Video>> getVideoList() {
        Log.d(TAG, "getVideoList: called.");

        mVideoList.setValue(repository.getVideoList());
        return this.mVideoList;
    }

}
