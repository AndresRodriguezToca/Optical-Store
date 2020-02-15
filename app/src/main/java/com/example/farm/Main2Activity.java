package com.example.farm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Get Intent
        Intent intent = getIntent();

        String colorValue = intent.getStringExtra("Color");
        final Boolean uvBlockingChecked = intent.getBooleanExtra("UVBlocking",false);
        final Boolean antiReflectingChecked = intent.getBooleanExtra("AntiReflecting",false);
        final Boolean antiScratchChecked = intent.getBooleanExtra("AntiScratch",false);
        final Boolean polycarbonateChecked = intent.getBooleanExtra("Polycarbonate",false);
        final Boolean photoChromicChecked = intent.getBooleanExtra("Photochromic",false);

        //Show correct table to customer
        if (colorValue.equals("Black")){
            TableLayout layout = (TableLayout) findViewById(R.id.tblBlack);
            layout.setVisibility(View.VISIBLE);
        } else if (colorValue.equals("Red")){
            TableLayout layout = (TableLayout) findViewById(R.id.tblRed);
            layout.setVisibility(View.VISIBLE);
        } else{
            TableLayout layout = (TableLayout) findViewById(R.id.tblBrown);
            layout.setVisibility(View.VISIBLE);
        }

        //Image Interaction
            //Black Images
        ImageView firstImageBlack = (ImageView) findViewById(R.id.imageView4);
        ImageView secondImageBlack = (ImageView) findViewById(R.id.imageView5);
        ImageView thirdImageBlack = (ImageView) findViewById(R.id.imageView6);
            //Red Images
        ImageView firstImageRed = (ImageView) findViewById(R.id.imageView7);
        ImageView secondImageRed = (ImageView) findViewById(R.id.imageView8);
        ImageView thirdImageRed = (ImageView) findViewById(R.id.imageView9);
            //Brown Images
        ImageView firstImageBrown = (ImageView) findViewById(R.id.imageView10);
        ImageView secondImageBrown = (ImageView) findViewById(R.id.imageView11);
        ImageView thirdImageBrown = (ImageView) findViewById(R.id.imageView12);

        //Event on black image click
        firstImageBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 150;
                String imageSelected = "ImageBlack1";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
        secondImageBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 230;
                String imageSelected = "ImageBlack2";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
        thirdImageBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 189;
                String imageSelected = "ImageBlack3";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });

        //Event on red image click
        firstImageRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 150;
                String imageSelected = "ImageRed1";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
        secondImageRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 230;
                String imageSelected = "ImageRed2";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
        thirdImageRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 189;
                String imageSelected = "ImageRed3";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });

        //Event on brown image click
        firstImageBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 150;
                String imageSelected = "ImageBrown1";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
        secondImageBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 230;
                String imageSelected = "ImageBrown2";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });
        thirdImageBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivity = new Intent(Main2Activity.this, Main3Activity.class);
                double priceGlasses = 189;
                String imageSelected = "ImageBrown3";
                startActivity.putExtra("PriceGlasses", priceGlasses);
                startActivity.putExtra("UVBlocking", uvBlockingChecked);
                startActivity.putExtra("AntiScratch", antiScratchChecked);
                startActivity.putExtra("AntiReflecting", antiReflectingChecked);
                startActivity.putExtra("Polycarbonate", polycarbonateChecked);
                startActivity.putExtra("Photochromic", photoChromicChecked);
                startActivity(startActivity);
            }
        });

    }
}