package com.example.musicapp;

import android.media.MediaPlayer;

public class MyMediaPlayer {
    public static int currentIndex;
    static MediaPlayer instance;

    public static MediaPlayer getInstance() {
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }

   public static int getCurrentIndex= -1;
}
