package com.google.abhay.tictactoe2;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.abhay.tictactoe2.R;

public class MainActivity extends Openpage {


    int turn, teamA = 0,teamB = 0;
    int drawvariable = 0;
    int click,new_game =1;
    public int abhay;
    public int not_clickable = 0;
    int count1;
    
    TextView quantityTextViewA,quantityTextViewB;
    String value3,value4;
    boolean timerProcessing = false;
    boolean timerStarts = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turn = 1;
        Bundle bundle1 = getIntent().getExtras();

        if (value3 != "") {
            value3 = bundle1.getString("VAR_RESULT1");
        }
        else if (value3 == "")
        {value3 = "Player 1";}

        else return;

        Bundle bundle2 = getIntent().getExtras();

        if (value4 != "") {
            value4 = bundle2.getString("VAR_RESULT2");
        }
        else if (value4 == "")
        {value4 = "Player 2";}

        else return;

        // Bundle bundle3 = getIntent().getExtras();
        //clear = bundle3.getString("VAR_RESULT3");

        display1("");
        display2("");
        display3("");
        display4("");
        display5("");
        display6("");
        display7("");
        display8("");
        display9("");

    }


    public void OnClickButton1(View view) {


        if (turn % 2 != 0) {
            if (new_game % 2 != 0) click = 0;
            else click = 1;
        } else

        {
            if (new_game % 2 != 0) click = 1;
            else click = 0;
        }

        judge1();
        abhay = 1;

        win1();
        win4();
        win7();
        turn++;
        draw();

        if (quantityTextView1.getText() == "")
        quantityTextView1.setClickable(true);
        else if (quantityTextView1.getText() == "O" || quantityTextView1.getText() == "X")
            quantityTextView1.setClickable(false);
        else return;

    }

    public void OnClickButton2(View view){

        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge2();
        turn++;


        abhay = 2;
        win2();
        win4();
        draw();

        if (quantityTextView2.getText() == "")
            quantityTextView2.setClickable(true);
        else if (quantityTextView2.getText() == "O" || quantityTextView2.getText() == "X")
            quantityTextView2.setClickable(false);
        else return;


    }

    public void OnClickButton3(View view){



        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge3();
        turn++;
        abhay = 3;

        win3();
        win4();
        win8();
        draw();

        if (quantityTextView3.getText() == "")
            quantityTextView3.setClickable(true);
        else if (quantityTextView3.getText() == "O" || quantityTextView3.getText() == "X")
            quantityTextView3.setClickable(false);
        else return;

    }

    public void OnClickButton4(View view){



        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge4();
        turn++;
        abhay = 4;
        win1();
        win5();
        draw();

        if (quantityTextView4.getText() == "")
            quantityTextView4.setClickable(true);
        else if (quantityTextView4.getText() == "O" || quantityTextView4.getText() == "X")
            quantityTextView4.setClickable(false);
        else return;

    }

    public void OnClickButton5(View view){



        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge5();
        turn++;

        abhay = 5;

        win2();
        win5();
        win7();
        win8();
        draw();

        if (quantityTextView5.getText() == "")
            quantityTextView5.setClickable(true);
        else if (quantityTextView5.getText() == "O" || quantityTextView5.getText() == "X")
            quantityTextView5.setClickable(false);
        else return;

    }

    public void OnClickButton6(View view){


        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge6();
        turn++;

        abhay = 6;
        win3();
        win5();
        draw();

        if (quantityTextView6.getText() == "")
            quantityTextView6.setClickable(true);
        else if (quantityTextView6.getText() == "O" || quantityTextView6.getText() == "X")
            quantityTextView6.setClickable(false);
        else return;

    }

    public void OnClickButton7(View view){



        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge7();
        turn++;

        abhay = 7;

        win1();
        win6();
        win8();
        draw();

        if (quantityTextView7.getText() == "")
            quantityTextView7.setClickable(true);
        else if (quantityTextView7.getText() == "O" || quantityTextView7.getText() == "X")
            quantityTextView7.setClickable(false);
        else return;
    }

    public void OnClickButton8(View view){

        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge8();
        turn++;

        abhay = 8;

        win2();
        win6();
        draw();

        if (quantityTextView8.getText() == "")
            quantityTextView8.setClickable(true);
        else if (quantityTextView8.getText() == "O" || quantityTextView8.getText() == "X")
            quantityTextView8.setClickable(false);
        else return;


    }

    public void OnClickButton9(View view){


        if (turn % 2 != 0)
        {
            if (new_game % 2 != 0)click = 0;
            else click = 1;
        }
        else

        {
            if (new_game % 2 != 0)click = 1;
            else click = 0;
        }

        judge9();
        turn++;

        abhay = 9;
        win3();
        win6();
        win7();
        draw();

        if (quantityTextView9.getText() == "")
            quantityTextView9.setClickable(true);
        else if (quantityTextView9.getText() == "O" || quantityTextView9.getText() == "X")
            quantityTextView9.setClickable(false);
        else return;

    }

    public void undo(View view){

        turn = turn - 1 ;

        quantityTextView1.setClickable(true);
        quantityTextView2.setClickable(true);
        quantityTextView3.setClickable(true);
        quantityTextView4.setClickable(true);
        quantityTextView5.setClickable(true);
        quantityTextView6.setClickable(true);
        quantityTextView7.setClickable(true);
        quantityTextView8.setClickable(true);
        quantityTextView9.setClickable(true);


        switch (abhay)
        {
            case 1:  display1("");
                break;
            case 2:  display2("");
                break;
            case 3:  display3("");
                break;
            case 4:  display4("");
                break;
            case 5:  display5("");
                break;
            case 6:  display6("");
                break;
            case 7:  display7("");
                break;
            case 8:  display8("");
                break;
            case 9:  display9("");
                break;
            default: break;
        }

    }

    public void displaynewgame()
    {
        display1("");
        display2("");
        display3("");
        display4("");
        display5("");
        display6("");
        display7("");
        display8("");
        display9("");

    }

    public void Newgame(View view){

        quantityTextView1.setClickable(true);
        quantityTextView2.setClickable(true);
        quantityTextView3.setClickable(true);
        quantityTextView4.setClickable(true);
        quantityTextView5.setClickable(true);
        quantityTextView6.setClickable(true);
        quantityTextView7.setClickable(true);
        quantityTextView8.setClickable(true);
        quantityTextView9.setClickable(true);



        displaynewgame();
        turn++;
        new_game++;


    }
    public void judge1(){

        if (click == 0) {
            display1("O");}
        else {
            display1("X");}

    }

    public void judge2(){

        if (click == 0) {
            display2("O");}
        else {
            display2("X");}

    }

    public void judge3(){

        if (click == 0) {
            display3("O");}
        else {
            display3("X");}

    }

    public void judge4(){

        if (click == 0) {
            display4("O");}
        else {
            display4("X");}

    }

    public void judge5(){

        if (click == 0) {
            display5("O");}
        else {
            display5("X");}

    }

    public void judge6(){

        if (click == 0) {
            display6("O");}
        else {
            display6("X");}

    }

    public void judge7(){

        if (click == 0) {
            display7("O");}
        else {
            display7("X");}

    }

    public void judge8(){

        if (click == 0) {
            display8("O");}
        else {
            display8("X");}

    }

    public void judge9(){

        if (click == 0)
        {display9("O");}
        else
        {display9("X");}

    }

    public void displayteamAScore(int number) {

        quantityTextViewA = (TextView) findViewById(
                R.id.teamascore);
        quantityTextViewA.setText("" +number);

    }

    public void displayteamBScore(int number) {

        quantityTextViewB = (TextView) findViewById(
                R.id.teambscore);
        quantityTextViewB.setText("" + number);

    }


    final CountDownTimer timer = new CountDownTimer(3000, 5) {
        public void onTick(long millisUntilFinished) {

        }

        public void onFinish() {

            Newgame(null);
            timerProcessing = false;
        }
    };


    public void win1() {


        if (quantityTextView1.getText() == "O" && quantityTextView4.getText() == "O" & quantityTextView7.getText() == "O") {

            Toast.makeText(this, "On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        } else if (quantityTextView1.getText() == "X" && quantityTextView4.getText() == "X" && quantityTextView7.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;

        } else
        {
            
            return;
        }

        displayteamAScore(teamA);
        displayteamBScore(teamB);
        drawvariable = 5;
        timer.start();


    }

    public void win2(){


        if (quantityTextView2.getText() == "O" && quantityTextView5.getText() == "O" & quantityTextView8.getText() == "O")
        {


            Toast.makeText(this,"On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        }
        else if (quantityTextView2.getText() == "X" && quantityTextView5.getText() == "X" && quantityTextView8.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        }
        else
        {
            return;
        }

        displayteamAScore(teamA);
        displayteamBScore(teamB);
        drawvariable = 5;
        timer.start();



    }

    public void win3(){


        if (quantityTextView3.getText() == "O" && quantityTextView6.getText() == "O" & quantityTextView9.getText() == "O")
        {


            Toast.makeText(this,"On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        }
        else if (quantityTextView3.getText() == "X" && quantityTextView6.getText() == "X" && quantityTextView9.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        }

        else
        {

            return;
        }
        displayteamAScore(teamA);
        displayteamBScore(teamB);
        drawvariable = 5;
        timer.start();


    }

    public void win4(){


        if (quantityTextView1.getText() == "O" && quantityTextView2.getText() == "O" & quantityTextView3.getText() == "O")
        {


            Toast.makeText(this,"On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        }
        else if (quantityTextView1.getText() == "X" && quantityTextView2.getText() == "X" && quantityTextView3.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        }
        else
        {
            return;
        }

        displayteamAScore(teamA);
        displayteamBScore(teamB);
        timer.start();
        drawvariable = 5;


    }

    public void win5(){


        if (quantityTextView4.getText() == "O" && quantityTextView5.getText() == "O" & quantityTextView6.getText() == "O")
        {


            Toast.makeText(this,"On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        }
        else if (quantityTextView4.getText() == "X" && quantityTextView5.getText() == "X" && quantityTextView6.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        }
        else
        {
            return;
        }

        displayteamAScore(teamA);
        displayteamBScore(teamB);
        timer.start();
        drawvariable = 5;


    }

    public void win6(){


        if (quantityTextView7.getText() == "O" && quantityTextView8.getText() == "O" & quantityTextView9.getText() == "O")
        {


            Toast.makeText(this,"On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        }
        else if (quantityTextView7.getText() == "X" && quantityTextView8.getText() == "X" && quantityTextView9.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        }
        else
        {
            return;
        }
        displayteamAScore(teamA);
        displayteamBScore(teamB);
        drawvariable = 5;
        timer.start();


    }

    public void win7() {


        if (quantityTextView1.getText() == "O" && quantityTextView5.getText() == "O" & quantityTextView9.getText() == "O") {


            Toast.makeText(this, "On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        } else if (quantityTextView1.getText() == "X" && quantityTextView5.getText() == "X" && quantityTextView9.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        } else
        {
            return;
        }
        displayteamAScore(teamA);
        displayteamBScore(teamB);
        timer.start();
        drawvariable = 5;


    }

    public void win8() {


        if (quantityTextView3.getText() == "O" && quantityTextView5.getText() == "O" & quantityTextView7.getText() == "O") {


            Toast.makeText(this, "On your face " + value4.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamA++;

        }else if (quantityTextView3.getText() == "X" && quantityTextView5.getText() == "X" && quantityTextView7.getText() == "X") {
            Toast.makeText(this, "On your face " + value3.toUpperCase(),
                    Toast.LENGTH_SHORT).show();
            teamB++;
        } else
        {
            return;
        }

        displayteamAScore(teamA);
        displayteamBScore(teamB);
        timer.start();
        drawvariable = 5;


    }

    public void draw(){

        if ((quantityTextView1.getText() == "O" || quantityTextView1.getText() == "X") && (quantityTextView2.getText() == "O" || quantityTextView2.getText() == "X")
                && (quantityTextView3.getText() == "O" || quantityTextView3.getText() == "X") && (quantityTextView4.getText() == "O" || quantityTextView4.getText() == "X")
                && (quantityTextView5.getText() == "O" || quantityTextView5.getText() == "X") && (quantityTextView6.getText() == "O" || quantityTextView6.getText() == "X") &&
                (quantityTextView7.getText() == "O" || quantityTextView7.getText() == "X") && (quantityTextView8.getText() == "O" || quantityTextView8.getText() == "X") &&
                (quantityTextView9.getText() == "O" || quantityTextView9.getText() == "X") && drawvariable == 0
                )

        {
            Toast.makeText(this, "Draw!",
                    Toast.LENGTH_SHORT).show();
        }
        else return;
        timer.start();


    }


}