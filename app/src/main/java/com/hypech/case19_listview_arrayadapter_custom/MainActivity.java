package com.hypech.case19_listview_arrayadapter_custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Megan Fox","Scarlett Johansson","Jessica Alba","Katge Upton","Keira Knightley","Jennifer Lawrence"};
    String[] infoArray = {"Confessions of a Teenage Drama Queen","she has a star on the Hollywood Walk of Fame","Dark Angel","The Layover","Pirates of the Caribbean","She was 14 years old when a talent scout spotted her."};
    Integer[] imageArray = {R.mipmap.megan,R.mipmap.scarlet,R.mipmap.jessica,R.mipmap.kateg,R.mipmap.kerra,R.mipmap.jenniffer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customAdapter = new CustomAdapter(this, nameArray, infoArray, imageArray);

        ListView listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(customAdapter);
    }
}