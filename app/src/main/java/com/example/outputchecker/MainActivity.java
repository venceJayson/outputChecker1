package com.example.outputchecker;

import static com.example.outputchecker.R.layout.checksubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button check;
    Button grade;

      @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        check = findViewById(R.id.completionBtn);
        grade = findViewById(R.id.gradeBtn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewSubmissions = inflater.inflate(R.layout.checksubmission, null);

                new AlertDialog.Builder(MainActivity.this)
                        .setView(viewSubmissions)
                        .setTitle("Submissions")
                        .show();

            }
        });

        grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View gradeSubmissions = inflater.inflate(R.layout.gradesubmission, null);


                new AlertDialog.Builder(MainActivity.this)
                        .setView(gradeSubmissions)
                        .setTitle("sample")
                        .show();
            }
        });

      }
    }