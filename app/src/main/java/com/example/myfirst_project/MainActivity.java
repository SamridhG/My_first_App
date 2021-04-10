package com.example.myfirst_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    EditText name_input;
    EditText email_input;
    EditText password_input;
    Button btn_register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_input=findViewById(R.id.name_input);
        email_input=findViewById(R.id.email_input);
        password_input=findViewById(R.id.password_input);
        btn_register=findViewById(R.id.btn_register);

btn_register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String name=name_input.getText().toString();
        String email=email_input.getText().toString();
        String password=password_input.getText().toString();

        String msg=name+" "+email+" "+password;
        String TAG=" sept";
        Log.e(TAG,msg);


        Intent infointent=new Intent(getApplicationContext(),SecondActivity.class);
        infointent.putExtra("message",msg);
        startActivity(infointent);

    }
});

    }
}