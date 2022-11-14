package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    TextView result, solution;
    int valueNumber=0;
    String calcOperator="";

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
            calcOperator="";
            valueNumber=0;
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

    public void operatorClickFunction(View view)
    {
        if(view instanceof Button)
        {
            Button button=(Button)view; //make the view to a button
            //value of the button will appear on the text:
            calcOperator=button.getText().toString(); //String str=button.getText() +""
            valueNumber=Integer.parseInt(result.getText().toString());
            result.setText("");
        }
    }

    public void equalOperatorClickFunction(View view)
    {
        int secondValueNumber=Integer.parseInt(result.getText().toString());
        switch(calcOperator)
        {
            case "+":
                valueNumber+=secondValueNumber;
                break;

            case "-":
                valueNumber-=secondValueNumber;
                break;


            case "X":
                valueNumber*=secondValueNumber;
                break;

            case "÷":
                valueNumber/=secondValueNumber;
                break;
        }

        result.setText(Integer.toString(valueNumber));
    }

}