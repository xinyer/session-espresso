package com.xinx.espresso;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        final ListView listView = findViewById(R.id.list_view);
        final String[] array = new String[] {"A", "B", "C", "D", "E", "F", "G"};
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) findViewById(R.id.tv_list_item)).setText(array[position]);
            }
        });
    }
}
