package com.kamijal.home_work_03.viewmodels;

import com.kamijal.home_work_03.repositories.RepositoryInterface;

public class BaseViewModel {
    protected RepositoryInterface repository;

    public BaseViewModel(RepositoryInterface repository) {
        this.repository = repository;
    }
}
