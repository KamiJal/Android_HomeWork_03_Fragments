package com.kamijal.home_work_03.factories;

import com.kamijal.home_work_03.viewmodels.InboxFragmentViewModel;
import com.kamijal.home_work_03.viewmodels.TrendingFragmentViewModel;
import com.kamijal.home_work_03.repositories.RepositoryInterface;
import com.kamijal.home_work_03.viewmodels.BaseViewModel;
import com.kamijal.home_work_03.viewmodels.HomeFragmentViewModel;
import com.kamijal.home_work_03.viewmodels.SubscriptionsFragmentViewModel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class ViewModelsFactory {

    private static RepositoryInterface repository;

    public static void init(RepositoryInterface repository) {
        ViewModelsFactory.repository = repository;
    }

    @SuppressWarnings("ConstantConditions")
    public static BaseViewModel Create(final Fragment fragment) {

        BaseViewModel model = null;

        switch (fragment.getClass().getSimpleName()) {
            default:
            case "HomeFragment":{
                model = ViewModelProviders.of(fragment).get(HomeFragmentViewModel.class);
            }
            break;
            case "TrendingFragment": {
                model = ViewModelProviders.of(fragment).get(TrendingFragmentViewModel.class);
            }
            break;
            case "SubscriptionsFragment": {
                model = ViewModelProviders.of(fragment).get(SubscriptionsFragmentViewModel.class);
            }
            break;
            case "InboxFragment": {
                model = ViewModelProviders.of(fragment).get(InboxFragmentViewModel.class);
            }
            break;
            case "LibraryFragment": {
            }
            break;
        }

        model.init(repository);
        return model;
    }
}
