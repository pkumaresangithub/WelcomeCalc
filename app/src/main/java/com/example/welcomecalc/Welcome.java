package com.example.welcomecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    Thread thread = new Thread(){

        @Override
        public void run() {
            try {
                sleep(4000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            }
            finally {
                Intent intent2 = new Intent(Welcome.this,MainActivity.class);
                startActivity(intent2);
            }
        }
    };
    thread.start();

    }
}