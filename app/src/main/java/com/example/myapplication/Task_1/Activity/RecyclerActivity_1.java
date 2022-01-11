package com.example.myapplication.Task_1.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.myapplication.Task_1.Model.Member;
import com.example.myapplication.R;
import com.example.myapplication.Task_1.Adapter.RecyclerAdapter_1;

import java.util.ArrayList;

public class RecyclerActivity_1 extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);
        initViews();
    }

    void initViews(){
        context =this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

        ArrayList<Member> members = new ArrayList<>();

        for (int i=0;i<=20;i++){
            members.add(new Member(R.mipmap.ic_profile,"Yahya " + i,"Mahmudiy " + i));
        }

        refreshAdapter(members);
    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter_1 adapter = new RecyclerAdapter_1(context,members);
        recyclerView.setAdapter(adapter);
    }
}

