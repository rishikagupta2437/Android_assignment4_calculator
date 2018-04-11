package com.example.rishika.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


        TextView result;
        Button plus;
        Button minus;
        Button multiply;
        Button divide;
        Button nine;
        Button eight;
        Button seven;
        Button six;
        Button five;
        Button four;
        Button three;
        Button two;
        Button one;
        Button equals;
        Button zero;
        Button backspace;
        Button clear;
        int num1 = 0 , num2 = 0 , res =0;
        String ope = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button)findViewById(R.id.plus);
            minus = (Button)findViewById(R.id.minus);
            multiply = (Button)findViewById(R.id.product);
            divide = (Button)findViewById(R.id.divide);
            nine = (Button)findViewById(R.id.nine);
            eight = (Button)findViewById(R.id.eight);
            seven = (Button)findViewById(R.id.seven);
            six = (Button)findViewById(R.id.six);
            five = (Button)findViewById(R.id.five);
            four = (Button)findViewById(R.id.four);
            three = (Button)findViewById(R.id.three);
            two = (Button)findViewById(R.id.two);
            one = (Button)findViewById(R.id.one);
            zero = (Button)findViewById(R.id.zero);
            equals = (Button)findViewById(R.id.equals);
            backspace = (Button)findViewById(R.id.backspace);
            clear = (Button)findViewById(R.id.clear);
            result = (TextView)findViewById(R.id.result);

            plus.setOnClickListener(this);
            minus.setOnClickListener(this);
            multiply.setOnClickListener(this);
            divide.setOnClickListener(this);
            nine.setOnClickListener(this);
            eight.setOnClickListener(this);
            seven.setOnClickListener(this);
            six.setOnClickListener(this);
            five.setOnClickListener(this);
            four.setOnClickListener(this);
            three.setOnClickListener(this);
            two.setOnClickListener(this);
            one.setOnClickListener(this);
            equals.setOnClickListener(this);
            zero.setOnClickListener(this);
            clear.setOnClickListener(this);
            backspace.setOnClickListener(this);

        }

        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.nine : result.setText(result.getText()+"7");
                    break;
                case R.id.eight : result.setText(result.getText()+"8");
                    break;
                case R.id.seven : result.setText(result.getText()+"9");
                    break;
                case R.id.six : result.setText(result.getText()+"4");
                    break;
                case R.id.five : result.setText(result.getText()+"5");
                    break;
                case R.id.four : result.setText(result.getText()+"6");
                    break;
                case R.id.three : result.setText(result.getText()+"1");
                    break;
                case R.id.two : result.setText(result.getText()+"2");
                    break;
                case R.id.one : result.setText(result.getText()+"3");
                    break;
                case R.id.zero :
                    if(result.getText().toString() == "0" || result.getText().length()==0)
                    {
                        result.setText("0");
                    }
                    else
                    {
                        result.setText(result.getText()+"0");
                    }
                    break;
                case R.id.product : if(result.getText().length() != 0) {
                    num1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    ope = "*";
                    Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Enter Any input", Toast.LENGTH_SHORT).show();
                }
                    break;
                case R.id.plus : if(result.getText().length() != 0) {
                    num1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    ope = "+";
                    Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Enter Any input", Toast.LENGTH_SHORT).show();
                }
                    break;
                case R.id.minus :if(result.getText().length() != 0) {
                    num1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    ope = "-";
                    Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Enter Any input", Toast.LENGTH_SHORT).show();
                }
                    break;
                case R.id.divide :if(result.getText().length() != 0) {
                    num1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    ope = "/";
                    Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Enter Any input", Toast.LENGTH_SHORT).show();
                }
                    break;
                case R.id.backspace : if(result.getText().length()!=0)
                {
                    result.setText(result.getText().toString().substring(0,result.getText().toString().length()-1));
                }
                else
                {
                    result.setText(result.getText().toString());
                }
                    break;
                case R.id.clear : result.setText("");
                    break;
                case R.id.equals : switch (ope)
                {
                    case "+":    if(result.getText().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        num2 = Integer.parseInt(result.getText().toString());
                        res = num1 + num2;
                        result.setText("" + res);
                    }
                        break;
                    case "-": if(result.getText().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        num2 = Integer.parseInt(result.getText().toString());
                        res = num1 - num2;

                        result.setText("" + res);
                    }
                        break;
                    case "*": if(result.getText().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        num2 = Integer.parseInt(result.getText().toString());
                        res = num1 * num2;
                        result.setText("" + res);
                    }
                        break;
                    case "/": if(result.getText().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        num2 = Integer.parseInt(result.getText().toString());
                        res = num1 / num2;
                        result.setText("" + res);

                    }
                        break;
                    default:
                        break;
                }
                    break;
                default:
                    break;
            }
        }
    }


