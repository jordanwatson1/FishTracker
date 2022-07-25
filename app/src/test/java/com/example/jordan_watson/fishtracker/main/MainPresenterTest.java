package com.example.jordan_watson.fishtracker.main;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * local unit test for the Main Presenter.
 */

public class MainPresenterTest {

    @Mock
    private MainContract.MvpView mView;

    private MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() {
        mPresenter.handleSignInButtonClick();
        verify(mView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() {
        mPresenter.handleSignUpButtonClick();
        verify(mView).showSignUpScreen();
    }
}