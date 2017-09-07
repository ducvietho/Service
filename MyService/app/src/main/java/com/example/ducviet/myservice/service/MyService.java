package com.example.ducviet.myservice.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import com.example.ducviet.myservice.R;

public class MyService extends Service {
    private MediaPlayer mediaPlayer;
    public MyService() {
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.seve);
    }
    //Start
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        // Choi nhac
        mediaPlayer.start();
        return START_STICKY;
    }
    //Huy service
    @Override
    public void onDestroy(){
        mediaPlayer.release();
        super.onDestroy();
    }
}
