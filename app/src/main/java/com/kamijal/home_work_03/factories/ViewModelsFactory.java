package com.kamijal.home_work_03.factories;

import com.kamijal.home_work_03.repositories.RepositoryInterface;

public class ViewModelsFactory {

    public enum ViewModelType {
        home,
        trending,
        subscriptions,
        inbox,
        library
    }

    private RepositoryInterface repository;

    public ViewModelsFactory(RepositoryInterface repository) {
        this.repository = repository;
    }

    public BaseViewModel Create(ViewModelType type) {

        BaseViewModel model;

        switch (type){
            case home: {
                model = new HomeViewModel();
            }
        }

        return model;
    }
}
