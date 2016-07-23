package com.example.shrunoti.funfacts;

import java.util.Random;

public class FactBook {

    private final String[] mFacts = new String[]{
            "I am 20.",
            "I like chicken.",
            "I have short hair.",
            "I know 3 languages",
            "I am Indian.",
            "My favorite color is Black"
    };

    public String getFact()
    {

        //the button was clicked, get new fact
        String fact = "";
        //Randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }

}
