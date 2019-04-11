package com.kamijal.home_work_03.viewmodels;

import android.util.Log;

import com.kamijal.home_work_03.repositories.RepositoryInterface;

import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel extends ViewModel {

    private static final String TAG = "BaseViewModel";

    protected RepositoryInterface repository;

    public void init(RepositoryInterface repository) {
        this.repository = repository;

        Log.d(TAG, "init: ended.");
    }
}
