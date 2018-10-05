package com.werner.jiaozivideoplayer__demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyJzvdStd myJzvdStd = findViewById(R.id.video_player);
        myJzvdStd.setUp("rtsp://192.168.1.254/xxx.mov", " ", JzvdStd.SCREEN_WINDOW_NORMAL);
        Jzvd.setMediaInterface(new JZMediaIjkplayer());

        myJzvdStd.startVideo();
        myJzvdStd.entryFullScreen();
    }
}
