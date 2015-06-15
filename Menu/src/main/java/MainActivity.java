package com.swatiag1101.menu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            Toast.makeText(getApplicationContext(),"Clicked On Home Item",Toast.LENGTH_LONG).show();
        }else if(id==R.id.aboutUs){
            Toast.makeText(getApplicationContext(),"Clicked On About Us Item",Toast.LENGTH_LONG).show();
        }else if(id==R.id.contactUs){
            Toast.makeText(getApplicationContext(),"Clicked On Contact Us Item",Toast.LENGTH_LONG).show();
        }else if(id==R.id.search){
            Toast.makeText(getApplicationContext(),"Clicked On Search Item",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Clicked On Video",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
