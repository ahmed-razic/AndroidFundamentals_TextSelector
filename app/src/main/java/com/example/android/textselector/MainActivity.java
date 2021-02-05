package com.example.android.textselector;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT = "com.example.android.textselector.TEXT";
    private static final int REQUEST_TEXT = 1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_textView);
    }

    public void openText1(View view) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        int textNumber = R.string.text_passage_one;
        intent1.putExtra(TEXT, textNumber);
        startActivity(intent1);
    }

    public void openText2(View view) {
        Intent intent2 = new Intent(this, SecondActivity.class);
        int textNumber = R.string.text_passage_two;
        intent2.putExtra(TEXT, textNumber);
        startActivity(intent2);
    }

    public void openText3(View view) {
        Intent intent3 = new Intent(this, SecondActivity.class);
        int textNumber = R.string.text_passage_three;
        intent3.putExtra(TEXT, textNumber);
        startActivity(intent3);
    }

    public void random(View view) {
        Intent intent4 = new Intent(this, SecondActivity.class);

        int[] intArray = {R.string.text_passage_one, R.string.text_passage_two, R.string.text_passage_three};
        int randomTextId = new Random().nextInt(intArray.length);

        Log.i(LOG_TAG, "Value of random no: " + String.valueOf(randomTextId));

        intent4.putExtra(TEXT, intArray[randomTextId]);
        startActivityForResult(intent4, REQUEST_TEXT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == REQUEST_TEXT && resultCode == RESULT_OK) {
            assert data != null;

            resultTextView.setText(getResources().getResourceEntryName(data.getIntExtra(SecondActivity.REPLY, 0)));
        }
    }
}