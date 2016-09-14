package com.labartbeats.buddycast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        TextView libraryMain = (TextView) findViewById(R.id.library_main);
        libraryMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryMainIntent = new Intent(LibraryActivity.this, MainActivity.class);
                startActivity(libraryMainIntent);
            }
        });

        TextView libraryUser = (TextView) findViewById(R.id.library_user);
        libraryUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryUserIntent = new Intent(LibraryActivity.this, UserActivity.class);
                startActivity(libraryUserIntent);
            }
        });

        TextView libraryNowPlayingSong = (TextView) findViewById(R.id.library_now_playing_song);
        libraryNowPlayingSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryNowPlayingSongIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                startActivity(libraryNowPlayingSongIntent);
            }
        });
    }
}
