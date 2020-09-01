package com.arifali.stikbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sixth_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_activity);

    }
    public void goNextPage(View view) {
        startActivity(new Intent(getApplicationContext(), seventh_Activity.class));
    }

}
