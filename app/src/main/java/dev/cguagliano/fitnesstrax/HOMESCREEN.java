package dev.cguagliano.fitnesstrax;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.Toast;


public class HOMESCREEN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen); //apply homescreen layout

        final Toolbar actionBarToolbar = (Toolbar) findViewById(R.id.my_toolbar); //reference toolbar
        setSupportActionBar(actionBarToolbar); //set actionbar to be a toolbar
        actionBarToolbar.setNavigationIcon(R.drawable.menu_icon2); //set navigation drawer icon
        actionBarToolbar.setNavigationContentDescription("Menu"); //description for impaired users

        actionBarToolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(HOMESCREEN.this, "Navigation icon pressed",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton button_profile = (ImageButton) findViewById(R.id.button_profile);
        button_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), profile.class);
                startActivity(intent);
            }
        });

        ImageButton button_foodlog = (ImageButton) findViewById(R.id.button_foodlog);
        button_foodlog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), foodlog.class);
                startActivity(intent);
            }
        });

        ImageButton button_addfood = (ImageButton) findViewById(R.id.button_addfood);
        button_addfood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), addfood.class);
                startActivity(intent);
            }
        });

        ImageButton button_search = (ImageButton) findViewById(R.id.button_searchnut);
        button_search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), search.class);
                startActivity(intent);
            }
        });

        ImageButton button_progress = (ImageButton) findViewById(R.id.button_progress);
        button_progress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), progress.class);
                startActivity(intent);
            }
        });
    }

/*    //opens up profile page by creating an Intent
    public void button_profile(View v){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void startFoodLog(View v){
        Intent intent = new Intent(this, foodLog.class);
        startActivity(intent);
    }

    public void startUnlimited(View v) {
        Intent intent = new Intent(this, RollDice.class);
        startActivity(intent);
    }*/
}
