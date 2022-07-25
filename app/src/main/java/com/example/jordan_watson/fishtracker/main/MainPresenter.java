package com.example.jordan_watson.fishtracker.main;

/**
 * Responsible for handling actions from the View and updating the UI as required.
 *
 * Responsible for clicks to the sign in and sign up button
 *
 * 1. when putting methods in contract, click on red squiggly line in public class and hit "alt" + Enter then implement methods
 * 2. right click the class name MainPresenter, navigate to "go to" -> Test -> Create new test
 */

public class MainPresenter implements MainContract.Presenter {


    // Presenter will need to manipulate the View
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }

    ////        Presenter methods      ////
    @Override
    public void handleSignInButtonClick() {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mView.showSignUpScreen();
    }
}
