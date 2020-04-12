package com.example.its_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_ChooseType.class);
                startActivity(intent);
            }
        });


    }

    private void CreateProviderList () {
        Provider provider = new Provider(
                "Freshservice", "www.freshservice.de", "Leer",
                0, 20, 22f,
                false,false,true, false, false,
                true, true,
                true, false, false,
                true, true, true, true,
                true
        ) {};
    }
}
