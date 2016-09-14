package com.labartbeats.buddycast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView title = (TextView) findViewById(R.id.title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(UserActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

        final TextView userNowPlaying = (TextView) findViewById(R.id.user_now_playing);
        userNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userNowPlayingIntent = new Intent(UserActivity.this, NowPlayingActivity.class);
                startActivity(userNowPlayingIntent);
            }
        });

        TextView userLibrary = (TextView) findViewById(R.id.user_library);
        userLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userLibraryIntent = new Intent(UserActivity.this, LibraryActivity.class);
                startActivity(userLibraryIntent);
            }
        });

        TextView userStats = (TextView) findViewById(R.id.user_stats);
        userStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userStatsIntent = new Intent(UserActivity.this, StatsActivity.class);
                startActivity(userStatsIntent);
            }
        });

        TextView userNowPlayingTitle = (TextView) findViewById(R.id.user_now_playing_song);
        userNowPlayingTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent userNowPlayingSongIntent = new Intent(UserActivity.this, NowPlayingActivity.class);
                startActivity(userNowPlayingSongIntent);
            }
        });
    }
}
