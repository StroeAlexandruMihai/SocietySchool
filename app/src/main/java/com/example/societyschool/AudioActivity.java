package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AudioActivity extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }

    public void play(View v) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.inima);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }
    public void pause(View v) {
        if (player != null) {
            player.pause();
        }
    }
    public void stop(View v) {
        stopPlayer();
    }
    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "STOP", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}