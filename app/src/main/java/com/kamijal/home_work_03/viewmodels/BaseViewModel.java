package com.kamijal.home_work_03.viewmodels;

import android.util.Log;

import com.kamijal.home_work_03.repositories.RepositoryInterface;

import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel extends ViewModel {

    static String TAG;

    BaseViewModel() {
        TAG = this.getClass().getSimpleName();
    }

    RepositoryInterface repository;

    public void init(RepositoryInterface repository) {
        Log.d(TAG, "init: called.");

        this.repository = repository;
    }
}
