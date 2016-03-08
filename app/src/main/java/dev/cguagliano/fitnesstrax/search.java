package dev.cguagliano.fitnesstrax;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.Image;
import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Chris on 3/6/2016.
 */
public class search extends AppCompatActivity{

    private Toolbar actionBarToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search); //apply search layout

        actionBarToolbar = (Toolbar) findViewById(R.id.my_toolbar); //reference toolbar
        setSupportActionBar(actionBarToolbar); //set actionbar to be a toolbar so we can use navDrawer

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                actionBarToolbar, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        mDrawerLayout.addDrawerListener(mDrawerToggle);
        //if(savedInstanceState == null){ }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);



        //navDrawer home button
        TextView textViewHOME = (TextView) findViewById(R.id.textViewHOME);
        textViewHOME.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                search.super.onBackPressed();
            }
        });

        //navDrawer profile button
        TextView textViewPROFILE = (TextView) findViewById(R.id.textViewPROFILE);
        textViewPROFILE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDrawerLayout.closeDrawers();
                Intent intent = new Intent(v.getContext(), profile.class);
                startActivity(intent);
            }
        });

        //navDrawer foodlog button
        TextView textViewFOODLOG = (TextView) findViewById(R.id.textViewFOODLOG);
        textViewFOODLOG.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDrawerLayout.closeDrawers();
                Intent intent = new Intent(v.getContext(), foodlog.class);
                startActivity(intent);
            }
        });

        //navDrawer addfood button
        TextView textViewADDFOOD = (TextView) findViewById(R.id.textViewADDFOOD);
        textViewADDFOOD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDrawerLayout.closeDrawers();
                Intent intent = new Intent(v.getContext(), addfood.class);
                startActivity(intent);
            }
        });

        //navDrawer search button
        TextView textViewSEARCH = (TextView) findViewById(R.id.textViewSEARCH);
        textViewSEARCH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDrawerLayout.closeDrawers();
            }
        });

        //navDrawer progress button
        TextView textViewPROGRESS = (TextView) findViewById(R.id.textViewPROGRESS);
        textViewPROGRESS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDrawerLayout.closeDrawers();
                Intent intent = new Intent(v.getContext(), progress.class);
                startActivity(intent);
            }
        });
    }

    /** BEGIN NAVIGATION DRAWER CODE **/
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    } */
    /** END NAVIGATION DRAWER CODE **/
}
