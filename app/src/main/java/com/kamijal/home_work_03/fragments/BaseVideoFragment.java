package com.kamijal.home_work_03.fragments;

import android.os.Bundle;
import android.util.Log;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.adapters.VideoItemViewAdapter;
import com.kamijal.home_work_03.factories.ViewModelsFactory;
import com.kamijal.home_work_03.models.Video;
import com.kamijal.home_work_03.viewmodels.VideoFragmentViewModel;

import java.util.List;

import androidx.lifecycle.Observer;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseVideoFragment extends Fragment implements Observer<List<Video>> {

    final String TAG;

    private RecyclerView videoRecyclerView;
    private VideoFragmentViewModel viewModel;
    private final VideoItemViewAdapter adapter;

    public BaseVideoFragment() {
        this.TAG = this.getClass().getSimpleName();
        Log.d(TAG, "Constructor: called.");

        this.adapter = new VideoItemViewAdapter();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.TAG, "onCreate: called.");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(this.TAG, "onActivityCreated: called.");

        int recyclerViewId;
        switch (this.TAG) {
            default:
            case "HomeFragment":
                recyclerViewId = R.id.fragment_home_recycler_view;
                break;
            case "TrendingFragment":
                recyclerViewId = R.id.fragment_trending_recycler_view;
                break;
        }

        if (getActivity() == null)
            return;

        this.videoRecyclerView = getActivity().findViewById(recyclerViewId);

        if(videoRecyclerView == null)
            return;

        this.videoRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        this.videoRecyclerView.setAdapter(adapter);

        this.viewModel = (VideoFragmentViewModel) ViewModelsFactory.Create(this);
        this.viewModel.getVideoList().observe(this, this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(this.TAG, "onStart: called.");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called.");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: called.");
    }

    @Override
    public void onChanged(List<Video> dataSet) {
        Log.d(TAG, "onChanged: called.");

        adapter.setDataSet(dataSet);
        adapter.notifyDataSetChanged();
    }
}
