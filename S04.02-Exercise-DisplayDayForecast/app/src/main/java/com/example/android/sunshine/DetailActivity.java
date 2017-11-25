package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mTextViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTextViewDisplay = (TextView) findViewById(R.id.tv_display);
        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            String extraText = intent.getStringExtra(Intent.EXTRA_TEXT);
            mTextViewDisplay.setText(extraText);
        }
    }
}