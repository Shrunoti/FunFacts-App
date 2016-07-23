package com.example.shrunoti.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Shrunoti on 22-07-2016.
 */
public class ColorWheel {

    private final String[] mColors = new String[]{
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7" // lavender
    };

    public int getColor()
    {

        //the button was clicked, get new fact
        String color;
        //Randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

}

