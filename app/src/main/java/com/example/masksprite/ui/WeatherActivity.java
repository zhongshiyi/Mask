package com.example.masksprite.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.masksprite.R;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.ui
 * 文件名：    WeatherActivity
 * 作者：      钟士宜
 * 创建时间    2019/6/2 17:56
 * 描述：      天气预报
 */
public class WeatherActivity extends AppCompatActivity {
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation aMapLocation) {

        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


    }
}
