package com.example.anurag.project_zero;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getMessage(View v) {
        Context context = getApplicationContext();
        CharSequence text = "";
        switch (v.getId()){
            case R.id.firstApp :
                text = "My First App";
                break;
            case R.id.notesKeeper :
                text = "My Notes Keeper";
                break;
            case R.id.fitnessApp :
                text = "My Fitness App";
                break;
            case R.id.musicPlayer :
                text = "My Music Player";
                break;
        }

        int showTime = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, showTime);
        toast.show();
    }
}
