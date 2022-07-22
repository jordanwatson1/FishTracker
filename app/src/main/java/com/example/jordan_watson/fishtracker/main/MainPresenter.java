package com.example.jordan_watson.fishtracker.main;

/**
 * Responsible for handling actions from the View and updating the UI as required.
 */

public class MainPresenter implements MainContract.Presenter {

    // Presenter will need to manipulate the View
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }

}
