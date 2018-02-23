package com.example.android.quizapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import static com.example.android.quizapp.MainActivity.tekst;

import com.example.android.quizapp.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {

    ActivityMain2Binding binding;

    Button ok1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
    }

    private int points;

    public void onRadioButtonClick(View view) {

        boolean checked1 = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.correct1:

                Toast.makeText(Main2Activity.this, getString(R.string.great),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton no = (RadioButton) binding.no;
                no.setEnabled(false);
                RadioButton correct1 = (RadioButton) binding.correct1;
                correct1.setEnabled(false);
                break;
            case R.id.no:

                Toast.makeText(Main2Activity.this, getString(R.string.nie),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct1;
                correct.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.correct2:

                Toast.makeText(Main2Activity.this, getString(R.string.amazing),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton no = (RadioButton) binding.no2;
                no.setEnabled(false);
                RadioButton correct2 = (RadioButton) binding.correct2;
                correct2.setEnabled(false);
                break;

            case R.id.no2:

                Toast.makeText(Main2Activity.this, getString(R.string.wrong),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct2;
                correct.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.correct3:

                Toast.makeText(Main2Activity.this, getString(R.string.Great),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton no = (RadioButton) binding.no3;
                no.setEnabled(false);
                RadioButton correct3 = (RadioButton) binding.correct3;
                correct3.setEnabled(false);
                break;

            case R.id.no3:

                Toast.makeText(Main2Activity.this, getString(R.string.not),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct3;
                correct.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.correct4:

                Toast.makeText(Main2Activity.this, getString(R.string.youAreRight),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton no = (RadioButton) binding.no4;
                no.setEnabled(false);
                RadioButton correct4 = (RadioButton) binding.correct4;
                correct4.setEnabled(false);
                break;

            case R.id.no4:

                Toast.makeText(Main2Activity.this, getString(R.string.unfortunately),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct4;
                correct.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.correct5:

                Toast.makeText(Main2Activity.this, getString(R.string.woohoo),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton no = (RadioButton) binding.no5;
                no.setEnabled(false);
                RadioButton correct5 = (RadioButton) binding.correct5;
                correct5.setEnabled(false);
                break;

            case R.id.no5:

                Toast.makeText(Main2Activity.this, getString(R.string.not),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct5;
                correct.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.yes6:

                Toast.makeText(Main2Activity.this, getString(R.string.unfortunately),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct6;
                correct.setEnabled(false);
                break;

            case R.id.correct6:

                Toast.makeText(Main2Activity.this, getString(R.string.ofCourse),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton yes = (RadioButton) binding.yes6;
                yes.setEnabled(false);
                RadioButton correct6 = (RadioButton) binding.correct6;
                correct6.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.correct7:

                Toast.makeText(Main2Activity.this, getString(R.string.right),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton no = (RadioButton) binding.no7;
                no.setEnabled(false);
                RadioButton correct7 = (RadioButton) binding.correct7;
                correct7.setEnabled(false);
                break;

            case R.id.no7:

                Toast.makeText(Main2Activity.this, getString(R.string.itIsNot),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct7;
                correct.setEnabled(false);
                break;
        }
        switch (view.getId()) {

            case R.id.yes8:

                Toast.makeText(Main2Activity.this, getString(R.string.unfortunately),
                        Toast.LENGTH_SHORT).show();
                RadioButton correct = (RadioButton) binding.correct8;
                correct.setEnabled(false);
                break;

            case R.id.correct8:

                Toast.makeText(Main2Activity.this, getString(R.string.Great),
                        Toast.LENGTH_SHORT).show();
                points = points + 1;
                displayPoints(points);
                RadioButton yes = (RadioButton) binding.yes8;
                yes.setEnabled(false);
                RadioButton correct8 = (RadioButton) binding.correct8;
                correct8.setEnabled(false);
                break;
        }

    }

    public void check(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        CheckBox Batman = binding.one;
        boolean itsBatman = Batman.isChecked();
        CheckBox Superman = binding.two;
        boolean itsSuperman = Superman.isChecked();
        CheckBox Spider_Man = binding.three;
        boolean itsSpider_Man = Spider_Man.isChecked();
        CheckBox Captain_America = binding.four;
        boolean itsCapitanAmerica = Captain_America.isChecked();

        if (Superman.isChecked() && Spider_Man.isChecked() && Captain_America.isChecked() && !Batman.isChecked()) {
            points = points + 1;
            displayPoints(points);

            Toast.makeText(Main2Activity.this, getString(R.string.woohoo),
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Main2Activity.this, getString(R.string.nie),
                    Toast.LENGTH_SHORT).show();
        }

        switch (view.getId()) {
            case R.id.one:
                if (checked) {
                    Batman = (CheckBox) binding.one;
                    Batman.setEnabled(false);
                }
                break;
            case R.id.two:
                if (checked) {
                    Superman = (CheckBox) binding.two;
                    Superman.setEnabled(false);
                }
                break;

            case R.id.three:
                if (checked) {
                    Spider_Man = (CheckBox) binding.three;
                    Spider_Man.setEnabled(false);
                }
                break;

            case R.id.four:
                if (checked) {
                    Captain_America = (CheckBox) binding.four;
                    Captain_America.setEnabled(false);
                }
                break;
        }
    }

    public void ok1(View view) {

        EditText presidentName = (EditText) binding.name;
        String president = presidentName.getText().toString();
        presidentName.setText(president);

        if (president.equalsIgnoreCase("Donald Trump")) {

            points = points + 1;
            displayPoints(points);
            Toast.makeText(Main2Activity.this, getString(R.string.woohoo),
                    Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(Main2Activity.this, getString(R.string.nie),
                    Toast.LENGTH_SHORT).show();
        }

        ok1 = (Button) binding.okk;
        ok1.setEnabled(false);
    }

    public void displayPoints(int intValue) {
    }

    public void finish(View view) {
        Toast.makeText(Main2Activity.this, getString(R.string.youhave) + " " + points + "/10 points",
                Toast.LENGTH_SHORT).show();

        Intent myIntent = new Intent(Main2Activity.this, Main3Activity.class);
        myIntent.putExtra("intPoints", points);
        myIntent.putExtra("tekst", tekst);
        startActivity(myIntent);
    }
}

