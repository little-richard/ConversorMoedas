package com.ricardomendes.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libra);
        Bundle argsB = getIntent().getExtras();
        Double args = argsB.getDouble("libra");
        TextView txtDolar = (TextView) findViewById(R.id.textViewLibra);
        TextView txtReal = (TextView) findViewById(R.id.textViewR);
        txtDolar.setText("Valor em Libras:" + args);
        txtReal.setText("Valor em Reais:" + argsB.getString("real"));
    }
}
