package com.example.shrunoti.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFacts extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    //Declare our View Variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the views from layout file to corresponding variable
        mFactTextView= (TextView) findViewById(R.id.facttextView);
        mShowFactButton= (Button) findViewById(R.id.showFactbutton);
        mRelativeLayout= (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String fact=mFactBook.getFact();
               int color = mColorWheel.getColor();
                mFactTextView.setText(fact);

                mShowFactButton.setTextColor(color);

                mRelativeLayout.setBackgroundColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);

        Toast.makeText(FunFacts.this, "This Happened", Toast.LENGTH_SHORT).show();
    }
}
