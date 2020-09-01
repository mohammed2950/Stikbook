package com.arifali.stikbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class seventh_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh_activity);
    }

    public void goNextPage(View view) {
        startActivity(new Intent(getApplicationContext(), eight.class));
    }
}