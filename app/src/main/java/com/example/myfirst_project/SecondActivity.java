package com.example.myfirst_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView user_info_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        user_info_text=findViewById(R.id.user_info_txt);



        String msg =getIntent().getStringExtra("message");
        user_info_text.setText(msg);
    }
}