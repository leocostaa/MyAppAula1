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

        String Nome = intent.getStringExtra("Nome");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Nome);

        String Age = intent.getStringExtra("Age");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(Age);

        String Email = intent.getStringExtra("Email");
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(Email);

        String Height = intent.getStringExtra("Height");
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(Height);

        String Phone = intent.getStringExtra("PhoneNumber");
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(Phone);

        String Weight = intent.getStringExtra("Weight");
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(Weight);
    }



}
