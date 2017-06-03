package com.example.friends.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    String[] countries={"India","Pakistan","Sri Lanka","Australia","USA","China","Portugal","Germany","New Zeland","Mayanmar",
            "Thailand","Nepal"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvCountries=(ListView)this.findViewById(R.id.lvCountries);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,countries);
        lvCountries.setAdapter(adapter);




        lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),countries[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
