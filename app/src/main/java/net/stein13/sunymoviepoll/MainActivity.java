package net.stein13.sunymoviepoll;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    // LOL Good luck Dakota. <3
    // Github setup is a total bitch.
    TextView weekday_text;
    TextView help_text;
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
    ImageButton movie1, movie2, movie3, movie4, movie5, movie6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // Weekday monday = new Weekday("monday");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent;

                sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Test Subject");
                sendIntent.putExtra(Intent.EXTRA_EMAIL, "contact@stein13.net");
                startActivity(Intent.createChooser(sendIntent, "Send Mail"));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        weekday_text  = (TextView) findViewById(R.id.day_text_view);
        help_text = (TextView) findViewById(R.id.help_text);
        movie1 = (ImageButton) findViewById(R.id.movie_1_button);
        movie2 = (ImageButton) findViewById(R.id.movie_2_button);
        movie3 = (ImageButton) findViewById(R.id.movie_3_button);
        movie4 = (ImageButton) findViewById(R.id.movie_4_button);
        movie5 = (ImageButton) findViewById(R.id.movie_5_button);
        movie6 = (ImageButton) findViewById(R.id.movie_6_button);

        setVisibilityForInterface(2);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_day1) {
            weekday_text.setText(days[0]);
            setVisibilityForInterface(1);
        } else if (id == R.id.nav_day2) {
            weekday_text.setText(days[1]);
            setVisibilityForInterface(1);

        } else if (id == R.id.nav_day3) {
            weekday_text.setText(days[2]);
            setVisibilityForInterface(1);

        } else if (id == R.id.nav_day4) {
            weekday_text.setText(days[3]);
            setVisibilityForInterface(1);

        } else if (id == R.id.nav_day5) {
            weekday_text.setText(days[4]);
            setVisibilityForInterface(1);


        } else if (id == R.id.nav_day6) {
            weekday_text.setText(days[5]);
            setVisibilityForInterface(1);

        } else if (id == R.id.nav_day7) {
            weekday_text.setText(days[6]);
            setVisibilityForInterface(1);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void setVisibilityForInterface(int mode) {
        switch(mode) {
            case 1:
                help_text.setVisibility(View.GONE);
                movie1.setVisibility(View.VISIBLE);
                movie2.setVisibility(View.VISIBLE);
                movie3.setVisibility(View.VISIBLE);
                movie4.setVisibility(View.VISIBLE);
                movie5.setVisibility(View.VISIBLE);
                movie6.setVisibility(View.VISIBLE);
                break;
            case 2:
                help_text.setVisibility(View.VISIBLE);
                movie1.setVisibility(View.GONE);
                movie2.setVisibility(View.GONE);
                movie3.setVisibility(View.GONE);
                movie4.setVisibility(View.GONE);
                movie5.setVisibility(View.GONE);
                movie6.setVisibility(View.GONE);
        }
    }
}
