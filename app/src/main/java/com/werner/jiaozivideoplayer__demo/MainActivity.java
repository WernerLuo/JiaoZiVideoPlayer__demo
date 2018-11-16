package com.werner.jiaozivideoplayer__demo;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private MyJzvdStd myJzvdStd;
    private JzvdStd myJzvdStd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myJzvdStd = findViewById(R.id.video_player);
        myJzvdStd.setUp("rtsp://192.168.42.1/live", " ", JzvdStd.SCREEN_WINDOW_NORMAL);
        Jzvd.setMediaInterface(new JZMediaIjkplayer());

        myJzvdStd.startVideo();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("onConfigurationChanged", newConfig.orientation+"");
    }

    @Override
    public void onClick(View v) {
    }
}
