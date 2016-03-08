package com.example.priyasindkar.retrofitmvpdemo.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.priyasindkar.retrofitmvpdemo.R;
import com.example.priyasindkar.retrofitmvpdemo.getApi.GetServiceActivity;
import com.example.priyasindkar.retrofitmvpdemo.postApi.PostServiceActivity;

/**
 * Created by priyasindkar on 03-03-2016.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getbtn = (Button) findViewById(R.id.getbtn);
        Button postbtn = (Button) findViewById(R.id.postbtn);

        getbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GetServiceActivity.class);
                startActivity(intent);
            }
        });

        postbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PostServiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
