package com.example.farm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    //Radio Buttons
    private RadioButton brown;
    private RadioButton red;
    private RadioButton black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button
        Button btn = (Button) findViewById(R.id.button);

        //Spinner + Adapter + Resource
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.frame_material, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        brown = findViewById(R.id.radButtonBrown);
        red = findViewById(R.id.radButtonRed);
        black = findViewById(R.id.radButtonBlack);
        //Load Radio Button Clicked Last Before App Closed
        loadMethod();
        // Button on Click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Initialize variables
                String userColorGlasses;

                // Assigning Controllers to values

                    //Text Box
                EditText leftEye = findViewById(R.id.txtBoxLeftEye);
                EditText rightEye = findViewById(R.id.txtBoxRightEye);
                        // Get Values
                String rightEyeValue = rightEye.getText().toString();
                String leftEyeValue = leftEye.getText().toString();
                        // Validate values
                if(rightEyeValue.isEmpty() || leftEyeValue.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Your prescription glasses are empty.", Toast.LENGTH_LONG).show();
                    return;
                }


                        //Get Values and validate selection
                if(brown.isChecked()){
                    userColorGlasses = "Brown";
                } else if (red.isChecked()){
                    userColorGlasses = "Red";
                } else if (black.isChecked()){
                    userColorGlasses = "Black";
                } else {
                    Toast.makeText(getApplicationContext(), "You haven't select any color for your frames!", Toast.LENGTH_LONG).show();
                    return;
                }
                    //Save Radio Button Clicked
                    saveMethod();
                    //Get Value Spinner
                String elementSpinner = spinner.getSelectedItem().toString();

                    //CheckBox Selected
                CheckBox uvBlocking = (CheckBox) findViewById(R.id.checkBoxUV);
                CheckBox antiReflecting = (CheckBox) findViewById(R.id.checkBoxAntiReflecting);
                CheckBox antiScratch = (CheckBox) findViewById(R.id.checkBoxAntiScratch);
                CheckBox polyCarbonate = (CheckBox) findViewById(R.id.checkBoxPolycarbonate);
                CheckBox photoChromic = (CheckBox) findViewById(R.id.checkBoxPhotochromic);
                    //Get Checkbox Selected Values as boolean
                boolean uvBlockingChecked = uvBlocking.isChecked();
                boolean antiReflectingChecked = antiReflecting.isChecked();
                boolean antiScratchChecked = antiScratch.isChecked();
                boolean polyCarbonateChecked = polyCarbonate.isChecked();
                boolean photoChromicChecked = photoChromic.isChecked();

                //Start Intent to next activity
                Intent startActivity = new Intent(MainActivity.this, Main2Activity.class);
                    //Transfer values to the next activity
                startActivity.putExtra("RightEye", rightEyeValue);
                startActivity.putExtra("LeftEye", leftEyeValue);
                startActivity.putExtra("Color", userColorGlasses);
                startActivity.putExtra("Spinner", elementSpinner);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("Polycarbonate", polyCarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
    }

    public void saveMethod(){
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("brChecked", brown.isChecked());
        editor.putBoolean("redChecked", red.isChecked());
        editor.putBoolean("blChecked", black.isChecked());
        editor.apply();
    }

    public void loadMethod(){
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        brown.setChecked(sharedPreferences.getBoolean("brChecked", false));
        red.setChecked(sharedPreferences.getBoolean("redChecked", false));
        black.setChecked(sharedPreferences.getBoolean("blChecked", false));
    }
}
