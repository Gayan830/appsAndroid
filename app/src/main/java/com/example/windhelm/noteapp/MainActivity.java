package com.example.windhelm.noteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.windhelm.noteapp.Database.Datasource;

public class MainActivity extends AppCompatActivity {

    private Datasource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSource = new Datasource(this);
        dataSource.open();
        Toast.makeText(this, "Database acquired", Toast.LENGTH_SHORT).show();

    }


    public void getsignup(View view) {
        Intent i = new Intent(this, EmailSignUpActivity.class);
        startActivity(i);
    }
}
