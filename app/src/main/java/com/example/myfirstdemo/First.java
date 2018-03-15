package com.example.myfirstdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class First extends AppCompatActivity {
    private Button loginButton;
    private Button bt1;
    private Button bt2;
    private ImageButton imgbt;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将布局xml文件引入activity_first中
        setContentView(R.layout.activity_first);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);

        /*
         *外部类写法和作用
         */
        bt1.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View view) {
                //调用父类的OnClick
                super.onClick(view);
                Toast.makeText(First.this,"bt1要执行的逻辑",Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View view) {
                super.onClick(view);
                Toast.makeText(First.this,"bt2要执行的逻辑",Toast.LENGTH_SHORT).show();
            }
        });
    }

/*
 *OnClickListener是一个接口
 */
class MyOnClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
       // Log.i(TAG, "父类onClick: ");

        //当所有使用当前外部点击事件按钮要做出一个动作
        view.setAlpha(0.5f); //改变透明度
    }
  }
}