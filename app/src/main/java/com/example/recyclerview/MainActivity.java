package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.hulk,"Pavan","10:45 AM","How are jwu?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk2,"Pavan1","10:45 AM","How are thyou baby?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk3,"jhewfuwejd","10:00 AM","How are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk4,"Pavan420","11:45 AM","How rknvbwe v you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk,"Pavan360","10:45 AM","How are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk2,"Pavan120","10:20 AM","How are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk,"naveeneeeee","09:45 AM","How mbyvvare you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk4,"Pavanebgfe","10:45 AM","How are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk,"Pavanebdfb","10:45 AM","How finally are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk2,"Pavanmjm","10:45 AM","How are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk,"naveenberb","10:45 AM","How are man fou?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk3,"Pavanbtrgnhyj","10:45 AM","How are you?","--------------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.hulk,"Pavanthh","10:45 AM","How avdfhthre you?","--------------------------------------------------------------------"));

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}