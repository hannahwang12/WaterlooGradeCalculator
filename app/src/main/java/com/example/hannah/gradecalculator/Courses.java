package com.example.hannah.gradecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Courses extends AppCompatActivity {

    Button math135Field;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      //  fab.setImageResource(R.drawable.ic_shopping_cart_white);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          //      newCourse();
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final Intent intent = new Intent(this, MATH135.class);
        math135Field = (Button) findViewById(R.id.math135);
        math135Field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);

                //    startActivity(intent);
            }
        });

    }
/*
    public void newCourse() {
        CharSequence courses[] = new CharSequence[] {"CS 135", "CS 136",
                "MATH 135", "MATH 136", "MATH 137", "MATH 138", };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add a Course");
        builder.setItems(courses, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch(which){
                    case 2:
                        newMath135();
                        break;

                }
                // the user clicked on colors[which]
            }
        });
        builder.show();
    }
*/
    public void newMath135() {


    }



}
