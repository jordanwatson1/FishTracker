package com.example.jordan_watson.fishtracker.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jordan_watson.fishtracker.R;

/**
 * Displays the Main screen (the very first screen the App loads)
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
}