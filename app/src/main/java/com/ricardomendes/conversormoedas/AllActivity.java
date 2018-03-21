package com.ricardomendes.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        Bundle argsB = getIntent().getExtras();
        double[] args = argsB.getDoubleArray("todos");
        TextView txtDolar = (TextView) findViewById(R.id.textDolar);
        TextView txtReal = (TextView) findViewById(R.id.textReal);
        TextView txtEuro = (TextView) findViewById(R.id.textEuro);
        TextView txtLibra = (TextView) findViewById(R.id.textLibra);
        txtDolar.setText("Valor em Dolares:" + args[0]);
        txtEuro.setText("Valor em Euros:" + args[1]);
        txtLibra.setText("Valor em Libras:" + args[2]);
        txtReal.setText("Valor em Reais:" + argsB.getString("real"));
    }
}
