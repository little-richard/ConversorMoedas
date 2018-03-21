package com.ricardomendes.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DolarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);
        Bundle argsB = getIntent().getExtras();
        double args = argsB.getDouble("dolar");
        TextView txtDolar = (TextView) findViewById(R.id.textViewDolar);
        TextView txtReal = (TextView) findViewById(R.id.textViewR);
        txtDolar.setText("Valor em Dolares:" + args);
        txtReal.setText("Valor em Reais:" + argsB.getString("real"));
    }
}
