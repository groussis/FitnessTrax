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


public class HOMESCREEN extends AppCompatActivity {

    private Toolbar actionBarToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen); //apply homescreen layout

        actionBarToolbar = (Toolbar) findViewById(R.id.my_toolbar); //reference toolbar
        setSupportActionBar(actionBarToolbar); //set actionbar to be a toolbar so we can use navDrawer

        //mDrawerList = (ListView) findViewById(R.id.left_drawer);
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

/*        actionBarToolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(HOMESCREEN.this, "Navigation icon pressed",
                        Toast.LENGTH_SHORT).show();
            }
        }); */


        //profile button
        ImageButton button_profile = (ImageButton) findViewById(R.id.button_profile);
        button_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), profile.class);
                startActivity(intent);
            }
        });

        //foodlog button
        ImageButton button_foodlog = (ImageButton) findViewById(R.id.button_foodlog);
        button_foodlog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), foodlog.class);
                startActivity(intent);
            }
        });

        //add food button
        ImageButton button_addfood = (ImageButton) findViewById(R.id.button_addfood);
        button_addfood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), addfood.class);
                startActivity(intent);
            }
        });

        //search button
        ImageButton button_search = (ImageButton) findViewById(R.id.button_searchnut);
        button_search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), search.class);
                startActivity(intent);
            }
        });

        //progress button
        ImageButton button_progress = (ImageButton) findViewById(R.id.button_progress);
        button_progress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //If drawer is open, close before opening progress button.
                //This applies only to the progress button due to the lack of buttons at the bottom
                //of our navigation drawer.
                if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
                    mDrawerLayout.closeDrawers();
                }

                Intent intent = new Intent(v.getContext(), progress.class);
                startActivity(intent);
            }
        });

        //navDrawer home button
        TextView textViewHOME = (TextView) findViewById(R.id.textViewHOME);
        textViewHOME.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDrawerLayout.closeDrawers();
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

                Intent intent = new Intent(v.getContext(), search.class);
                startActivity(intent);
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

    /** NAVIGATION DRAWER CODE **/
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
