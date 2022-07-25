package com.example.jordan_watson.fishtracker.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

import com.example.jordan_watson.fishtracker.R;
import com.example.jordan_watson.fishtracker.databinding.ActivityMainBinding;

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
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        binding.setPresenter(mPresenter);
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