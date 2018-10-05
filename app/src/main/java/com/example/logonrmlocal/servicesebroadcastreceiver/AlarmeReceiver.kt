package com.example.logonrmlocal.servicesebroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class AlarmeReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        MediaPlayer.create(context, R.raw.alarm).start()
        Toast.makeText(context,
                "Alarme",
                Toast.LENGTH_SHORT).show()
    }
}