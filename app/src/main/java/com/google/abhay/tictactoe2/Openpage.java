package com.google.abhay.tictactoe2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.abhay.tictactoe2.R;

/**
 * Created by AbhayEshani on 05-04-2016.
 */
public class Openpage extends AppCompatActivity {

    EditText editText1,editText2;
    public String value1,value2;
    public Button quantityTextView1,quantityTextView4,quantityTextView7,quantityTextView2,quantityTextView3,quantityTextView5;
    public Button quantityTextView6,quantityTextView8,quantityTextView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openpage);



    }


    public void newgameone(View view){

        EditText text1 = (EditText)findViewById(R.id.player1);
        value1 = text1.getText().toString();

        EditText text2 = (EditText)findViewById(R.id.player2);
        value2 = text2.getText().toString();

        Intent intent = new Intent(Openpage.this, MainActivity.class);
        intent.putExtra("VAR_RESULT1", value1);
        intent.putExtra("VAR_RESULT2", value2);
        startActivity(intent);



    }

    public void howtoplaymethod(View view){

        Intent intent = new Intent(Openpage.this, howtoplay.class);
        startActivity(intent);

    }

    public void display1(String number) {

        quantityTextView1 = (Button) findViewById(
                R.id.button1);
        quantityTextView1.setText(number);

    }

    public void display2(String number) {

        quantityTextView2 = (Button) findViewById(
                R.id.button2);
        quantityTextView2.setText(number);

    }
    public void display3(String number) {

        quantityTextView3 = (Button) findViewById(
                R.id.button3);
        quantityTextView3.setText(number);

    }
    public void display4(String number) {

        quantityTextView4 = (Button) findViewById(
                R.id.button4);
        quantityTextView4.setText(number);

    }
    public void display5(String number) {

        quantityTextView5 = (Button) findViewById(
                R.id.button5);
        quantityTextView5.setText(number);

    }
    public void display6(String number) {

        quantityTextView6 = (Button) findViewById(
                R.id.button6);
        quantityTextView6.setText(number);

    }
    public void display7(String number) {

        quantityTextView7 = (Button) findViewById(
                R.id.button7);
        quantityTextView7.setText(number);

    }
    public void display8(String number) {

        quantityTextView8 = (Button) findViewById(
                R.id.button8);
        quantityTextView8.setText(number);

    }
    public void display9(String number) {

        quantityTextView9 = (Button) findViewById(
                R.id.button9);
        quantityTextView9.setText(number);

    }


}
