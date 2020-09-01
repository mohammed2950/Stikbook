package com.arifali.stikbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class fifth_activity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);

    }
    public void goNextPage(View view) {
        startActivity(new Intent(getApplicationContext(),sixth_activity.class));
    }

}
