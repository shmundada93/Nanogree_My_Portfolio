package net.mybluemix.voyagers.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button spotifyStreamer = (Button)  findViewById(R.id.spotifyStreamer);
        spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Launch Spotify Streamer App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button scoresApp = (Button)  findViewById(R.id.scoresApp);
        scoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Launch Scores App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button libraryApp = (Button)  findViewById(R.id.libraryApp);
        libraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Launch Library App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button buildItBigger = (Button)  findViewById(R.id.builtItBigger);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Launch Build It Bigger App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button xyzReader = (Button)  findViewById(R.id.XYZReader);
        xyzReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Launch XYZ Reader App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button capstoneApp = (Button)  findViewById(R.id.capstoneApp);
        capstoneApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Launch My Capstone App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
