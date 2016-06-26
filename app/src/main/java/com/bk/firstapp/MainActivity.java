package com.bk.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button)findViewById(R.id.build_btn);
        btn0.setOnClickListener(this);
        btn1= (Button) findViewById(R.id.cap_btn);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.go_btn);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.make_btn);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.movie_btn);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.stock_btn);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.movie_btn:
                GenerateToast("This button will launch my movie app!");
                break;
            case R.id.stock_btn:
                GenerateToast("This button will launch my stock app!");
                break;
            case R.id.build_btn:
                GenerateToast("This button will launch my build bigger app!");
                break;
            case R.id.make_btn:
                GenerateToast("This button will launch my material app!");
                break;
            case R.id.go_btn:
                GenerateToast("This button will launch my go ubi app!");
                break;
            case R.id.cap_btn:
                GenerateToast("This button will launch my capstone app!");
                break;
            default:
                    break;
        }
    }

    private void GenerateToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
