package com.example.estherliu.appassignment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
<<<<<<< HEAD:app/src/main/java/com/example/estherliu/appassignment/MainActivitysd.java
import android.support.v7.app.ActionBarDrawerToggle;
=======
>>>>>>> c4b81f89ebac2839ee131e6ef51967ce347f0768:app/src/main/java/com/example/estherliu/appassignment/MainActivity.java
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD:app/src/main/java/com/example/estherliu/appassignment/MainActivitysd.java
import android.widget.Toolbar;
=======
import android.widget.Button;
>>>>>>> c4b81f89ebac2839ee131e6ef51967ce347f0768:app/src/main/java/com/example/estherliu/appassignment/MainActivity.java

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Button button;

<<<<<<< HEAD:app/src/main/java/com/example/estherliu/appassignment/MainActivitysd.java
public class MainActivitysd extends AppCompatActivity {
=======
public class MainActivity extends AppCompatActivity {
    //private static int SPLASH_TIME_OUT = 4000;

    setContentView(R.layout.activity_main);

>>>>>>> c4b81f89ebac2839ee131e6ef51967ce347f0768:app/src/main/java/com/example/estherliu/appassignment/MainActivity.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/com/example/estherliu/appassignment/MainActivitysd.java
        setContentView(R.layout.activity_main);

=======
        setContentView(R.layout.landing_page);
}
        //initialise button
        button = (Button) findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                openLandingPage();
            }
        });
>>>>>>> c4b81f89ebac2839ee131e6ef51967ce347f0768:app/src/main/java/com/example/estherliu/appassignment/MainActivity.java

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

      /*  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //toolbar
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
<<<<<<< HEAD:app/src/main/java/com/example/estherliu/appassignment/MainActivitysd.java
    */}
=======
        }

//    public void openLandingPage() {
//        Intent intent = new Intent(this, LandingPage.class);
//        startActivity(intent);
//    }
>>>>>>> c4b81f89ebac2839ee131e6ef51967ce347f0768:app/src/main/java/com/example/estherliu/appassignment/MainActivity.java

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
<<<<<<< HEAD:app/src/main/java/com/example/estherliu/appassignment/MainActivitysd.java
=======
    }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
>>>>>>> c4b81f89ebac2839ee131e6ef51967ce347f0768:app/src/main/java/com/example/estherliu/appassignment/MainActivity.java
    }
}

}
