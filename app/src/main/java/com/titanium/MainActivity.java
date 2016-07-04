package com.titanium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText summ ;
    TextView show ;
    String showResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        summ = (EditText)findViewById(R.id.editText);
        show = (TextView)findViewById(R.id.textView);
    }

    public  void show ( View v){
        showResult="";
        if(!summ.getText().toString().equals("")){
        getCash(Integer.parseInt(summ.getText().toString()));}
    }

    public  void getCash(int sum) {


        if(sum<=0){
            System.out.println("Summ must be > 0");
        }else{
            int[] value = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 1};

            for (int i = 0; i < value.length; i++) {
                float result = (float) sum / value[i];
                if (result == 1) {
                    System.out.println("" + value[i] + " " + (int)result);
                    showResult = showResult + ("" + value[i] + " - " + (int)result)+"\n";
                    break;
                } else if((int)result!=0){
                    sum=sum-(int)result*value[i];
                    System.out.println("" + value[i] + " " + (int)result);
                    showResult = showResult + ("" + value[i] + " - " + (int)result)+"\n";
                }

            }
        }

        show.setText(showResult);

    }

}
