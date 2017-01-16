package com.mustafa.playofactivity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
Button btnl;
    private static final String msg = "actvity1";

//    @Override
//    public void onBackPressed(){
//        moveTaskToBack(true);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(msg,"oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btnl=(Button)findViewById(R.id.button);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent taketoone=new Intent(getApplicationContext(),Activity2.class);
                startActivity(taketoone);




            }
        });



    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }


    /** Called when the activity restarts after stopping it. */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg, "The onRestart() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

}
