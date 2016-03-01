package dev.cguagliano.fitnesstrax;

import android.graphics.Color;
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
    }
}
