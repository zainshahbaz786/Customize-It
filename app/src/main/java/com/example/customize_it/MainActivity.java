package com.example.customize_it;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ctg1,ctg2,ctg3,ctg4,ctg5;
 //   ImageButton cart;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv1);
        ctg1=findViewById(R.id.ctg1);
        ctg2=findViewById(R.id.ctg2);
        ctg3=findViewById(R.id.ctg3);
        ctg4=findViewById(R.id.ctg4);
        ctg5=findViewById(R.id.ctg5);
 //       cart=findViewById(R.id.cart);


    }

    public void OnClick(View view)
    {

        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();

    }

}
