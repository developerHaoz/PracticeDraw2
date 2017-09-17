package com.hencoder.hencoderpracticedraw2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developerHaoz on 2017/9/16.
 */

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        List<Integer> row = new ArrayList<>();
        List<Integer> list = new ArrayList<>(row);

    }
}
