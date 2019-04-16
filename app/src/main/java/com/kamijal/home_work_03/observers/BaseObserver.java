package com.kamijal.home_work_03.observers;

import android.widget.BaseAdapter;

import com.kamijal.home_work_03.models.Video;

import androidx.lifecycle.Observer;

public abstract class BaseObserver<T, A> implements Observer<T> {
    A adapter;

    public BaseObserver(A adapter) {
        this.adapter = adapter;
    }

}
