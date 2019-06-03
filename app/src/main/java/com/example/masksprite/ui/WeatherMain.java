package com.example.masksprite.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.example.masksprite.R;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.ui
 * 文件名：    WeatherMain
 * 作者：      钟士宜
 * 创建时间    2019/6/2 17:56
 * 描述：      天气预报
 */
public class WeatherMain extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        /**
         * 加入一个缓存数据的判断
         * 先从SharedPreferences文件中读取缓存数据，看是否为null,若不为null则说明之前已经请求
         * 过天气数据了，那么就没必要让用户再次选择城市，直接跳转到WeatherActivity即可。
         */
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather",null) != null){
            Intent intent = new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
