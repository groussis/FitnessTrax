package dev.cguagliano.fitnesstrax;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;


public class HOMESCREEN extends AppCompatActivity {

    //ImageButton button_profile;
    //public ImageButton button_addfood;
    //public ImageButton button_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen); //apply homescreen layout

        Toolbar actionBarToolbar = (Toolbar) findViewById(R.id.my_toolbar); //reference toolbar
        setSupportActionBar(actionBarToolbar); //set actionbar to be a toolbar
        actionBarToolbar.setNavigationIcon(R.drawable.menu_icon2); //set navigation drawer icon
        actionBarToolbar.setNavigationContentDescription("Menu"); //description for impaired users

        //addImageButtons();
        //setButtonResources();
        //actionBarToolbar.setLogo(R.drawable.fitnesswithman);
        //actionBarToolbar.setLogoDescription("FitnessTrax");
    }
/*
    public void addImageButtons(){
        button_profile = (ImageButton) findViewById(R.id.button_profile);
        //ImageButton button_addfood = (ImageButton) findViewById(R.id.button_addfood);
        //ImageButton button_progress = (ImageButton) findViewById(R.id.button_progress);
    }

    public void setButtonResources(){
        button_profile.setImageResource(R.drawable.menu_icon2);
    } */
}
