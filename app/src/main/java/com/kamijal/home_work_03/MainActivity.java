package com.kamijal.home_work_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kamijal.home_work_03.factories.ViewModelsFactory;
import com.kamijal.home_work_03.fragments.HomeFragment;
import com.kamijal.home_work_03.fragments.TrendingFragment;
import com.kamijal.home_work_03.repositories.StubsRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";

    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: called.");

        ViewModelsFactory.init(new StubsRepository());
        setContentView(R.layout.activity_main);

        ((ImageView) findViewById(R.id.youtube_logo)).setImageResource(R.drawable.youtube_logo);
        ((BottomNavigationView)findViewById(R.id.bottom_nav)).setOnNavigationItemSelectedListener(this);

        initFragments();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragments.get(0)).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int position;
        switch (menuItem.getItemId()) {
            default:
            case R.id.menu_home: {
                position = 0;
            }
            break;
            case R.id.menu_trending: {
                position = 1;
            }
            break;
            case R.id.menu_subscriptions: {
                position = 2;
            }
            break;
            case R.id.menu_inbox: {
                position = 3;
            }
            break;
            case R.id.menu_library: {
                position = 4;
            }
            break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragments.get(position)).addToBackStack(null).commit();
        return true;
    }

    private void initFragments() {
        this.fragments = new ArrayList<>();
        this.fragments.add(new HomeFragment());
        this.fragments.add(new TrendingFragment());
    }
}
