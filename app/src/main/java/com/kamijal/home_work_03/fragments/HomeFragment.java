package com.kamijal.home_work_03.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.home_work_03.R;
import com.kamijal.home_work_03.adapters.VideoItemViewAdapter;
import com.kamijal.home_work_03.factories.ViewModelsFactory;
import com.kamijal.home_work_03.models.Video;
import com.kamijal.home_work_03.viewmodels.HomeFragmentViewModel;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements Observer<List<Video>> {

    private static final String TAG = "HomeFragment";

    private RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(TAG, "onActivityCreated: called.");

        if (getActivity() == null)
            return;

        recyclerView = getActivity().findViewById(R.id.fragment_home_recycler_view);

        HomeFragmentViewModel viewModel = (HomeFragmentViewModel) ViewModelsFactory.Create(this);
        viewModel.getVideoList().observe(this, this);

        Log.d(TAG, "onActivityCreated: ended.");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onChanged(List<Video> dataSet) {

        VideoItemViewAdapter adapter = new VideoItemViewAdapter(dataSet);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter.notifyDataSetChanged();

        Log.d(TAG, "onChanged: ended.");
    }
}
