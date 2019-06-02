package com.example.masksprite.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.masksprite.MainActivity;
import com.example.masksprite.R;
import com.example.masksprite.utils.ShareUtils;
import com.example.masksprite.utils.StaticClass;
import com.example.masksprite.utils.UtilTools;

import static com.example.masksprite.utils.StaticClass.HANDLER_SPLASH;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.ui
 * 文件名：    SplashActivity
 * 作者：      钟士宜
 * 创建时间    2019/5/24 9:58
 * 描述：      闪屏类
 */
public class SplashActivity extends AppCompatActivity {

    /**
     * 1、延时1000ms
     * 2、判断程序是不是第一次运行
     * 3、自定义字体
     * 4、Activity全屏主题
     */

    private TextView tv_splash;


    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case HANDLER_SPLASH:
                    //判断程序是不是第一次运行
                    if(isFirst()){
                        startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    }
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    private void initView() {
        //延时1000ms
        handler.sendEmptyMessageDelayed(HANDLER_SPLASH,1000);

        tv_splash = findViewById(R.id.tv_splash);
        //设置字体
        UtilTools.setFont(this,tv_splash);
    }

    //判断程序是不是第一次运行
    public boolean isFirst(){
        boolean isFirst = ShareUtils.getBoolean(this,"isFirst",true);
        if(isFirst){
            ShareUtils.putBoolean(this,"isFirst",false);
            //是第一次运行
            return true;
        }else{
            return false;
        }
    }
}
