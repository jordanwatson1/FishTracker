package com.example.jordan_watson.fishtracker.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.jordan_watson.fishtracker.R;

/**
 * Displays the Main screen (the very first screen the App loads)
 *
 * responsible for doing whatever the presenter tells it to
 */

// MainActivity has to implement its contract
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    // need to get a handle on our presenter from our view
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }

    ////         MvpView methods        ////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the Sign in screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the Sign up screen", Toast.LENGTH_SHORT).show();
    }
}