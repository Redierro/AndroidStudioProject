package com.example.mipt_1_pd;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Pakeicia teksta pati
        TextView tv = findViewById(R.id.textViewHello);
        Button btnChangeText = findViewById(R.id.buttonChangeText);
        Button btnChangeColor = (Button) findViewById(R.id.buttonChangeColor);
        Button btnChangeBackground = (Button) findViewById(R.id.buttonChangeBackground);

        btnChangeText.setOnClickListener(v -> {
            tv.setText("Testavimas! MIPT Praktika testas!");
        });

        // Pakeicia teksto spalva
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextColor(Color.parseColor("#D32F2F")); // raudona
            }
        });

        // Pakeicia teksto fona
        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.parseColor("#FFF59D")); // šviesiai geltona
            }
        });

        // KOMENTARAS REVERTINIMUI!!!
    }
}
