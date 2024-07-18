package com.example.broadcast_receiverdemo1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        if(intent!!.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            //Toast.makeText(context,"Airplane mode action",Toast.LENGTH_LONG).show()

            if (intent.getBooleanExtra("state",false)){
                Toast.makeText(context,"Airplane ON!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"Airplane OFF!",Toast.LENGTH_LONG).show()
            }
        }

        if(intent!!.action.equals(Intent.ACTION_BATTERY_LOW)){
            if(intent.getBooleanExtra("state",false)){
                Toast.makeText(context,"Batter is Low",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"Battery is Not low",Toast.LENGTH_LONG).show()
            }
        }

    }
}