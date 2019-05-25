package com.example.masksprite.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.utils
 * 文件名：    UtilTools
 * 作者：      钟士宜
 * 创建时间    2019/5/24 11:34
 * 描述：      TODO
 */
public class UtilTools {
    //设置字体
    public static void setFont(Context context, TextView textView){
        Typeface fontType = Typeface.createFromAsset(context.getAssets(),"fly.ttf");
        textView.setTypeface(fontType);
    }
}
