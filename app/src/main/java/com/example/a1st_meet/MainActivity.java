package com.example.a1st_meet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//
//    TextView linLayout[] =TextView.findViewWithTag("layout1");
    TextView TextwviewAge = findViewById(R.id.age);
    String TextAge = TextwviewAge.toString();
    int Age = Integer.parseInt(TextAge);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View v){
        switch (v.getId()) {
            case R.id.increase:
                // do something
                TextwviewAge.setText(Age+1);
                break;
            case R.id.decrease:
                // do something
                TextwviewAge.setText(Age-1);
                break;
            default:
                //default case
                break;
        }
    }
}