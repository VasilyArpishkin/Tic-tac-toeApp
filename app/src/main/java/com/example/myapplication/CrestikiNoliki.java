package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class CrestikiNoliki extends AppCompatActivity {
    private Button button1, button2,button3,button4,button5,button6,button7,button8, button9, buttonR;
    private TextView textview=findViewById(R.id.TV);
    private TextView you=findViewById(R.id.you);
    private TextView computer=findViewById(R.id.computer);
    private int c1=0, c2=0;
    private String krestik, nol;
    private int colorRed= Color.rgb(255,46,35);
    private int colorGreen = Color.rgb(83,225,14);
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_krestikinolici);
        krestik="X";
        nol="O";
        buttonR=findViewById(R.id.restart);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        textview.findViewById(R.id.TV);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt6();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt7();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt8();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBt9();
            }
        });
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { restartNobody(); }
        });
    }
    public void clickBt1(){
        if(button1.getText()=="") {
            button1.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt2(){
        if(button2.getText()=="") {
            button2.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt3(){
        if(button3.getText()=="") {
            button3.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt4(){
        if(button4.getText()=="") {
            button4.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt5(){
        if(button5.getText()=="") {
            button5.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt6(){
        if(button6.getText()=="") {
            button6.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt7(){
        if(button7.getText()=="") {
            button7.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt8(){
        if(button8.getText()=="") {
            button8.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void clickBt9(){
        if(button9.getText()=="") {
            button9.setText(krestik);
            isWinnerYou();
            isPlayerNearWin();
            isWinnerEnemy();
            isFull();
        }
    }
    public void isWinnerYou(){
        if(button1.getText()==krestik && button2.getText()==krestik && button3.getText()==krestik){
            button1.setBackgroundColor(colorGreen);
            button2.setBackgroundColor(colorGreen);
            button3.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button4.getText()==krestik && button5.getText()==krestik && button6.getText()==krestik){
            button4.setBackgroundColor(colorGreen);
            button5.setBackgroundColor(colorGreen);
            button6.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button7.getText()==krestik && button8.getText()==krestik && button9.getText()==krestik){
            button7.setBackgroundColor(colorGreen);
            button8.setBackgroundColor(colorGreen);
            button9.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button1.getText()==krestik && button4.getText()==krestik && button7.getText()==krestik){
            button1.setBackgroundColor(colorGreen);
            button4.setBackgroundColor(colorGreen);
            button7.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button2.getText()==krestik && button5.getText()==krestik && button8.getText()==krestik){
            button2.setBackgroundColor(colorGreen);
            button5.setBackgroundColor(colorGreen);
            button8.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button3.getText()==krestik && button6.getText()==krestik && button9.getText()==krestik){
            button3.setBackgroundColor(colorGreen);
            button6.setBackgroundColor(colorGreen);
            button9.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button1.getText()==krestik && button5.getText()==krestik && button9.getText()==krestik){
            button1.setBackgroundColor(colorGreen);
            button5.setBackgroundColor(colorGreen);
            button9.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
        else if(button3.getText()==krestik && button5.getText()==krestik && button7.getText()==krestik){
            button3.setBackgroundColor(colorGreen);
            button5.setBackgroundColor(colorGreen);
            button7.setBackgroundColor(colorGreen);
            textview.setText("Вы победили!");
            restartWinnerYou();
        }
    }
    public void isWinnerEnemy(){
        if(button1.getText()==nol && button2.getText()==nol && button3.getText()==nol){
            button1.setBackgroundColor(colorRed);
            button2.setBackgroundColor(colorRed);
            button3.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button4.getText()==nol && button5.getText()==nol && button6.getText()==nol){
            button4.setBackgroundColor(colorRed);
            button5.setBackgroundColor(colorRed);
            button6.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button7.getText()==nol && button8.getText()==nol && button9.getText()==nol){
            button7.setBackgroundColor(colorRed);
            button8.setBackgroundColor(colorRed);
            button9.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button1.getText()==nol && button4.getText()==nol && button7.getText()==nol){
            button1.setBackgroundColor(colorRed);
            button4.setBackgroundColor(colorRed);
            button7.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button2.getText()==nol && button5.getText()==nol && button8.getText()==nol){
            button2.setBackgroundColor(colorRed);
            button5.setBackgroundColor(colorRed);
            button8.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button3.getText()==nol && button6.getText()==nol && button9.getText()==nol){
            button3.setBackgroundColor(colorRed);
            button6.setBackgroundColor(colorRed);
            button9.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button1.getText()==nol && button5.getText()==nol && button9.getText()==nol){
            button1.setBackgroundColor(colorRed);
            button5.setBackgroundColor(colorRed);
            button9.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
        else if(button3.getText()==nol && button5.getText()==nol && button7.getText()==nol){
            button3.setBackgroundColor(colorRed);
            button5.setBackgroundColor(colorRed);
            button7.setBackgroundColor(colorRed);
            textview.setText("Вы проиграли!");
            restartWinnerComputer();
        }
    }
    public void clickPC(){
        int randomnumber = (int) (Math.random()*9+1);
        switch(randomnumber){
            case 1: if(button1.getText()==krestik)clickPC();
            else button1.setText(nol); break;
            case 2: if(button2.getText()==krestik)clickPC();
            else button2.setText(nol); break;
            case 3: if(button3.getText()==krestik)clickPC();
            else button3.setText(nol); break;
            case 4: if(button4.getText()==krestik)clickPC();
            else button4.setText(nol); break;
            case 5: if(button5.getText()==krestik)clickPC();
            else button5.setText(nol); break;
            case 6: if(button6.getText()==krestik)clickPC();
            else button6.setText(nol); break;
            case 7: if(button7.getText()==krestik)clickPC();
            else button7.setText(nol); break;
            case 8: if(button8.getText()==krestik)clickPC();
            else button8.setText(nol); break;
            case 9: if(button9.getText()==krestik)clickPC();
            else button9.setText(nol); break;
        }
    }
    public void restartWinnerYou(){
        c1++;
        String k=Integer.toString(c1), p;
        p=you.getText()+k;
        you.setText(p);
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }

    public void restartWinnerComputer(){
        c2++;
        String k=Integer.toString(c2), p;
        p=computer.getText()+k;
        you.setText(p);
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }
    public void restartNobody(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }

    public void isPlayerNearWin(){
        int k=0;
        if(button1.getText()!="")k++;
        if(button2.getText()!="")k++;
        if(button3.getText()!="")k++;
        if(button4.getText()!="")k++;
        if(button5.getText()!="")k++;
        if(button6.getText()!="")k++;
        if(button7.getText()!="")k++;
        if(button8.getText()!="")k++;
        if(button9.getText()!="")k++;
        if(k==8 && button5.getText()=="")button5.setText(nol);
        else if(button1.getText()==krestik && button2.getText()==krestik && button3.getText()=="")button3.setText(nol);
        else if(button4.getText()==krestik && button5.getText()==krestik && button6.getText()=="")button6.setText(nol);
        else if(button7.getText()==krestik && button8.getText()==krestik && button9.getText()=="")button9.setText(nol);
        else if(button2.getText()==krestik && button3.getText()==krestik && button1.getText()=="")button1.setText(nol);
        else if(button5.getText()==krestik && button6.getText()==krestik && button4.getText()=="")button4.setText(nol);
        else if(button8.getText()==krestik && button9.getText()==krestik && button7.getText()=="")button7.setText(nol);
        else if(button1.getText()==krestik && button3.getText()==krestik && button2.getText()=="")button2.setText(nol);
        else if(button4.getText()==krestik && button6.getText()==krestik && button5.getText()=="")button5.setText(nol);
        else if(button7.getText()==krestik && button9.getText()==krestik && button8.getText()=="")button8.setText(nol);
        else if(button1.getText()==krestik && button7.getText()==krestik && button4.getText()=="")button4.setText(nol);
        else if(button2.getText()==krestik && button8.getText()==krestik && button5.getText()=="")button5.setText(nol);
        else if(button3.getText()==krestik && button9.getText()==krestik && button6.getText()=="")button6.setText(nol);
        else if(button1.getText()==krestik && button4.getText()==krestik && button7.getText()=="")button7.setText(nol);
        else if(button2.getText()==krestik && button5.getText()==krestik && button8.getText()=="")button8.setText(nol);
        else if(button3.getText()==krestik && button6.getText()==krestik && button9.getText()=="")button9.setText(nol);
        else if(button4.getText()==krestik && button7.getText()==krestik && button1.getText()=="")button1.setText(nol);
        else if(button5.getText()==krestik && button8.getText()==krestik && button2.getText()=="")button2.setText(nol);
        else if(button6.getText()==krestik && button9.getText()==krestik && button3.getText()=="")button3.setText(nol);
        else if(button1.getText()==krestik && button5.getText()==krestik && button9.getText()=="")button9.setText(nol);
        else if(button5.getText()==krestik && button9.getText()==krestik && button1.getText()=="")button1.setText(nol);
        else if(button1.getText()==krestik && button9.getText()==krestik && button5.getText()=="")button5.setText(nol);
        else if(button7.getText()==krestik && button5.getText()==krestik && button3.getText()=="")button3.setText(nol);
        else if(button5.getText()==krestik && button3.getText()==krestik && button7.getText()=="")button7.setText(nol);
        else if(button7.getText()==krestik && button3.getText()==krestik && button5.getText()=="")button5.setText(nol);
        else if(k!=0)clickPC();
    }
    public void isFull(){
        int k=0;
        if(button1.getText()!="")k++;
        if(button2.getText()!="")k++;
        if(button3.getText()!="")k++;
        if(button4.getText()!="")k++;
        if(button5.getText()!="")k++;
        if(button6.getText()!="")k++;
        if(button7.getText()!="")k++;
        if(button8.getText()!="")k++;
        if(button9.getText()!="")k++;
        if(k==9){
            textview.setText("Ничья!");
            restartNobody();
        }
    }
}