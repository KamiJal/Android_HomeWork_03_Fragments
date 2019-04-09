package com.kamijal.home_work_03.viewmodels;

import android.util.Log;

import com.kamijal.home_work_03.models.Video;
import com.kamijal.home_work_03.repositories.RepositoryInterface;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private static final String TAG = "MainActivityViewModel";

    private final MutableLiveData<List<Video>> mVideoList = new MutableLiveData<>();
    private RepositoryInterface repository;

    public void init(RepositoryInterface repository) {
        this.repository = repository;

        Log.d(TAG, "init: ended.");
    }

    public LiveData<List<Video>> getVideoList() {
        Log.d(TAG, "getEmployeeList: called.");

        mVideoList.setValue(repository.getVideoList());
        return this.mVideoList;
    }
}
