package com.kamijal.home_work_03.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrendingFragment extends BaseVideoFragment {

    public TrendingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: called.");
        return inflater.inflate(R.layout.fragment_trending, container, false);
    }
}
