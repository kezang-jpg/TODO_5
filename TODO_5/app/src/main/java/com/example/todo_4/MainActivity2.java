package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    EditText name;
    TextView textV1,textV2;
    String str,Str;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // Log.d(LOG_TAG,"----------");
     //   Log.d(LOG_TAG, "onCreate")


        textV2 =(TextView)findViewById(R.id.textV2);

        Intent intent =  getIntent();
        str = intent.getStringExtra("SEND");
        textV2.setText(str);
    }


    public void reply(View view) {
        name = (EditText) findViewById(R.id.replyer);
        Str = name.getText().toString();
        Intent reply = new Intent(this, MainActivity.class);
        reply.putExtra("REPLY", Str);
        setResult(RESULT_OK, reply);
        finish();

    }
}