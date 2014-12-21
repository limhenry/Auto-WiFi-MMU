package my.edu.mmu.wifi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity2 extends Activity {

    static int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        // Declaring the Button and Type Casting it.
        LinearLayout btn1 = (LinearLayout) findViewById(R.id.egg);

        // Setting OnClickListener on btn1
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (count==5){
                    Intent i = new Intent(MainActivity2.this, egg.class);
                    startActivity(i);
                    count =0;
                } else {
                    count++;
                }
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
