package com.example.farm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Get Intent
        Intent intent = getIntent();

        final String imageSelected = intent.getStringExtra("Image");
        double basePrice = intent.getDoubleExtra("PriceGlasses", 0.0);
        final Boolean uvBlockingChecked = intent.getBooleanExtra("UVBlocking",false);
        final Boolean antiReflectingChecked = intent.getBooleanExtra("AntiReflecting",false);
        final Boolean antiScratchChecked = intent.getBooleanExtra("AntiScratch",false);
        final Boolean polycarbonateChecked = intent.getBooleanExtra("Polycarbonate",false);
        final Boolean photoChromicChecked = intent.getBooleanExtra("Photochromic",false);

        //checkBox Prices
        double uvPrice, reflectPrice, scratchPrice, polyPrice, photoPrice;

        //calculate price of glasses frame plus shipping
        double totalPrice;
        double shipPrice = 24.9;
        totalPrice = basePrice + shipPrice;

        //receipt textView
        TextView first = findViewById(R.id.textView1);
           String header = "Cart(1):";
              first.setText(header);
        TextView receipt = findViewById(R.id.textView3);
        String cartContents;
        if (imageSelected.contains("ImageBlack"))
            cartContents = "Black Frame Base:\t\t\t\t\t\t\t\t\t\t\t$" + basePrice + "\n\n";
        else if (imageSelected.contains("ImageBrown")){
            cartContents = "Brown Frame Base:\t\t\t\t\t\t\t\t\t\t$" + basePrice + "\n\n";
        } else if (imageSelected.contains("ImageRed")){
            cartContents = "Red Frame Base:\t\t\t\t\t\t\t\t\t\t\t\t$" + basePrice + "\n\n";
        } else {
            cartContents = "Frame Not Selected:\t\t\t\t\t\t\t\t\t\t$\n";
        }

        //if checked, add to receipt and add price to totalPrice
        if (uvBlockingChecked){
            uvPrice = 49.9;
            totalPrice += uvPrice;
            cartContents += "-UV Blocking treatment:\t\t\t\t\t\t\t$" + uvPrice + "\n";
        }
        if (antiReflectingChecked){
            reflectPrice = 30;
            totalPrice += reflectPrice;
            cartContents += "-Anti-Reflective coating:\t\t\t\t\t\t\t$" + reflectPrice + "\n";
        }
        if (antiScratchChecked){
            scratchPrice = 35;
            totalPrice += scratchPrice;
            cartContents += "-Anti-Scratch coating:\t\t\t\t\t\t\t\t\t$" + scratchPrice + "\n";
        }
        if (polycarbonateChecked){
            polyPrice = 50;
            totalPrice += polyPrice;
            cartContents += "-Polycarbonate Lenses:\t\t\t\t\t\t\t\t$" + polyPrice + "\n";
        }
        if (photoChromicChecked){
            photoPrice = 49.9;
            totalPrice += photoPrice;
            cartContents += "-Photochromic treatment:\t\t\t\t\t\t$" + photoPrice + "\n";
        }

        receipt.setText(cartContents);

        //final price
        String totalString = "Shipping:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$" + shipPrice + "\n"
                + "Total:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$" + totalPrice + "\n";
        TextView totalView = findViewById(R.id.textView5);
        totalView.setText(totalString);

        //button hides receipt and shows order confirmation with picture
        final Button order = (Button) findViewById(R.id.button3);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CheckBox checkbox = (CheckBox) findViewById(R.id.checkBoxemail);
                EditText emailEdit = (EditText) findViewById(R.id.editText4);
                TextView emailTextView = (TextView) findViewById(R.id.confirm2);
                String emailString = emailEdit.getText().toString();

                    if (checkbox.isChecked() && emailString.isEmpty()) {
                        Toast.makeText(getApplicationContext(),
                                "You must enter an email if you are signing up.",
                                Toast.LENGTH_LONG).show();
                        return;
                    } else {
                Random random = new Random();
                String displayString =
                        "Your order number is #" +
                                random.nextInt(99999);
                        if (checkbox.isChecked() && !emailString.isEmpty()) {
                            displayString +=
                                    "\n\nA confirmation email has been sent to\n" +
                                            emailString;
                        }
                        displayString +=
                                "\n\nThank you for shopping with us!";
                        emailTextView.setText(displayString);
                        emailTextView.setVisibility(View.VISIBLE);

                TableLayout layout = (TableLayout) findViewById(R.id.tableLayout);
                layout.setVisibility(View.GONE);
                TableLayout layout2 = (TableLayout) findViewById(R.id.tableLayout2);
                layout2.setVisibility(View.GONE);
                order.setVisibility(View.GONE);
                TextView placed = (TextView) findViewById(R.id.confirm);
                placed.setVisibility(View.VISIBLE);

                switch (imageSelected){
                    case "ImageBlack1" :
                        ImageView firstImageBlack = (ImageView) findViewById(R.id.imageView2);
                        firstImageBlack.setVisibility(View.VISIBLE);
                        break;
                    case "ImageBlack2" :
                        ImageView secondImageBlack = (ImageView) findViewById(R.id.imageView3);
                        secondImageBlack.setVisibility(View.VISIBLE);
                        break;
                    case "ImageBlack3" :
                        ImageView thirdImageBlack = (ImageView) findViewById(R.id.imageView13);
                        thirdImageBlack.setVisibility(View.VISIBLE);
                        break;
                    case "ImageBrown1" :
                        ImageView firstImageBrown = (ImageView) findViewById(R.id.imageView14);
                        firstImageBrown.setVisibility(View.VISIBLE);
                        break;
                    case "ImageBrown2" :
                        ImageView secondImageBrown = (ImageView) findViewById(R.id.imageView15);
                        secondImageBrown.setVisibility(View.VISIBLE);
                        break;
                    case "ImageBrown3" :
                        ImageView thirdImageBrown = (ImageView) findViewById(R.id.imageView16);
                        thirdImageBrown.setVisibility(View.VISIBLE);
                        break;
                    case "ImageRed1" :
                        ImageView firstImageRed = (ImageView) findViewById(R.id.imageView17);
                        firstImageRed.setVisibility(View.VISIBLE);
                        break;
                    case "ImageRed2" :
                        ImageView secondImageRed = (ImageView) findViewById(R.id.imageView18);
                        secondImageRed.setVisibility(View.VISIBLE);
                        break;
                    case "ImageRed3" :
                        ImageView thirdImageRed = (ImageView) findViewById(R.id.imageView19);
                        thirdImageRed.setVisibility(View.VISIBLE);
                        break;
                    default:
                        break;
                }

                }
            }
        });
    }
}
