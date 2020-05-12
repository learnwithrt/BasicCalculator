package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    //How to evaluate expressions?
    //Javascript
    //Java 8 - Nashorn - Javascript engine -
    //Mozilla Rhino- can help you in using js in your android application
    //method to clear
    public void clear(){
        TextView res=findViewById(R.id.result);
        if(res.getText().equals("0")){
            res.setText("");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result=findViewById(R.id.result);
        findViewById(R.id.num0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"0");
            }
        });
        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"1");
            }
        });
        findViewById(R.id.num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"2");
            }
        });
        findViewById(R.id.num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"3");
            }
        });
        findViewById(R.id.num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"4");
            }
        });
        findViewById(R.id.num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"5");
            }
        });
        findViewById(R.id.num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"6");
            }
        });
        findViewById(R.id.num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"7");
            }
        });
        findViewById(R.id.num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"8");
            }
        });
        findViewById(R.id.num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"9");
            }
        });
        findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"/");
            }
        });
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"+");
            }
        });
        findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"*");
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the result if there is just 0
                clear();
                result.setText(result.getText()+"-");
            }
        });
        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
            }
        });
        //do the evaluation when the equal button is clicked
        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression=result.getText().toString();
                //evaluate using JS engine
                Context con= Context.enter();
                con.setOptimizationLevel(-1);
                Scriptable scope=con.initSafeStandardObjects();
                Object res=con.evaluateString(scope,expression,"<cmd>",1,null);
                result.setText(res.toString());
            }
        });
    }


}
