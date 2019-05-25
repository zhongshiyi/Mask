package com.example.masksprite;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.Authenticator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_search_bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //初始化
        initView();
    }

    private void initView() {
        iv_search_bluetooth = findViewById(R.id.search_blue_tooth);
        iv_search_bluetooth.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_blue_tooth:

                break;
        }
    }
}
