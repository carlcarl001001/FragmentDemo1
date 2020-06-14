package com.example.carl.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.carl.fragmentdemo.Fragment.ResultFragment;
import com.example.carl.fragmentdemo.Fragment.SelectFragment;

public class MainActivity extends AppCompatActivity implements SelectFragment.Callback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemSelected(int id) {
        ResultFragment resultFragment = (ResultFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_result);
        resultFragment.showResult(id);
    }
}
