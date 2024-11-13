package com.example.labb1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button centerButton = findViewById(R.id.centerButton);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView messageTextView = findViewById(R.id.messageTextView);

        centerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Відобразити повідомленняіі
                messageTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}