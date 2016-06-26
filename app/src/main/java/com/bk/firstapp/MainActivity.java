package com.bk.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = new Button(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.movie_btn:
                GenerateToast("This button will launch my movie app!");
            case R.id.stock_btn:
                GenerateToast("This button will launch my stock app!");
            case R.id.build_btn:
                GenerateToast("This button will launch my build bigger app!");
            case R.id.make_btn:
                GenerateToast("This button will launch my material app!");
            case R.id.go_btn:
                GenerateToast("This button will launch my go ubi app!");
            case R.id.cap_btn:
                GenerateToast("This button will launch my capstone app!");
            default:
                    break;
        }
    }

    private void GenerateToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
