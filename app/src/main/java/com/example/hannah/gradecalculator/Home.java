package com.example.hannah.gradecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView pict;
    Button math135button;
    Button math137button;
    Button cs135button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pict = (ImageView) findViewById(R.id.picture);
        math135button = (Button) findViewById(R.id.math135button);
        math137button = (Button) findViewById(R.id.math137button);
        cs135button = (Button) findViewById(R.id.cs135button);

        final Intent math135activity = new Intent(this, MATH135.class);
        final Intent math137activity = new Intent(this, MATH137.class);
        final Intent cs135activity = new Intent(this, CS135.class);

        math135button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(math135activity);
            }
        });

        math137button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(math137activity);
            }
        });

        cs135button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cs135activity);
            }
        });

    }

    public void math135activity() {

    }
}
