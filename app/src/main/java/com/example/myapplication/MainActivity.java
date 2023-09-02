package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_data[] myListData = new my_data[]{
                new my_data("mail", android.R.drawable.ic_dialog_email),
                new my_data("Info", android.R.drawable.ic_dialog_info),
                new my_data("Delete", android.R.drawable.ic_delete),
                new my_data("Dialer", android.R.drawable.ic_dialog_dialer),
                new my_data("Alert", android.R.drawable.ic_dialog_alert),
                new my_data("Map", android.R.drawable.ic_dialog_map),
                new my_data("Email", android.R.drawable.ic_dialog_email),
                new my_data("Info", android.R.drawable.ic_dialog_info),
                new my_data("Profile",android.R.drawable.ic_dialog_map),
                new my_data("Dialer", android.R.drawable.ic_dialog_dialer),
                new my_data("Alert", android.R.drawable.ic_dialog_alert),
                new my_data("Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        my_adapter adapter = new my_adapter(myListData);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }
}
