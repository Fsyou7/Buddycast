package com.labartbeats.buddycast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView nowPlayingMain = (TextView) findViewById(R.id.now_playing_main);
        nowPlayingMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingMainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(nowPlayingMainIntent);
            }
        });

        TextView nowPlayingUser = (TextView) findViewById(R.id.now_playing_user);
        nowPlayingUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingUserIntent = new Intent(NowPlayingActivity.this, UserActivity.class);
                startActivity(nowPlayingUserIntent);
            }
        });
    }
}
