package com.example.farm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        /*


            DO NOT CHANGE ANYTHING FROM PREVIOUS ACTIVITIES,
            EVERYTHING WORK FINE SO FAR,
            LET ME KNOW BEFORE YOU DO SOMETHING

            ************Next steps you may have to do on activity three********************

            1. Design @activity_main3.xml as you wish!

            2. Retrieve data from previous activity and assign those to values and correct
            * data types

            3. Use conditionals (IF ELSE OR SWITCH STATEMENTS) to check if the user checked on
            * additional features on activity one (I pass those user choices as @BOOLEAN all the
            * way through from the @activity_main.xml)
                3.1 If @TRUE, create a new value and set a fixed price. Then, add it to the glass
                * cost.
                3.2 If it's @FALSE, don't do anything with it.

            4. There's also a @String that contains a text with which image the user clicked on
                4.1 You could use it to display it on the third activity "YOUR CHOICE"

            5. Display the total cost for the glass on the @activity_main3.xml


            The following are the name of the intent values you have access here:

            Image<color><number>    --> Contains the image the user clicked as string
            PriceGlasses            --> Contains the price for the frame ONLY
            UVBlocking              --> Boolean. TRUE means user clicked on it, false the opposite.
            AntiScratch             --> Boolean. TRUE means user clicked on it, false the opposite.
            AntiReflecting          --> Boolean. TRUE means user clicked on it, false the opposite.
            Polycarbonate           --> Boolean. TRUE means user clicked on it, false the opposite.
            Photochromic            --> Boolean. TRUE means user clicked on it, false the opposite.

            IF YOU NEED ME, LET ME KNOW ON SUNDAY. LET'S GET THOSE 100 PTS.
        */

    }
}
