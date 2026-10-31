package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyBackgroundService extends Service{
    @Override
    public void onCreate(){
        super.onCreate();
        Log.d("SERVICE_TEST", "Сервис создан!");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.d("SERVICE_TEST", "Сервис запущен!");

        return START_STICKY;

    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("SERVICE_TEST", "Сервис остановлен");
    }

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
}

