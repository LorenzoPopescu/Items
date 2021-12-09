package com.example.items;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = (TextView)this.findViewById(R.id.movieText);
        textView.setText(R.string.elenco);

        String[] movies = new String[] {"Interstellar","La La Land", "The lord of the rings"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movies);

        listView = (ListView)findViewById(R.id.movieList);
        listView.setAdapter(itemsAdapter);
    }
}