package com.example.hannah.gradecalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MATH137 extends AppCompatActivity {

    EditText ta1GradeField;
    EditText ta2GradeField;
    EditText ta3GradeField;
    EditText ea1GradeField;
    EditText ea2GradeField;
    EditText ea3GradeField;
    EditText ea4GradeField;
    EditText ea5GradeField;
    EditText ea6GradeField;
    EditText wa1GradeField;
    EditText wa2GradeField;
    EditText wa3GradeField;
    EditText wa4GradeField;
    EditText midtermGradeField;
    EditText finalGradeField;
    TextView overallGradeField;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math137);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SharedPreferences math137Grades = getSharedPreferences("math137Grades", Context.MODE_PRIVATE);

        String savedta1Grade = math137Grades.getString("ta1Grade", "");
        String savedta2Grade = math137Grades.getString("ta2Grade", "");
        String savedta3Grade = math137Grades.getString("ta3Grade", "");
        String savedea1Grade = math137Grades.getString("ea1Grade", "");
        String savedea2Grade = math137Grades.getString("ea2Grade", "");
        String savedea3Grade = math137Grades.getString("ea3Grade", "");
        String savedea4Grade = math137Grades.getString("ea4Grade", "");
        String savedea5Grade = math137Grades.getString("ea5Grade", "");
        String savedea6Grade = math137Grades.getString("ea6Grade", "");
        String savedwa1Grade = math137Grades.getString("wa1Grade", "");
        String savedwa2Grade = math137Grades.getString("wa2Grade", "");
        String savedwa3Grade = math137Grades.getString("wa3Grade", "");
        String savedwa4Grade = math137Grades.getString("wa4Grade", "");
        String savedMidtermGrade = math137Grades.getString("midtermGrade", "");
        String savedFinalGrade = math137Grades.getString("finalGrade", "");
        String savedOverallGrade = math137Grades.getString("overallGrade", "");

        ta1GradeField = (EditText) findViewById(R.id.ta1Grade);
        ta2GradeField = (EditText) findViewById(R.id.ta2Grade);
        ta3GradeField = (EditText) findViewById(R.id.ta3Grade);
        ea1GradeField = (EditText) findViewById(R.id.ea1Grade);
        ea2GradeField = (EditText) findViewById(R.id.ea2Grade);
        ea3GradeField = (EditText) findViewById(R.id.ea3Grade);
        ea4GradeField = (EditText) findViewById(R.id.ea4Grade);
        ea5GradeField = (EditText) findViewById(R.id.ea5Grade);
        ea6GradeField = (EditText) findViewById(R.id.ea6Grade);
        wa1GradeField = (EditText) findViewById(R.id.wa1Grade);
        wa2GradeField = (EditText) findViewById(R.id.wa2Grade);
        wa3GradeField = (EditText) findViewById(R.id.wa3Grade);
        wa4GradeField = (EditText) findViewById(R.id.wa4Grade);
        midtermGradeField = (EditText) findViewById(R.id.midtermGrade);
        finalGradeField = (EditText) findViewById(R.id.finalGrade);
        overallGradeField = (TextView) findViewById(R.id.overallGrade);

        ta1GradeField.setText(savedta1Grade);
        ta2GradeField.setText(savedta2Grade);
        ta3GradeField.setText(savedta3Grade);
        ea1GradeField.setText(savedea1Grade);
        ea2GradeField.setText(savedea2Grade);
        ea3GradeField.setText(savedea3Grade);
        ea4GradeField.setText(savedea4Grade);
        ea5GradeField.setText(savedea5Grade);
        ea6GradeField.setText(savedea6Grade);
        wa1GradeField.setText(savedwa1Grade);
        wa2GradeField.setText(savedwa2Grade);
        wa3GradeField.setText(savedwa3Grade);
        wa4GradeField.setText(savedwa4Grade);
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
        int waWeight = 10;
        int midtermWeight = 25;
        int finalWeight = 55;

        int cma0Grade = 100;
        int ta1Grade = 0;
        int ta2Grade = 0;
        int ta3Grade = 0;
        int ea1Grade = 0;
        int ea2Grade = 0;
        int ea3Grade = 0;
        int ea4Grade = 0;
        int ea5Grade = 0;
        int ea6Grade = 0;
        int wa1Grade = 0;
        int wa2Grade = 0;
        int wa3Grade = 0;
        int wa4Grade = 0;
        int midtermGrade = 0;
        int finalGrade = 0;

        String sta1Grade = ta1GradeField.getText().toString();
        String sta2Grade = ta2GradeField.getText().toString();
        String sta3Grade = ta3GradeField.getText().toString();
        String sea1Grade = ea1GradeField.getText().toString();
        String sea2Grade = ea2GradeField.getText().toString();
        String sea3Grade = ea3GradeField.getText().toString();
        String sea4Grade = ea4GradeField.getText().toString();
        String sea5Grade = ea5GradeField.getText().toString();
        String sea6Grade = ea6GradeField.getText().toString();
        String swa1Grade = wa1GradeField.getText().toString();
        String swa2Grade = wa2GradeField.getText().toString();
        String swa3Grade = wa3GradeField.getText().toString();
        String swa4Grade = wa4GradeField.getText().toString();


        String[] sassignmentGrades = new String[]{sta1Grade, sta2Grade, sta3Grade,
                sea1Grade, sea2Grade, sea3Grade, sea4Grade, sea5Grade, sea6Grade};
        String[] swaGrades = new String[]{swa1Grade, swa2Grade, swa3Grade, swa4Grade};
        String smidtermGrade = midtermGradeField.getText().toString();
        String sfinalGrade = finalGradeField.getText().toString();

        int assignmentsCompleted = 10;

        for (int i = 0; i < sassignmentGrades.length; i++) {
            if (sassignmentGrades[i].matches("")) {
                assignmentsCompleted--;
            }
        }

        int waCompleted = 4;

        for (int i = 0; i < swaGrades.length; i++) {
            if (swaGrades[i].matches("")) {
                waCompleted--;
            }
        }

        if (!sta1Grade.matches("")) {
            ta1Grade = Integer.parseInt(ta1GradeField.getText().toString());
        }

        if (!sta2Grade.matches("")) {
            ta2Grade = Integer.parseInt(ta2GradeField.getText().toString());
        }

        if (!sta3Grade.matches("")) {
            ta3Grade = Integer.parseInt(ta3GradeField.getText().toString());
        }

        if (!sea1Grade.matches("")) {
            ea1Grade = Integer.parseInt(ea1GradeField.getText().toString());
        }

        if (!sea2Grade.matches("")) {
            ea2Grade = Integer.parseInt(ea2GradeField.getText().toString());
        }

        if (!sea3Grade.matches("")) {
            ea3Grade = Integer.parseInt(ea3GradeField.getText().toString());
        }

        if (!sea4Grade.matches("")) {
            ea1Grade = Integer.parseInt(ea4GradeField.getText().toString());
        }

        if (!sea5Grade.matches("")) {
            ea2Grade = Integer.parseInt(ea5GradeField.getText().toString());
        }

        if (!sea6Grade.matches("")) {
            ea3Grade = Integer.parseInt(ea6GradeField.getText().toString());
        }

        if (!swa1Grade.matches("")) {
            wa1Grade = Integer.parseInt(wa1GradeField.getText().toString());
        }

        if (!swa2Grade.matches("")) {
            wa2Grade = Integer.parseInt(wa2GradeField.getText().toString());
        }

        if (!swa3Grade.matches("")) {
            wa3Grade = Integer.parseInt(wa3GradeField.getText().toString());
        }

        if (!swa4Grade.matches("")) {
            wa4Grade = Integer.parseInt(wa4GradeField.getText().toString());
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

        int overallGradeCalculated;

        if (waCompleted > 0) {
            overallGradeCalculated = ((cma0Grade + ta1Grade + ta2Grade + ta3Grade + ea1Grade + ea2Grade
                    + ea3Grade + ea4Grade + ea5Grade + ea6Grade) / assignmentsCompleted * assignmentsWeight
                    + (wa1Grade + wa2Grade + wa3Grade + wa4Grade) / waCompleted * waWeight +
                    midtermGrade * midtermWeight + finalGrade * finalWeight) /
                    (assignmentsWeight + waWeight + midtermWeight + finalWeight);
        } else {
            overallGradeCalculated = ((cma0Grade + ta1Grade + ta2Grade + ta3Grade + ea1Grade + ea2Grade
                    + ea3Grade + ea4Grade + ea5Grade + ea6Grade) / assignmentsCompleted * assignmentsWeight
                    + (midtermGrade * midtermWeight + finalGrade * finalWeight)) /
                    (assignmentsWeight + midtermWeight + finalWeight);
        }

        overallGradeField.setText(String.valueOf(overallGradeCalculated));

    }

    public void saveGrades(View view) {
        SharedPreferences math137grades = getSharedPreferences("math137Grades", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = math137grades.edit();
        editor.putString("ta1Grade", ta1GradeField.getText().toString());
        editor.putString("ta2Grade", ta2GradeField.getText().toString());
        editor.putString("ta3Grade", ta3GradeField.getText().toString());
        editor.putString("ea1Grade", ea1GradeField.getText().toString());
        editor.putString("ea2Grade", ea2GradeField.getText().toString());
        editor.putString("ea3Grade", ea3GradeField.getText().toString());
        editor.putString("ea4Grade", ea4GradeField.getText().toString());
        editor.putString("ea5Grade", ea5GradeField.getText().toString());
        editor.putString("ea6Grade", ea6GradeField.getText().toString());
        editor.putString("wa1Grade", wa1GradeField.getText().toString());
        editor.putString("wa2Grade", wa2GradeField.getText().toString());
        editor.putString("wa3Grade", wa3GradeField.getText().toString());
        editor.putString("wa4Grade", wa4GradeField.getText().toString());
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_save) {
            saveGrades(null);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

