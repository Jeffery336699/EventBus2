package com.example.toolbar;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.toolbar.base.BaseAcitivity;

public class MainActivity extends BaseAcitivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setTitle(Toolbar toolbar) {
        toolbar.setTitle("首页");
    }
}
