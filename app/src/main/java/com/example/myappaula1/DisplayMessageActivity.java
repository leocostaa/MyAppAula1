package com.example.myappaula1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message2 = intent.getStringExtra("Nome");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message2);

        String message3 = intent.getStringExtra("Age");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(message3);

        String message4 = intent.getStringExtra("Email");
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(message4);

        String message5 = intent.getStringExtra("Height");
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(message5);

        String message6 = intent.getStringExtra("PhoneNumber");
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(message6);

        String message7 = intent.getStringExtra("Weight");
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(message7);
    }



}
