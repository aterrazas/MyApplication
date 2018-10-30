package com.example.aterr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.testfairy.TestFairy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestFairy.begin(this, "1b28c2fea99d6d10fe776760ae9be9ab5d80c189");
    }
}
