package com.example.jordan_watson.fishtracker.main;

/**
 * Defines the contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}.
 */

// defining contracts for view & presenter
public interface MainContract {
    interface MvpView {
        void showSignInScreen();

        void showSignUpScreen();
    }
    interface Presenter{
        void handleSignInButtonClick();

        void handleSignUpButtonClick();
    }
}
