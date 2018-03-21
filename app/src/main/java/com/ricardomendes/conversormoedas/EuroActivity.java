package com.ricardomendes.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EuroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);
        Bundle argsB = getIntent().getExtras();
        Double args = argsB.getDouble("euro");
        TextView txtDolar = (TextView) findViewById(R.id.textViewEuro);
        TextView txtReal = (TextView) findViewById(R.id.textViewR);
        txtDolar.setText("Valor em Euros:" + args);
        txtReal.setText("Valor em Reais:" + argsB.getString("real"));
    }
}
