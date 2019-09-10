package com.sandeep.dassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String parrentDbName = "HR";
    private Button loginbtn;
    private  TextView userlogin, HRlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userlogin = (TextView) findViewById(R.id.userlogintxt);
        loginbtn = (Button) findViewById(R.id.hrLoginbtn);
        HRlogin = (TextView)findViewById(R.id.HRlogintxt);
        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginbtn.setText("USER LOGIN");
                HRlogin.setVisibility(View.VISIBLE);
                userlogin.setVisibility(View.INVISIBLE);
                parrentDbName = "Users";
            }
        });
        HRlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginbtn.setText("HR LOGIN");
                userlogin.setVisibility(View.VISIBLE);
                HRlogin.setVisibility(View.INVISIBLE);
                parrentDbName = "HR";
            }
        });


    }

    public void hrLogin(View view)
    {
        if(parrentDbName =="HR")
           startActivity(new Intent(MainActivity.this,userActivity.class));
        else
            startActivity(new Intent(MainActivity.this,userdetailsActivity.class));
    }
}
