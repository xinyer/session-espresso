package com.xinx.espresso;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        final ViewGroup root = findViewById(R.id.layout_root);

        final ListView listView = findViewById(R.id.list_view);
        final String[] array = new String[] {"A", "B", "C", "D", "E", "F", "G"};
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = array[position];
                Snackbar.make(root, s, Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
