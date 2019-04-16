package com.kamijal.home_work_03;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kamijal.home_work_03.factories.ViewModelsFactory;
import com.kamijal.home_work_03.fragments.HomeFragment;
import com.kamijal.home_work_03.fragments.SubscriptionsFragment;
import com.kamijal.home_work_03.fragments.TrendingFragment;
import com.kamijal.home_work_03.repositories.StubsRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";

    private List<Fragment> fragments;
    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: called.");

        ViewModelsFactory.init(new StubsRepository());
        setContentView(R.layout.activity_main);

        ((ImageView) findViewById(R.id.youtube_logo)).setImageResource(R.drawable.youtube_logo);

        bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(this);

        initFragments();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragments.get(0)).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int position;
        String name = null;
        switch (menuItem.getItemId()) {
            default:
            case R.id.menu_home: {
                position = 0;
                name = "menu_home";
            }
            break;
            case R.id.menu_trending: {
                position = 1;
                name = "menu_trending";
            }
            break;
            case R.id.menu_subscriptions: {
                position = 2;
                name = "menu_subscriptions";
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

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragments.get(position)).addToBackStack(name).commit();
        return true;
    }

    private void initFragments() {
        this.fragments = new ArrayList<>();
        this.fragments.add(new HomeFragment());
        this.fragments.add(new TrendingFragment());
        this.fragments.add(new SubscriptionsFragment());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        int backStackEntryIndex = getSupportFragmentManager().getBackStackEntryCount() - 1;

        int menuItemId = backStackEntryIndex < 0 ? getMenuItemIdByName(null) :
                getMenuItemIdByName(getSupportFragmentManager().getBackStackEntryAt(backStackEntryIndex).getName());

        bottomNav.getMenu().findItem(menuItemId).setChecked(true);
    }

    private int getMenuItemIdByName(@Nullable String name) {
        switch (name) {
            default:
            case "menu_home":
                return R.id.menu_home;
            case "menu_trending":
                return R.id.menu_trending;
            case "menu_subscriptions":
                return R.id.menu_subscriptions;
            case "menu_inbox":
                return R.id.menu_inbox;
            case "menu_library":
                return R.id.menu_library;
        }
    }

}
