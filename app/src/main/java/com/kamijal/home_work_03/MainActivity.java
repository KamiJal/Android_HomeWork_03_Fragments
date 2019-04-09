package com.kamijal.home_work_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kamijal.home_work_03.fragments.HomeFragment;
import com.kamijal.home_work_03.repositories.StubsRepository;
import com.kamijal.home_work_03.viewmodels.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private MainActivityViewModel mainActivityViewModel;
    private BottomNavigationView bottomNav;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((ImageView) findViewById(R.id.youtube_logo)).setImageResource(R.drawable.youtube_logo);

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mainActivityViewModel.init(new StubsRepository());

        fragmentManager = getSupportFragmentManager();

        bottomNav = findViewById(R.id.bottom_nav);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment fragment = null;
                Class fragmentClass = null;

                switch (menuItem.getItemId()) {
                    case R.id.menu_home: {
                        fragmentClass = HomeFragment.class;
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
                    default:
                        fragmentClass = HomeFragment.class;
                }

                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception ex) {
                    Log.e(TAG, "onNavigationItemSelected: " + ex.getMessage(), ex);
                    ex.printStackTrace();
                }

                fragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit();


                return true;
            }
        });

        Log.d(TAG, "onCreate: done.");
    }
}
