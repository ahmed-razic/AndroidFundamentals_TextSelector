package com.example.android.textselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String REPLY = "com.example.android.textselector.REPLY";
    TextView passageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        passageTextView = findViewById(R.id.passage_textView);
        Intent receivedIntent = getIntent();
        int textId = receivedIntent.getIntExtra(MainActivity.TEXT, 0);

        if( textId == R.string.text_passage_one) {
            passageTextView.setText(textId);
        } else if (textId == R.string.text_passage_two) {
            passageTextView.setText(textId);
        } else if (textId == R.string.text_passage_three) {
            passageTextView.setText(textId);
        }

        Intent replyIntent = new Intent(SecondActivity.this, MainActivity.class);
        replyIntent.putExtra(REPLY, textId);
        setResult(RESULT_OK, replyIntent);
        Log.d("SecondActivity", String.valueOf(textId));
    }
}