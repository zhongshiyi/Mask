package com.example.masksprite;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.masksprite.fragment.BlueFragment;
import com.example.masksprite.fragment.NewsFragment;
import com.example.masksprite.fragment.WeatherFragment;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //TabLayout
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment> mFragment;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化数据
        initData();
        //初始化
        initView();
    }

    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add(getResources().getString(R.string.control_blue));
        mTitle.add(getResources().getString(R.string.news_selection));
        mTitle.add(getResources().getString(R.string.weather));

        mFragment = new ArrayList<>();
        mFragment.add(new BlueFragment());
        mFragment.add(new NewsFragment());
        mFragment.add(new WeatherFragment());
    }

    private void initView() {
        mTabLayout = findViewById(R.id.mTabLayout);
        mViewPager = findViewById(R.id.main_mViewPager);

        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());


        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            //返回item的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }

            //设置标题
            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });

        //绑定
        mTabLayout.setupWithViewPager(mViewPager);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case 1:

                break;
        }
    }
}
