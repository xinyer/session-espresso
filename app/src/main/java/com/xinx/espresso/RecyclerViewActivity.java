package com.xinx.espresso;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(new MyAdapter());
    }

    private class MyAdapter extends RecyclerView.Adapter<VH> {

        final String[] array = new String[] {"A", "B", "C", "D", "E", "F", "G"};

        @NonNull
        @Override
        public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            return new VH(LayoutInflater.from(RecyclerViewActivity.this).inflate(android.R.layout.simple_list_item_1, null, false));
        }

        @Override
        public void onBindViewHolder(@NonNull final VH vh, int position) {
            vh.text.setText(array[position]);
            vh.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((TextView) findViewById(R.id.tv_recycler_item)).setText(array[vh.getAdapterPosition()]);
                }
            });
        }

        @Override
        public int getItemCount() {
            return array.length;
        }
    }

    static class VH extends RecyclerView.ViewHolder {

        public TextView text;

        public VH(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(android.R.id.text1);
        }
    }
}
