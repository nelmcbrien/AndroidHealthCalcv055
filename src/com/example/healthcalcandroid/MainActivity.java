package com.example.healthcalcandroid;

import com.example.healthcalcandroid.CalculatorMain;
import com.example.healthcalcandroid.R;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button = (Button) findViewById(R.id.goButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	final EditText weightIn = (EditText) findViewById(R.id.weightInText);
            	final EditText feetIn = (EditText) findViewById(R.id.feetInText);
            	final EditText inchesIn = (EditText) findViewById(R.id.inchesInText);
            	final EditText ageIn = (EditText) findViewById(R.id.ageInText);
            	final EditText output = (EditText) findViewById(R.id.outputText);
            	final RadioButton female = (RadioButton) findViewById(R.id.radioButtonFemale);
            	
            	
            	String gender = "male";
            	double weightInPounds = Double.parseDouble(weightIn.getText().toString());
            	double heightFeet = Double.parseDouble(feetIn.getText().toString());
            	double heightInches = Double.parseDouble(inchesIn.getText().toString());
            	double age = Double.parseDouble(ageIn.getText().toString());
            	
            	
            	if(female.isChecked()) {
            		gender = "female";
            	}
            	//Validation Needed
            	
            	
            	String preOut = CalculatorMain.run(gender, weightInPounds, heightFeet, heightInches, age);
            	
            	output.setText(preOut);
            	
            }
        });
		
		
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}	
}
