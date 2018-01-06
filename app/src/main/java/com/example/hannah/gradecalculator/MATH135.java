package com.example.hannah.gradecalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MATH135 extends AppCompatActivity {

    EditText a0GradeField;
    EditText a1GradeField;
    EditText a2GradeField;
    EditText a3GradeField;
    EditText a4GradeField;
    EditText a5GradeField;
    EditText a6GradeField;
    EditText a7GradeField;
    EditText a8GradeField;
    EditText a9GradeField;
    EditText a10GradeField;
    EditText midtermGradeField;
    EditText finalGradeField;
    TextView overallGradeField;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math135);

        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Get saved user inputted data
        SharedPreferences math135grades = getSharedPreferences("math135Grades", Context.MODE_PRIVATE);

        String saveda0Grade = math135grades.getString("a0Grade", "");
        String saveda1Grade = math135grades.getString("a1Grade", "");
        String saveda2Grade = math135grades.getString("a2Grade", "");
        String saveda3Grade = math135grades.getString("a3Grade", "");
        String saveda4Grade = math135grades.getString("a4Grade", "");
        String saveda5Grade = math135grades.getString("a5Grade", "");
        String saveda6Grade = math135grades.getString("a6Grade", "");
        String saveda7Grade = math135grades.getString("a7Grade", "");
        String saveda8Grade = math135grades.getString("a8Grade", "");
        String saveda9Grade = math135grades.getString("a9Grade", "");
        String saveda10Grade = math135grades.getString("a10Grade", "");
        String savedMidtermGrade = math135grades.getString("midtermGrade", "");
        String savedFinalGrade = math135grades.getString("finalGrade", "");
        String savedOverallGrade = math135grades.getString("overallGrade", "");

        a0GradeField = (EditText) findViewById(R.id.a0Grade);
        a1GradeField = (EditText) findViewById(R.id.a1Grade);
        a2GradeField = (EditText) findViewById(R.id.a2Grade);
        a3GradeField = (EditText) findViewById(R.id.a3Grade);
        a4GradeField = (EditText) findViewById(R.id.a4Grade);
        a5GradeField = (EditText) findViewById(R.id.a5Grade);
        a6GradeField = (EditText) findViewById(R.id.a6Grade);
        a7GradeField = (EditText) findViewById(R.id.a7Grade);
        a8GradeField = (EditText) findViewById(R.id.a8Grade);
        a9GradeField = (EditText) findViewById(R.id.a9Grade);
        a10GradeField = (EditText) findViewById(R.id.a10Grade);
        midtermGradeField = (EditText) findViewById(R.id.midtermGrade);
        finalGradeField = (EditText) findViewById(R.id.finalGrade);
        overallGradeField = (TextView) findViewById(R.id.overallGrade);

        a0GradeField.setText(saveda0Grade);
        a1GradeField.setText(saveda1Grade);
        a2GradeField.setText(saveda2Grade);
        a3GradeField.setText(saveda3Grade);
        a4GradeField.setText(saveda4Grade);
        a5GradeField.setText(saveda5Grade);
        a6GradeField.setText(saveda6Grade);
        a7GradeField.setText(saveda7Grade);
        a8GradeField.setText(saveda8Grade);
        a9GradeField.setText(saveda9Grade);
        a10GradeField.setText(saveda10Grade);
        midtermGradeField.setText(savedMidtermGrade);
        finalGradeField.setText(savedFinalGrade);
        overallGradeField.setText(savedOverallGrade);

        calculateButton = (Button) findViewById(R.id.calculate);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });


    }

    public void calculate() {
        int assignmentsWeight = 10;
        int midtermWeight = 30;
        int finalWeight = 60;

        int a0Grade = 0;
        int a1Grade = 0;
        int a2Grade = 0;
        int a3Grade = 0;
        int a4Grade = 0;
        int a5Grade = 0;
        int a6Grade = 0;
        int a7Grade = 0;
        int a8Grade = 0;
        int a9Grade = 0;
        int a10Grade = 0;
        int midtermGrade = 0;
        int finalGrade = 0;

        String sa0Grade = a0GradeField.getText().toString();
        String sa1Grade = a1GradeField.getText().toString();
        String sa2Grade = a2GradeField.getText().toString();
        String sa3Grade = a3GradeField.getText().toString();
        String sa4Grade = a4GradeField.getText().toString();
        String sa5Grade = a5GradeField.getText().toString();
        String sa6Grade = a6GradeField.getText().toString();
        String sa7Grade = a7GradeField.getText().toString();
        String sa8Grade = a8GradeField.getText().toString();
        String sa9Grade = a9GradeField.getText().toString();
        String sa10Grade = a10GradeField.getText().toString();

        String[] sassignmentGrades = new String[]{sa0Grade, sa1Grade, sa2Grade, sa3Grade, sa4Grade,
                sa5Grade, sa6Grade, sa7Grade, sa8Grade, sa9Grade, sa10Grade};
        String smidtermGrade = midtermGradeField.getText().toString();
        String sfinalGrade = finalGradeField.getText().toString();

        int assignmentsCompleted = 11;

        for (int i = 0; i < sassignmentGrades.length; i++) {
            if (sassignmentGrades[i].matches("")) {
                assignmentsCompleted--;
            }
        }

        if (!sa0Grade.matches("")) {
            a0Grade = Integer.parseInt(a0GradeField.getText().toString());
        }

        if (!sa1Grade.matches("")) {
            a1Grade = Integer.parseInt(a1GradeField.getText().toString());
        }

        if (!sa2Grade.matches("")) {
            a2Grade = Integer.parseInt(a2GradeField.getText().toString());
        }

        if (!sa3Grade.matches("")) {
            a3Grade = Integer.parseInt(a3GradeField.getText().toString());
        }

        if (!sa4Grade.matches("")) {
            a4Grade = Integer.parseInt(a4GradeField.getText().toString());
        }

        if (!sa5Grade.matches("")) {
            a5Grade = Integer.parseInt(a5GradeField.getText().toString());
        }

        if (!sa6Grade.matches("")) {
            a6Grade = Integer.parseInt(a6GradeField.getText().toString());
        }

        if (!sa7Grade.matches("")) {
            a7Grade = Integer.parseInt(a7GradeField.getText().toString());
        }

        if (!sa8Grade.matches("")) {
            a8Grade = Integer.parseInt(a8GradeField.getText().toString());
        }

        if (!sa9Grade.matches("")) {
            a9Grade = Integer.parseInt(a9GradeField.getText().toString());
        }

        if (!sa10Grade.matches("")) {
            a10Grade = Integer.parseInt(a10GradeField.getText().toString());
        }



        if (smidtermGrade.matches("")) {
            midtermWeight = 0;
        } else {
            midtermGrade = Integer.parseInt(midtermGradeField.getText().toString());
        }

        if (sfinalGrade.matches("")) {
            finalWeight = 0;
        } else {
            finalGrade = Integer.parseInt(finalGradeField.getText().toString());
        }

        int[] assignmentGrades = new int[]{a0Grade, a1Grade, a2Grade, a3Grade, a4Grade, a5Grade,
                a6Grade, a7Grade, a8Grade, a9Grade, a10Grade};

        int lowestAssignmentGrade = 100;

        for (int i = 0; i < assignmentGrades.length; i++) {
            if (assignmentGrades[i] > 0 && assignmentGrades[i] < lowestAssignmentGrade) {
                lowestAssignmentGrade = assignmentGrades[i];
            }
        }

        int overallGradeCalculated;

        if (assignmentsCompleted > 1) {
            overallGradeCalculated = ((a0Grade + a1Grade + a2Grade + a3Grade + a4Grade + a5Grade
                    + a6Grade + a7Grade + a8Grade + a9Grade + a10Grade - lowestAssignmentGrade) /
                    (assignmentsCompleted - 1) * assignmentsWeight + midtermGrade * midtermWeight
                    + finalGrade * finalWeight) / (assignmentsWeight + midtermWeight + finalWeight);
        } else if (assignmentsCompleted == 1){
            overallGradeCalculated = ((a0Grade + a1Grade + a2Grade + a3Grade + a4Grade + a5Grade
                    + a6Grade + a7Grade + a8Grade + a9Grade + a10Grade) /
                    assignmentsCompleted * assignmentsWeight + midtermGrade * midtermWeight
                    + finalGrade * finalWeight) / (assignmentsWeight + midtermWeight + finalWeight);
        } else if (midtermWeight + finalWeight != 0) {
            overallGradeCalculated = (midtermGrade * midtermWeight + finalGrade * finalWeight) /
                    (midtermWeight + finalWeight);
        } else {
            overallGradeCalculated = 0;
        }

        overallGradeField.setText(String.valueOf(overallGradeCalculated));

    }

    // Save user inputted data
    public void saveGrades(View view) {
        SharedPreferences math135grades = getSharedPreferences("math135Grades", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = math135grades.edit();
        editor.putString("a0Grade", a0GradeField.getText().toString());
        editor.putString("a1Grade", a1GradeField.getText().toString());
        editor.putString("a2Grade", a2GradeField.getText().toString());
        editor.putString("a3Grade", a3GradeField.getText().toString());
        editor.putString("a4Grade", a4GradeField.getText().toString());
        editor.putString("a5Grade", a5GradeField.getText().toString());
        editor.putString("a6Grade", a6GradeField.getText().toString());
        editor.putString("a7Grade", a7GradeField.getText().toString());
        editor.putString("a8Grade", a8GradeField.getText().toString());
        editor.putString("a9Grade", a9GradeField.getText().toString());
        editor.putString("a10Grade", a10GradeField.getText().toString());
        editor.putString("midtermGrade", midtermGradeField.getText().toString());
        editor.putString("finalGrade", finalGradeField.getText().toString());
        editor.putString("overallGrade", overallGradeField.getText().toString());

        editor.apply();

        Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }

    // Handle menu item click
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_save) {
            saveGrades(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}