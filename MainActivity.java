package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    TextView result, solution;
    String ex="";
    MaterialButton div, multi, plus, minus, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.textViewResult); //resource.id
        solution=findViewById(R.id.textViewResult);

    }   

    public void buttonClickClearFunction(View view){
        if(view instanceof Button)
        {
            result.setText("");
        }
    }


    public void buttonClickFunction(View view){

        if(view instanceof Button)
        {
            Button button=(Button)view; //make the view to a button
            //value of the button will appear on the text:
            String str=button.getText().toString(); //String str=button.getText() +""

            result.append(str);
        }
    }
}