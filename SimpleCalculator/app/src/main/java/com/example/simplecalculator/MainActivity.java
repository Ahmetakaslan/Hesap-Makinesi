package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText;
EditText editText2;
TextView textView;
TextView textView2;
double sonuç=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName);
        editText2=findViewById(R.id.editTextTextPersonName2);
        textView=findViewById(R.id.textView);
       textView2 = findViewById(R.id.textView2);
}

    public void topla(View view) {
        if (editText.getText().toString().matches("") ||
                editText2.getText().toString().matches("")) {
            textView.setText("boş bırakılamaz");
        } else {
            double a = Double.parseDouble(editText.getText().toString());
            double b = Double.parseDouble(editText2.getText().toString());
            sonuç = a + b;
            textView2.setText(a+"+" +b +" : " +sonuç);
        }

    }public void çıkar(View view) {
        if (editText.getText().toString().matches("") ||
                editText2.getText().toString().matches("")) {
            textView.setText("boş bırakılamaz");
        } else {
            double a = Double.parseDouble(editText.getText().toString());
            double b = Double.parseDouble(editText2.getText().toString());
            sonuç = a - b; textView2.setText(a+"-" +b +" : " +sonuç);

        }
    }public void böl(View view) {
      try {
          if (editText.getText().toString().matches("") ||
                  editText2.getText().toString().matches("")) {
              textView.setText("boş bırakılamaz");
          } else {
              double a = Double.parseDouble(editText.getText().toString());
              double b = Double.parseDouble(editText2.getText().toString());
              sonuç = a / b;
              textView2.setText(a+"/" +b +" : " +sonuç);
          }

      }catch (ArithmeticException a ){
          System.out.println(" 0 ra bölünemez");
      }
    }public void çarp(View view) {
        if (editText.getText().toString().matches("") ||
                editText2.getText().toString().matches("")) {
            textView.setText("boş bırakılamaz");
        } else {
            double a = Double.parseDouble(editText.getText().toString());
            double b = Double.parseDouble(editText2.getText().toString());
            sonuç = a * b;
            textView2.setText(a+"*" +b +" : " +sonuç);
        }

    }public void yüzdeal(View view) {
        if (editText.getText().toString().matches("") ||
                editText2.getText().toString().matches("")) {
            textView.setText("boş bırakılamaz");
        } else {
            double a = Double.parseDouble(editText.getText().toString());
            double b = Double.parseDouble(editText2.getText().toString());
            sonuç = (a *b)/100;
            textView2.setText(a+"%" +b +" : " +sonuç);
        }

    }
    public  void sil(View view){
        editText.setText("");
        editText2.setText("");
        textView.setText("sonuç : ");
    }

    public void eş(View view ) {
        textView.setText(String.valueOf("sonuç :"+ sonuç));
    }

}