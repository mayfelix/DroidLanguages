package com.mayarafelix.droidlanguages;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "DroidLanguages";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "Mayara Felix");

        new AlertDialog.Builder(this)
                .setTitle(R.string.alert_title)
                .setItems(R.array.Languages, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        if (which == 1)
                        {
                            setContentView(R.layout.activity_main);
                        }
                        else
                        {
                            setContentView(R.layout.activity_main_fr);
                        }
                    }
                }).show();

        //setContentView(R.layout.activity_main);
    }
}
