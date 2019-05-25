package com.example.masksprite.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名：    MaskSprite
 * 包名：      com.example.masksprite.utils
 * 文件名：    ShareUtils
 * 作者：      钟士宜
 * 创建时间    2019/5/24 11:15
 * 描述：      TODO
 */
public class ShareUtils {

    public static final String NAME = "config";

    /**
     *  储存（键---值）
     */
    public static void putString(Context context,String key,String value){
        SharedPreferences sp = context.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putString(key,value).commit();
    }
    public static void putInt(Context context,String key,int value){
        SharedPreferences sp = context.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putInt(key,value).commit();
    }
    public static void putBoolean(Context context,String key,boolean value){
        SharedPreferences sp = context.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();
    }

    /**
     *  读取（键---默认值）
     */
    public static String getString(Context context,String key,String defValue) {
        SharedPreferences sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }
    public static int getInt(Context context,String key,int defValue) {
        SharedPreferences sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }
    public static boolean getBoolean(Context context,String key,boolean defValue) {
        SharedPreferences sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    /**
     *  删除单个
     */
    public static void deleShare(Context mContext,String key){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }
    /**
     *  删除全部
     */
    public static void dele(Context mContext,String key){
        SharedPreferences sp = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }
}
