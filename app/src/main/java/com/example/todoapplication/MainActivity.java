package com.example.todoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnInvi=(Button) findViewById(R.id.btnInvi);
        btnInvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnInvi.setVisibility(View.GONE);
            }
        });
        final Button btnPink=(Button) findViewById(R.id.btnPink);
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context=getApplicationContext();
                CharSequence message= "To do - To do - To do - To do";
                int duration=Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
            }
        });
    }
}