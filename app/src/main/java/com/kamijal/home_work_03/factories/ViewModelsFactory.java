package com.kamijal.home_work_03.factories;

import com.kamijal.home_work_03.repositories.RepositoryInterface;
import com.kamijal.home_work_03.viewmodels.BaseViewModel;
import com.kamijal.home_work_03.viewmodels.VideoFragmentViewModel;

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
            case "HomeFragment":
            case "TrendingFragment": {
                model = ViewModelProviders.of(fragment).get(VideoFragmentViewModel.class);
            }
            break;
            case "SubscriptionsFragment": {
            }
            break;
            case "InboxFragment": {
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
