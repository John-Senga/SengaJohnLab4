package com.senga.john.sengajohnlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity Life Cycle");
        setContentView(R.layout.activity_main);

        Log.d("Log: ","The activity has been created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Log: ","The activity has been started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log: ","The activity has been resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log: ","The activity has been stopped");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Log: ","The activity has been paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Log: ","The activity has been restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log: ","The activity has been terminated");
    }

    public void displayToast(View v){
        Toast.makeText(this,"Hello 4ith...",Toast.LENGTH_LONG).show();
        Log.d("Log: ","The toast has been displayed");
    }

    public void displaySnackbar(View v){
        Snackbar.make(v, "Hello again", Snackbar.LENGTH_LONG).show();
        Log.d("Log: ","The snackbar has been displayed");
    }

}
