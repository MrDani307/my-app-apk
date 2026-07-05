package com.example.minimalapk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void Bundle) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("Hello! This APK was built via GitHub Actions!");
        textView.setTextSize(24);
        textView.setGravity(android.view.Gravity.CENTER);
        
        setContentView(textView);
    }
}