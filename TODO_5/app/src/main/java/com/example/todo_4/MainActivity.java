package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText name;
    Button btn;
    TextView textv1,textv2;
    String str,Str;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.sender);
        btn=findViewById(R.id.send);

        textv1 = (TextView)findViewById(R.id.textv1);
        textv2 =(TextView)findViewById(R.id.textv2);
    }

    public void btn(View view)
    {
        name = (EditText)findViewById(R.id.sender);
        str = name.getText().toString();
        Intent send = new Intent(this, MainActivity2.class);
        send.putExtra("SEND",str);
        startActivityForResult(send, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                Str = data.getStringExtra("REPLY");
                textv1.setVisibility(View.VISIBLE);
                textv2.setText(Str);
            }
        }
    }
    @Override
    public void onStart(){
        super.onStart();//the activity is about to become visible.
    }
    @Override
    public void onResume(){
        super.onResume();//the activity has become visible (it is now "resume").
    }
    @Override
    public void onPause(){
        super.onPause();//another activity is taking focus
        //(this activity is about to be "paused")
    }
    @Override
    public void onStop(){
        super.onStop();//the activity is no longer visible (it is now "stopped").
    }
    @Override
    public void onDestroy(){
        super.onDestroy();//the activity is about to be destroyed.
    }
    @Override
    public void onRestart(){
        super.onRestart();//the activity is about to be restarted.
    }
}