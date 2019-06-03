package com.example.a1893683.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final TextView fname = (TextView) findViewById(R.id.fname);
        final TextView lname = (TextView) findViewById(R.id.lname);
        final TextView pass = (TextView) findViewById(R.id.pass);
        final TextView email = (TextView) findViewById(R.id.email);
        final Button btn1 =(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THANK YOU " + fname.getText().toString() , Toast.LENGTH_SHORT).show();
            }
        }));

        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname.setText("");
                lname.setText("");
                pass.setText("");
                email.setText("");





            }
        }));
Button btnlogout =(Button) findViewById(R.id.btnlogout);
btnlogout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
        System.exit(0);
        Toast.makeText(MainActivity.this, "GOOD BUY " + fname.getText().toString() , Toast.LENGTH_SHORT).show();
    }
});


        TextView fname1 = (TextView) findViewById(R.id.fname);
        fname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Enter Your First Name", Toast.LENGTH_SHORT).show();
            }


        });
    }
}