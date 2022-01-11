package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Task_1.Activity.RecyclerActivity_1;
import com.example.myapplication.Task_2.Activity.RecyclerActivity_2;

public class MainActivity extends AppCompatActivity {
    Button button_1,button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        button_1 = findViewById(R.id.btn_task_one);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityRecycler_1();
            }
        });
        button_2 = findViewById(R.id.btn_task_two);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityRecycler_2();
            }
        });
    }

    void openActivityRecycler_1(){
        Intent intent = new Intent(this, RecyclerActivity_1.class);
        startActivity(intent);
    }
    void openActivityRecycler_2(){
        Intent intent = new Intent(this, RecyclerActivity_2.class);
        startActivity(intent);
    }
}