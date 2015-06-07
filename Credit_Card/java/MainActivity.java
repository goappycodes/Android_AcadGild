package com.swatiag1101.credit_card_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{

    int monthlyPriciple,monthlyInterestPaid,monthlyBalance;
    int count=0;
    Button buttonCompute,buttonClear;
    TextView textCardBalance,textRateOfInterest, textMinimumPayment, textFinalCardBalance,textMonthsRemaining,textInterestPaid;
    EditText editCardBalance,editRateOfInterest, editMinimumPayment, editFinalCardBalance,editMonthsRemaining,editInterestPaid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonCompute = (Button) findViewById(R.id.buttonCompute);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        textCardBalance = (TextView) findViewById(R.id.textCardBalance);
        textRateOfInterest = (TextView) findViewById(R.id.textYearlyRateofInterest);
        textMinimumPayment = (TextView) findViewById(R.id.textMinimumPayment);
        textFinalCardBalance = (TextView) findViewById(R.id.textFinalCardBalance);
        textMonthsRemaining = (TextView) findViewById(R.id.textMonthsRemaining);
        textInterestPaid = (TextView) findViewById(R.id.textInterestPaid);

        editCardBalance = (EditText) findViewById(R.id.editCardBalance);
        editRateOfInterest = (EditText) findViewById(R.id.editYearlyRateOfInterest);
        editMinimumPayment = (EditText) findViewById(R.id.editMinimumPayment);
        editFinalCardBalance = (EditText) findViewById(R.id.editFinalCardBalance);
        editMonthsRemaining = (EditText) findViewById(R.id.editMonthsRemaining);
        editInterestPaid = (EditText) findViewById(R.id.editInterestPaid);

        buttonCompute.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        int cardBal = Integer.parseInt(editCardBalance.getText().toString());
        double rateOfInt = Double.parseDouble(editRateOfInterest.getText().toString());
        int minPay = Integer.parseInt(editMinimumPayment.getText().toString());

        double x= rateOfInt / (100*12);

        if(v.getId()==R.id.buttonCompute){
            if(cardBal>0) {
                monthlyInterestPaid = (int) Math.round((cardBal * x));
                if(cardBal<minPay){
                    monthlyPriciple = cardBal;
                }else{
                    monthlyPriciple =  minPay - monthlyInterestPaid;
                }
                monthlyBalance = cardBal - monthlyPriciple;

                count++;

                editInterestPaid.setText(String.valueOf(monthlyInterestPaid));
                editFinalCardBalance.setText(String.valueOf(monthlyBalance));
                editMonthsRemaining.setText(String.valueOf(count));

                editCardBalance.setText(String.valueOf(monthlyBalance));
            }

        }else{

            editInterestPaid.setText("");
            editFinalCardBalance.setText("");
            editMonthsRemaining.setText("");
            editRateOfInterest.setText("");
            editMinimumPayment.setText("");
            editCardBalance.setText("");
        }

    }
}
