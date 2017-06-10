package com.example.thefirendkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 static {
     System.loadLibrary("HellowWord");
 }
    private TextView tv_view;
    //第一步添加native方法
    //第二步在main目录下创建一个jni目录，用来放头文件
    public static native String getStringFromActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_view= (TextView) findViewById(R.id.text);
        tv_view.setText(getStringFromActivity());
    }
}
