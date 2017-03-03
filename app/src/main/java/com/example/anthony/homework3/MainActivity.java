package com.example.anthony.homework3;

/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView currentTempTextView = (TextView) findViewById(R.id.current_temp);
        currentTempTextView.setText("Current Temperature: " + currentTemp);
        TextView todayTempTextView = (TextView) findViewById(R.id.today_temp);
        todayTempTextView.setText("Today's Forecast: " + todayHigh + " / " + todayLow);
        TextView tomTempTextView = (TextView) findViewById(R.id.tom_temp);
        tomTempTextView.setText("Tomorrow's Forecast: " + tomHigh + " / " + tomLow);
        TextView afterTomTempTextView = (TextView) findViewById(R.id.after_tom_temp);
        afterTomTempTextView.setText("2 Days Out Forecast: " + twoDayHigh + " / " + twoDayLow);

    }
    int currentTemp = 35;
    int todayHigh = 47;
    int todayLow = 23;
    int tomHigh = 55;
    int tomLow = 21;
    int twoDayHigh = 23;
    int twoDayLow = 11;



      /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {



    }

}
