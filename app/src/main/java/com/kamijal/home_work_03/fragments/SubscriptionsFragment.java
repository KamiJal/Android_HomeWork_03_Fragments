package com.kamijal.home_work_03.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.adapters.ChannelItemViewAdapter;
import com.kamijal.home_work_03.adapters.VideoItemViewAdapter;
import com.kamijal.home_work_03.factories.ViewModelsFactory;
import com.kamijal.home_work_03.observers.ChannelObserver;
import com.kamijal.home_work_03.observers.VideoObserver;
import com.kamijal.home_work_03.viewmodels.SubscriptionsFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubscriptionsFragment extends Fragment {

    private static final String TAG = "SubscriptionsFragment";

    private RecyclerView videoRecyclerView;
    private RecyclerView channelRecyclerView;

    private SubscriptionsFragmentViewModel subscriptionsFragmentViewModel;

    private final VideoItemViewAdapter videoItemViewAdapter;
    private final ChannelItemViewAdapter channelItemViewAdapter;

    public SubscriptionsFragment() {
        // Required empty public constructor
        Log.d(TAG, "SubscriptionsFragment: called.");

        this.videoItemViewAdapter = new VideoItemViewAdapter();
        this.channelItemViewAdapter = new ChannelItemViewAdapter();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscriptions, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(TAG, "onActivityCreated: called.");

        if (getActivity() == null)
            return;

        this.videoRecyclerView = getActivity().findViewById(R.id.fragment_subscriptions_video_recycler_view);
        this.channelRecyclerView = getActivity().findViewById(R.id.fragment_subscriptions_channels_recycler_view);

        if(videoRecyclerView == null || channelRecyclerView == null)
            return;

        this.videoRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        this.videoRecyclerView.setAdapter(videoItemViewAdapter);

        this.channelRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));
        this.channelRecyclerView.setAdapter(channelItemViewAdapter);

        this.subscriptionsFragmentViewModel = (SubscriptionsFragmentViewModel) ViewModelsFactory.Create(this);
        this.subscriptionsFragmentViewModel.getVideoList().observe(this, new VideoObserver(videoItemViewAdapter));
        this.subscriptionsFragmentViewModel.getChannelList().observe(this, new ChannelObserver(channelItemViewAdapter));
    }
}
