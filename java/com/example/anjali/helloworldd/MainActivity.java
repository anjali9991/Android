package com.example.anjali.helloworldd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button button=findViewById(R.id.button);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Hello!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("State","onStart()");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("State","onResume()");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("State","onPause()");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("State","onStop()");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("State","onDestroy()");
    }
}
