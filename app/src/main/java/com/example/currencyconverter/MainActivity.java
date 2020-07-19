package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollar = (EditText) findViewById(R.id.editText);
        TextView rupeeEdit = (TextView) findViewById(R.id.rupee);
        TextView euroEdit = (TextView) findViewById(R.id.euro);
        Double rupeeAmountDouble = Double.parseDouble(dollar.getText().toString());
        Double rupeeAmount = rupeeAmountDouble*75.17;
        rupeeEdit.setText("₹"+rupeeAmount.toString());

        Double euroAmountDouble = Double.parseDouble(dollar.getText().toString());
        Double euroAmount = euroAmountDouble*0.92;
        euroEdit.setText("€"+euroAmount.toString());



    }

    public void reset(View view){
        EditText dollar = (EditText) findViewById(R.id.editText);
        dollar.setText("");
        TextView rupeeEdit = (TextView) findViewById(R.id.rupee);
        TextView euroEdit = (TextView) findViewById(R.id.euro);
        rupeeEdit.setText("₹");
        euroEdit.setText("€");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
