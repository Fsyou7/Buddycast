package com.labartbeats.buddycast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        TextView statsMain = (TextView) findViewById(R.id.stats_main);
        statsMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent statsMainIntent = new Intent(StatsActivity.this, MainActivity.class);
                startActivity(statsMainIntent);
            }
        });

        TextView statsUser = (TextView) findViewById(R.id.stats_user);
        statsUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent statsUserIntent = new Intent(StatsActivity.this, UserActivity.class);
                startActivity(statsUserIntent);
            }
        });

        TextView statsNowPlayingSong = (TextView) findViewById(R.id.stats_now_playing_song);
        statsNowPlayingSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent statsNowPlayingSongIntent = new Intent(StatsActivity.this, NowPlayingActivity.class);
                startActivity(statsNowPlayingSongIntent);
            }
        });
    }
}
