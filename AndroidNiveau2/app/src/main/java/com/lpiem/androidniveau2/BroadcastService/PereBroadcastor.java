package com.lpiem.androidniveau2.BroadcastService;

/**
 * Created by iem on 01/12/15.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.lpiem.androidniveau2.Main2Activity;

public class PereBroadcastor extends BroadcastReceiver{


        public PereBroadcastor() {
        }
    // modifier l'action selon ce qu'on veut
    private final String   ACTION_RECEIVE_SMS  = "android.provider.Telephony.SMS_RECEIVED";

        @Override
        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals(ACTION_RECEIVE_SMS))
            {
                Bundle bundle = intent.getExtras();


                Toast.makeText(context, "BDD media à jour", Toast.LENGTH_LONG).show();


            }

        }
    }


