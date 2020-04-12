package com.example.its_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Activity_ChooseType extends AppCompatActivity {

    Button btnNext;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__choose_type);

        spinner = findViewById(R.id.spinner);
        btnNext = findViewById(R.id.btnNextType);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.Types)); //selected item will look like a spinner set from XML
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);

        spinner.setAdapter(spinnerArrayAdapter);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_ChooseType.this, Activity_Inputs.class);
                startActivity(intent);
            }
        });
    }
}
