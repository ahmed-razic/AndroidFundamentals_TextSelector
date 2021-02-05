package com.example.android.textselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT = "com.example.android.textselector.TEXT";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openText1(View view) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        int textNumber = R.string.text1;
        intent1.putExtra(TEXT, textNumber);
    }

    public void openText2(View view) {
        Intent intent2 = new Intent(this, SecondActivity.class);
        int textNumber = R.string.text2;
        intent2.putExtra(TEXT, textNumber);
    }

    public void openText3(View view) {
        Intent intent3 = new Intent(this, SecondActivity.class);
        int textNumber = R.string.text3;
        intent3.putExtra(TEXT, textNumber);
    }

    public void random(View view) {



    }
}