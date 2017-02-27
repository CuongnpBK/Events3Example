package com.example.nguye.events3example;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class Events3Example extends Activity {
    private View mColorRegion;
    private int[] mColorChoices = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events3_example);
        mColorRegion = findViewById(R.id.color_region);
        Button colorbutton = (Button)findViewById(R.id.color_button);
        colorbutton.setOnClickListener(new ColorRandommizer());
    }

    private void setRegionColor(int color) {
        mColorRegion.setBackgroundColor(color);
    }
    private class ColorRandommizer implements View.OnClickListener {
        @Override

        public void onClick(View v) {
            Random generator = new Random();
            int index = generator.nextInt(mColorChoices.length);
            setRegionColor(mColorChoices[index]);
        }
    }
}
