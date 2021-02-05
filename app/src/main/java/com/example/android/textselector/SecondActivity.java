package com.example.android.textselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView passageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        passageTextView = findViewById(R.id.passage_textView);
        Intent receivedIntent = getIntent();
        int textId = receivedIntent.getIntExtra(MainActivity.TEXT, 0);

        if( textId == R.string.text1) {
            passageTextView.setText(textId);
        } else if (textId == R.string.text2) {
            passageTextView.setText(textId);
        } else if (textId == R.string.text3) {
            passageTextView.setText(textId);
        }
    }
}