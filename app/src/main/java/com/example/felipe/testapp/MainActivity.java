package com.example.felipe.testapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {
    private TextView textPhrase;
    private List<String> phrases = Arrays.asList(
            "Phrase 1",
            "Phrase 2",
            "Phrase 3"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.init();
    }

    public void getNewPhrase(View view) {
        System.out.println(phrases.get(new Random().nextInt(phrases.size())));
        textPhrase.setText(
                phrases.get(new Random().nextInt(phrases.size()))
        );
    }

    private void init() {
        textPhrase = findViewById(R.id.textPhrase);
    }

}
