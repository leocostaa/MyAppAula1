package com.example.myappaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editNome = (EditText) findViewById(R.id.editText2);
        EditText editAge = (EditText) findViewById(R.id.editText3);
        EditText editEmail = (EditText) findViewById(R.id.editText4);
        EditText editHeight = (EditText) findViewById(R.id.editText5);
        EditText editPhone = (EditText) findViewById(R.id.editText6);
        EditText editWeight = (EditText) findViewById(R.id.editText7);


        String Nome = editNome.getText().toString();
        String Age = editAge.getText().toString();
        String Email = editEmail.getText().toString();
        String Height = editHeight.getText().toString();
        String Phone = editPhone.getText().toString();
        String Weight = editWeight.getText().toString();

        intent.putExtra("Nome", Nome);
        intent.putExtra("Age", Age);
        intent.putExtra("Email", Email);
        intent.putExtra("Height", Height);
        intent.putExtra("PhoneNumber", Phone);
        intent.putExtra("Weight", Weight);

        startActivity(intent);
    }
}
