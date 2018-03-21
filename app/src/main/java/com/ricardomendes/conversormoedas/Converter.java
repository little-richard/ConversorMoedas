package com.ricardomendes.conversormoedas;

/**
 * Created by Ricardo Mendes on 20/03/2018.
 */

public class Converter {
    double[] valoresConvertidos;
    double valorReal;
    public Converter(String vReal){
        valoresConvertidos = new double[3];
        valorReal = Double.parseDouble(vReal);
        converterMoedas();
    }

    private void converterMoedas(){
        valoresConvertidos[0] = valorReal/3.308;
        valoresConvertidos[1] = valorReal/4.058;
        valoresConvertidos[2] = valorReal/4.639;
    }

    public double[] getValoresConvertidos(){
        return  valoresConvertidos;
    }
}
