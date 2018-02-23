package com.example.android.quizapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.android.quizapp.databinding.ActivityMain3Binding;

public class Main3Activity extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intPoints", 0);
        String name = mIntent.getStringExtra("tekst");
        displayPoints(intValue);
        displayGrats(name);
    }
    public void displayPoints(int points) {
        TextView pointsView = (TextView) binding.points3;
        pointsView.setText(String.valueOf(points));
    }
    public void displayGrats(String g) {
        TextView s = (TextView) binding.congrats;
        s.setText(g);
    }
    public void reset(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}


