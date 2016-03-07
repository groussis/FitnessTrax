package dev.cguagliano.fitnesstrax;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Chris on 3/6/2016.
 */
public class profile extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile); //apply profile layout
    }
}
