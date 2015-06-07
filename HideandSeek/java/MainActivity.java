package com.swatiag1101.hideandseek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btnHideSeek;
    TextView textData;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHideSeek = (Button) findViewById(R.id.buttonHide);
        textData = (TextView) findViewById(R.id.textData);

        btnHideSeek.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(btnHideSeek.getText()=="HIDE"){
            textData.setVisibility(View.GONE);
            btnHideSeek.setText("SHOW");
        }else{
            textData.setVisibility(View.VISIBLE);
            btnHideSeek.setText("HIDE");
        }

    }
}
