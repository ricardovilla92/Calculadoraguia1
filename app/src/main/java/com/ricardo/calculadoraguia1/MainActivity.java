package com.ricardo.calculadoraguia1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     boolean decimal = false;
    boolean igual = false;
    boolean sumar = false;
    boolean rest = false;
    boolean multi = false;
    boolean dividir = false;
    boolean delete = false;
    boolean porcentaje = false;
    boolean punto = false;

    Double [] numeros = new Double[20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cero = (Button) findViewById(R.id.b0);
        cero.setOnClickListener(this);

        Button uno = (Button) findViewById(R.id.b1);
        uno.setOnClickListener(this);

        Button dos = (Button) findViewById(R.id.b2);
        dos.setOnClickListener(this);

        Button tres = (Button) findViewById(R.id.b3);
        tres.setOnClickListener(this);

        Button cuatro = (Button) findViewById(R.id.b4);
        cuatro.setOnClickListener(this);

        Button cinco = (Button) findViewById(R.id.b5);
        cinco.setOnClickListener(this);

        Button seis = (Button) findViewById(R.id.b6);
        seis.setOnClickListener(this);

        Button siete = (Button) findViewById(R.id.b7);
        siete.setOnClickListener(this);

        Button ocho = (Button) findViewById(R.id.b8);
        ocho.setOnClickListener(this);

        Button nueve = (Button) findViewById(R.id.b9);
        nueve.setOnClickListener(this);

        Button suma = (Button) findViewById(R.id.bsuma);
        suma.setOnClickListener(this);

        Button resta = (Button) findViewById(R.id.bresta);
        resta.setOnClickListener(this);

        Button multiplicar = (Button) findViewById(R.id.bmultiplicacion);
        multiplicar.setOnClickListener(this);

        Button division = (Button) findViewById(R.id.bdivision);
        division.setOnClickListener(this);

        Button punto = (Button) findViewById(R.id.bpunto);
        punto.setOnClickListener(this);

        Button limpiar = (Button) findViewById(R.id.bdel);
        limpiar.setOnClickListener(this);

        Button borrauno = (Button) findViewById(R.id.bac);
        borrauno.setOnClickListener(this);

        Button porcentaje = (Button) findViewById(R.id.bcien);
        porcentaje.setOnClickListener(this);

        Button igual = (Button) findViewById(R.id.bigual);
        igual.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texpantalla);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try{

                switch (seleccion){

                    case R.id.b0:
                        pantalla.setText(a+"0");
                        break;
                    case R.id.b1:
                        pantalla.setText(a+"1");
                        break;
                    case R.id.b2:
                        pantalla.setText(a+"2");
                        break;
                    case R.id.b3:
                        pantalla.setText(a+"3");
                        break;
                    case R.id.b4:
                        pantalla.setText(a+"4");
                        break;
                    case R.id.b5:
                        pantalla.setText(a+"5");
                        break;
                    case R.id.b6:
                        pantalla.setText(a+"6");
                        break;
                    case R.id.b7:
                        pantalla.setText(a+"7");
                        break;
                    case R.id.b8:
                        pantalla.setText(a+"8");
                        break;
                    case R.id.b9:
                        pantalla.setText(a+"9");
                        break;

                    case R.id.bpunto:
                        if (decimal == false){
                        pantalla.setText(a+".");
                            decimal = true;
                }else{
                           return;
                          }
                            break;

                    case R.id.bresta:
                        rest = true;
                        numeros[0]  = Double.parseDouble(a);
                        pantalla.setText("");
                        decimal = false;
                        break;

                    case R.id.bsuma:
                        sumar = true;
                        numeros[0]  = Double.parseDouble(a);
                        pantalla.setText("");
                        decimal = false;
                        break;


                    case R.id.bdivision:
                        dividir = true;
                        numeros[0]  = Double.parseDouble(a);
                        pantalla.setText("");
                        decimal = false;
                        break;


                    case R.id.bigual:
                        numeros[1]  = Double.parseDouble(a);
                        if (rest == true){
                                resultado = numeros [0] - numeros [1];
                                pantalla.setText(String.valueOf(resultado));
                            } else if (sumar == true){
                        resultado = numeros [0] + numeros [1];
                        pantalla.setText(String.valueOf(resultado));
                            } else if (multi == true){
                            resultado = numeros [0] * numeros [1];
                            pantalla.setText(String.valueOf(resultado));
                        }else if (dividir == true){
                            resultado = numeros [0] / numeros [1];
                            pantalla.setText(String.valueOf(resultado));
                        }
                        decimal = false;
                        igual = false;
                        sumar = false;
                        rest = false;
                        multi = false;
                        dividir = false;
                        porcentaje = false;
                        punto = false;
                        break;
                    case R.id.bdel:
                        pantalla.setText("");
                        decimal = false;
                        break;
                    case R.id.bac:
                        pantalla.setText(a.substring(0,a.length()-1));
                        decimal = false;
                        break;
                }
        }catch (Exception e) {
            pantalla.setText("ERROR");
        }
    }
}

