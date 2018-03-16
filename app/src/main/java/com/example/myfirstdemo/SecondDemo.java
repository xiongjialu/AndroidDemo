package com.example.myfirstdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by _熊家路 on 2018/3/16.
 */

@SuppressLint("AppCompatCustomView")
public class SecondDemo extends TextView{
    public SecondDemo(Context context) {
        super(context);
    }

    public SecondDemo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SecondDemo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public boolean isFocused(){
        return  true;
    }
}
