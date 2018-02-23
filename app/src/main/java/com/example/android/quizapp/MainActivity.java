package com.example.android.quizapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.quizapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    public static String tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
    public void okButton(View view) {
        EditText writeYourName = (EditText) binding.yourName;
        tekst = writeYourName.getText().toString();
        writeYourName.setText(tekst);
        String enjoyMessage = getString(R.string.Enjoy) + " " + tekst + "!";
        displayForEnjoyMessage(enjoyMessage);
    }
    public void displayForEnjoyMessage(String s) {
        TextView messageView = (TextView) binding.enjoy;
        messageView.setText(String.valueOf(s));
    }
    public void beginQuiz(View view) {
        Intent intent = new Intent(getApplicationContext(), com.example.android.quizapp.Main2Activity.class);
        startActivity(intent);
    }
}
