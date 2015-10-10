package tonispihus.funfact;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class funfactactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfactactivity);

        //Declare our View variables and assign them the views from the layout file
        final TextView factlabel = (TextView) findViewById(R.id.facttextView);
        Button showFactButton = (Button) findViewById(R.id.showfactbutton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The button was Clicked, so update the fact label with a new fact.
                String fact = "";
                //Randomly select fact.
                Random randomGenerator = new Random();//Construct a new number generator
                int randomNumber = randomGenerator.nextInt(3);
                fact = randomNumber + "";

                //Update our label with our dynamic fact.
                factlabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.funfactactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
