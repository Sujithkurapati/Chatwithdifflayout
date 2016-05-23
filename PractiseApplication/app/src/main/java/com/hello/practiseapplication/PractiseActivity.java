package com.hello.practiseapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hello.practiseapplication.adapter.Adapter;

import java.lang.ref.WeakReference;

public class PractiseActivity extends AppCompatActivity {

    private RecyclerView recycler_chat;
    //Adapter_Chat adapter_chat;
    Adapter adapter;
    WeakReference<Context> weakActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise);

        weakActivity = new WeakReference<Context>(getApplicationContext());
        recycler_chat = (RecyclerView) findViewById(R.id.recycler_chat);

//        Context context = weakActivity.get();
//        if (context != null) {
//            adapter_chat = new Adapter_Chat(context);
//        }
        //adapter_chat = new Adapter_Chat();
        adapter = new Adapter();
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_chat.setLayoutManager(mLayoutManager);
        recycler_chat.setItemAnimator(new DefaultItemAnimator());
        recycler_chat.setAdapter(adapter);
        //recycler_chat.setAdapter(adapter_chat);

    }
}
