package com.zhowin.nineimageview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhowin.nineimageview.R;

public class IndexActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        findViewById(R.id.tvTypeOne).setOnClickListener(this);
        findViewById(R.id.tvTypeTwo).setOnClickListener(this);
        findViewById(R.id.tvTypeThree).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvTypeOne:
                MainActivity.start(this);
                break;
            case R.id.tvTypeTwo:
                SecondActivity.start(this);
                break;
            case R.id.tvTypeThree:
                ThreeActivity.start(this);
                break;
        }
    }
}
