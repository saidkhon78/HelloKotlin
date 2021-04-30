package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    TextView txtActivityStartTime, txtCoubtBtnClicks, txtElapsedTime;
    Button btnClickMe;
    final long startTime = System.currentTimeMillis();

    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCoubtBtnClicks = findViewById(R.id.txtCountBtnClicks);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);
        btnClickMe = findViewById(R.id.btnClickme);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                long elapsedSeconds =((System.currentTimeMillis() - startTime) / 1000);
                txtCoubtBtnClicks.setText("Button clicks: " + clickCount);
                txtElapsedTime.setText(elapsedSeconds + "seconds elspsed");
            }
        });

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);

        txtActivityStartTime.setText("Activity start time = " + timeText);

    }
}