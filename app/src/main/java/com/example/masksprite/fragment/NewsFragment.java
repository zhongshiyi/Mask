package com.example.masksprite.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.masksprite.R;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.fragment
 * 文件名：    NewsFragment
 * 作者：      钟士宜
 * 创建时间    2019/6/2 15:22
 * 描述：      TODO
 */
public class NewsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news,null);
        return view;
    }
}
