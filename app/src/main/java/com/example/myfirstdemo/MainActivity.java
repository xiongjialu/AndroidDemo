package com.example.myfirstdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by _熊家路 on 2018/3/15.
 * 切记在AndroidManifest中声明
 *声明格式
 * <activity android:name=".MainActivity">
* <intent-filter>
 *<action android:name="android.intent.action.MAIN" />
*
 *<category android:name="android.intent.category.LAUNCHER" />
 *</intent-filter>
 *</activity>
 *
 *
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgbt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        imgbt=(ImageButton)findViewById(R.id.imageButton);



        //通过实现一个接口的方式实现监听事件
        imgbt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i("tag","第三种方式实现！");
    }
}
