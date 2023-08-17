package com.compose.accessibilityapp.utility

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AeroplaneModeReceiver : BroadcastReceiver()
{
    override fun onReceive(context: Context, intent: Intent)
    {
        println("onReceiver")
        println("Action is "+intent.action)
        Toast.makeText(context,"Aeroplane Mode" , Toast.LENGTH_LONG).show()
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
       // TODO("AeroplaneModeReceiver.onReceive() is not implemented")
    }

}