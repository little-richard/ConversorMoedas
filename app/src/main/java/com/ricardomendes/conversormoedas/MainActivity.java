package com.ricardomendes.conversormoedas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText valorReal;
    Button btDolar;
    Button btEuro;
    Button btLibra;
    Button btAll;
    Converter converte;
    double[] valoresC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valorReal = (EditText) findViewById(R.id.editText);
        btDolar = (Button) findViewById(R.id.buttonDolar);
        btEuro = (Button) findViewById(R.id.buttonEuro);
        btLibra = (Button) findViewById(R.id.buttonLibra);
        btAll = (Button) findViewById(R.id.buttonAll);

        //Click botão dolar
        btDolar.setOnClickListener(OnClickConverterDolar());

        //Click botão Euro
        btEuro.setOnClickListener(OnClickConverterEuro());

        //Click botão Libra
        btLibra.setOnClickListener(OnClickConverterLibra());

        //Click botão converter todos
        btAll.setOnClickListener(OnClickConverterTodos());
    }

    private View.OnClickListener OnClickConverterTodos() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!valorReal.getText().toString().equals("")) {
                    converte = new Converter(valorReal.getText().toString());
                    valoresC = converte.getValoresConvertidos();
                    Intent intent = new Intent(MainActivity.this, AllActivity.class);
                    Bundle params = new Bundle();
                    params.putDoubleArray("todos", valoresC);
                    params.putString("real", valorReal.getText().toString());
                    intent.putExtras(params);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Por favor digite um valor em Reais para poder continuar!", Toast.LENGTH_LONG).show();
                }
            }
        };
    }

    private View.OnClickListener OnClickConverterLibra() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!valorReal.getText().toString().equals("")) {
                    converte = new Converter(valorReal.getText().toString());
                    valoresC = converte.getValoresConvertidos();
                    Intent intent = new Intent(MainActivity.this, LibraActivity.class);
                    Bundle params = new Bundle();
                    params.putDouble("libra", valoresC[2]);
                    params.putString("real", valorReal.getText().toString());
                    intent.putExtras(params);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Por favor digite um valor em Reais para poder continuar!", Toast.LENGTH_LONG).show();
                }
            }
        };
    }

    private View.OnClickListener OnClickConverterEuro() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!valorReal.getText().toString().equals("")) {
                    converte = new Converter(valorReal.getText().toString());
                    valoresC = converte.getValoresConvertidos();
                    Intent intent = new Intent(MainActivity.this, EuroActivity.class);
                    Bundle params = new Bundle();
                    params.putDouble("euro", valoresC[1]);
                    params.putString("real", valorReal.getText().toString());
                    intent.putExtras(params);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Por favor digite um valor em Reais para poder continuar!", Toast.LENGTH_LONG).show();
                }
            }
        };
    }

    private View.OnClickListener OnClickConverterDolar(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!valorReal.getText().toString().equals("")) {
                    converte = new Converter(valorReal.getText().toString());
                    valoresC = converte.getValoresConvertidos();
                    Intent intent = new Intent(MainActivity.this, DolarActivity.class);
                    Bundle params = new Bundle();
                    params.putDouble("dolar", valoresC[0]);
                    params.putString("real", valorReal.getText().toString());
                    intent.putExtras(params);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Por favor digite um valor em Reais para poder continuar!", Toast.LENGTH_LONG).show();
                }
            }
        };
    }
}
