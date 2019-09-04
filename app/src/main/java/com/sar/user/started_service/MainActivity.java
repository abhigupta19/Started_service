package com.sar.user.started_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String [] list=new String[]{"radha","krishna","jai shree ram"};
        final List<String> a=new ArrayList<>(Arrays.asList(list));

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<3;i++)
                {
                    Intent intent=new Intent(MainActivity.this,MyService.class);
                    intent.putExtra("Message",a.get(i));
                    Log.i("hiiiip",a.get(i));
                    startService(intent);
                }
            }
        });

    }
}
