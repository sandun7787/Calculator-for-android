package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double firstNum;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = findViewById(R.id.num0);

        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);


        Button on =findViewById(R.id.on);
        Button off =findViewById(R.id.off);

        TextView screen =findViewById(R.id.screen);off.setOnClickListener();

      off.setOnClickListener(view-> setvisibility(View.GONE));
      on.setOnClickListener(view -> {
          screen.setVsibility(view.VISIBLE);
          screen.setText("0");

      });
        ArrayList<Button> nuns = new ArrayList<>();
        nuns.add(nuns0);
        nuns.add(nuns1);
        nuns.add(nuns2);
        nuns.add(nuns3);
        nuns.add(nuns4);
        nuns.add(nuns5);
        nuns.add(nuns6);
        nuns.add(nuns7);
        nuns.add(nuns8);
        nuns.add(nuns9);
        nuns.add(nuns0);

        for (buttons b:nuns){
            b.setOnClickListeneer(view -> {
                if (screen.getText().toString().equals("0")) ;
                screen.setText(screen.getText().toString() + b.getText().toString());
            }else{
                screen.setText((b.getText().toString));


            }




        });

            ArrayList<button> opers =new ArrayList<>();
            opers.add(div);
            opers.add(times);
            opers.add(plus);
            opers.add(min);

            for(button b:opers) {
                b.setOneclick,iatwe(view ->{
                    firtNun= double.parseDouble(screen.getText().toString());
                    operation = b.getText().toString();
                    screen.setText("0");

                });

                delete.setOneclick,iatwe(view ->{
                    String num = screen.getText().toString();
                    if (num.length()>1) {
                        screen.setText((num.substring(0, num.length() - 1)));
                    }else if (num.length()== 1&& !num.equls("0")){
                        screen.setText("0");

                    });
                }
                point.setOnClickListener(view ->{
                    if(!screen.getText().toString().contains()){
                        screen.setText((screen.getText().toString()+"."));

                        equal..setOnClickListener(view ->{
                            double secoundNum = double.parseDouble(screen.getText().toString();
                            double.result;
                            switch(operation){
                                case "/":
                                    result =firstname/secoundNum;
                                    break;
                                    case "/";
                                    result =firstNum/secoundNum;
                                    case"x"
                                        result=firstNum+secoundNum;
                                    case"+"
                                        result=firstNum+secoundNum;
                                    case"-"
                                        result=firstNum-secoundNum;
                                    break;
                                    default;
                                    result=firtnum+secoundNum;
                                    screen.setText((string.volueof(result)))
                                    firstNum=result:
                                        
                                    ;




                            }
                        }

                    }

                }

    }



    }
}