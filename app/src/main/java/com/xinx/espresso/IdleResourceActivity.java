package com.xinx.espresso;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.test.espresso.idling.CountingIdlingResource;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class IdleResourceActivity extends AppCompatActivity {


    public CountingIdlingResource idlingResource = new CountingIdlingResource("LOAD_DATA");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idle_resource);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setTextDelay();
    }

    private void setTextDelay() {
        idlingResource.increment();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ((TextView) findViewById(R.id.textView)).setText("Hello");
                        idlingResource.decrement();
                    }
                });
            }
        }).start();
    }
}
