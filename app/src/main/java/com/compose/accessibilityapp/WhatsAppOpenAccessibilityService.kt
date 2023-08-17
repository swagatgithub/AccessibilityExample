package com.compose.accessibilityapp

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast


class WhatsAppOpenAccessibilityService : AccessibilityService()
{
    private var firstTime : Long? = 0

    override fun onAccessibilityEvent(event: AccessibilityEvent?)
    {
        Log.v("OnAccessibilityEvent", "Invoked")
        if(firstTime?.compareTo(0) == 0)
        {
            firstTime = event?.eventTime
            Toast.makeText(this, "WhatsApp Launched..", Toast.LENGTH_LONG).show()

            //val mainHandler = Handler(mainLooper)
            //mainHandler.post(Runnable { // Do your stuff here related to UI, e.g. show toast
            //})
           // Toast.makeText(applicationContext, "WhatsApp Launched..", Toast.LENGTH_SHORT).show()
       }

     /*   val info = AccessibilityServiceInfo()
        info.eventTypes = AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED
        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC
        serviceInfo = info*/
        //event.
       // getSystemService()
    }

    override fun onInterrupt() {
        TODO("Not yet implemented")
    }
}