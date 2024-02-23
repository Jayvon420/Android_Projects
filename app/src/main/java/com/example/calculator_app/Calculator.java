package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Calculator extends AppCompatActivity {
    TextView tvNum1, tvNum2, tvDisplay;
    EditText txtNum1, txtNum2;
    Button btnAdd, btnSub;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNum1=findViewById(R.id.tvNum1);
        txtNum1=findViewById(R.id.txtNum1);
        tvNum2=findViewById(R.id.tvNum2);
        txtNum2=findViewById(R.id.txtNum2);
        tvDisplay=findViewById(R.id.tvDisplay);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1=Integer.parseInt(txtNum1.getText()+"");
                int num2=Integer.parseInt(txtNum2.getText()+"");

                int sum=num1+num2;
                tvDisplay.setText("The sum is "+sum);

                Toast.makeText(getApplicationContext(),"The sum is "+sum,Toast.LENGTH_LONG).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1=Integer.parseInt(txtNum1.getText()+"");
                int num2=Integer.parseInt(txtNum2.getText()+"");

                int sub=num1-num2;
                tvDisplay.setText("The sum is "+sub);

                Toast.makeText(getApplicationContext(),"The sum is "+sub,Toast.LENGTH_LONG).show();
            }
        });
    }
}