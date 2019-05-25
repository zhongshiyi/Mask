package com.example.masksprite.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.masksprite.MainActivity;
import com.example.masksprite.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.ui
 * 文件名：    GuideActivity
 * 作者：      钟士宜
 * 创建时间    2019/5/24 9:59
 * 描述：      导航页
 */
public class GuideActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    //容器
    private List<View> mlist = new ArrayList<>();
    private View view1,view2,view3;
    //小圆点
    private ImageView point_1,point_2,point_3;
    //跳过
    private ImageView iv_jump;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        //初始化
        initView();
    }

    private void initView() {
        iv_jump = findViewById(R.id.iv_jump);
        iv_jump.setOnClickListener(this);

        point_1 = findViewById(R.id.point_1);
        point_2 = findViewById(R.id.point_2);
        point_3 = findViewById(R.id.point_3);

        //默认最开始point的状态
        setPointImg(true,false,false);

        mViewPager = findViewById(R.id.guide_mViewPager);

        view1 = View.inflate(this,R.layout.pager_item_one,null);
        view2 = View.inflate(this,R.layout.pager_item_tow,null);
        view3 = View.inflate(this,R.layout.pager_item_three,null);

        view3.findViewById(R.id.btn_start).setOnClickListener(this);

        mlist.add(view1);
        mlist.add(view2);
        mlist.add(view3);

        //设置适配器
        mViewPager.setAdapter(new GuideAdapter());

        //监听ViewPager的滑动，设置小圆点的变化
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }
            //切换
            @Override
            public void onPageSelected(int position) {
                //Log.i("position"+ position,null);
                switch (position){
                    case 0:
                        //设置默认图片
                        setPointImg(true,false,false);
                        iv_jump.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        //设置默认图片
                        setPointImg(false,true,false);
                        iv_jump.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        //设置默认图片
                        setPointImg(false,false,true);
                        iv_jump.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_jump:
            case R.id.btn_start:
                startActivity(new Intent(this,MainActivity.class));
                finish();
                break;
            default:
                break;
        }
    }

    class GuideAdapter extends PagerAdapter{
        //获得数量
        @Override
        public int getCount() {
            return mlist.size();
        }
        //比较
        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }
        //添加下一个页面
        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            container.addView(mlist.get(position));
            return mlist.get(position);
        }
        //删除当前页面
        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView(mlist.get(position));
        }
    }

    //设置小圆点选中的效果
    private void setPointImg(boolean isCheck1,boolean isCheck2,boolean isCheck3){
        if(isCheck1){
            point_1.setBackgroundResource(R.drawable.point_on);
        }else{
            point_1.setBackgroundResource(R.drawable.point_off);
        }
        if(isCheck2){
            point_2.setBackgroundResource(R.drawable.point_on);
        }else{
            point_2.setBackgroundResource(R.drawable.point_off);
        }
        if(isCheck3){
            point_3.setBackgroundResource(R.drawable.point_on);
        }else{
            point_3.setBackgroundResource(R.drawable.point_off);
        }
    }
}
