package com.kamijal.home_work_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kamijal.home_work_03.factories.ViewModelsFactory;
import com.kamijal.home_work_03.fragments.HomeFragment;
import com.kamijal.home_work_03.repositories.StubsRepository;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private FragmentManager fragmentManager;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewModelsFactory.init(new StubsRepository());
        fragmentManager = getSupportFragmentManager();

        setContentView(R.layout.activity_main);
        ((ImageView) findViewById(R.id.youtube_logo)).setImageResource(R.drawable.youtube_logo);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    default:
                    case R.id.menu_home: {
                        fragment = new HomeFragment();
                    }

                    break;
                    case R.id.menu_trending: {

                    }
                    break;
                    case R.id.menu_subscriptions: {

                    }
                    break;
                    case R.id.menu_inbox: {

                    }
                    break;
                    case R.id.menu_library: {

                    }
                    break;

                }

                fragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit();

                return true;
            }
        });

        Log.d(TAG, "onCreate: done.");
    }
}
