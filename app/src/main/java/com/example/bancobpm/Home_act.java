package com.example.bancobpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Home_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_act);
    }
    public void info(View view){
        Intent info = new Intent( this, Info_act.class );
        startActivity(info);

    }
    public void seguridad (View view ){
        Intent seguridad = new Intent(this, Seguridad_act.class);
        startActivity(seguridad);
    }
    public void cliente (View view){
        Intent cliente = new Intent(this,Clientes_act.class);
        startActivity(cliente);
    }

    public void prestamos (View view){
        //spinner1
        ArrayList<String> clientes = new ArrayList<String>(); //para el spinner1
        clientes.add("Axel");
        clientes.add("Roxana");
        //spiner2
        ArrayList<String> credito = new ArrayList<String>();
        credito.add("credito Hipotecario");
        credito.add("credito Automotriz");

        Intent vistaPrestamos = new Intent( this, Prestamos_act.class);
        vistaPrestamos.putExtra("listaClientes",clientes); // preparo el dato para ser enviado
        vistaPrestamos.putExtra("listaCreditos",credito);
        startActivity(vistaPrestamos);
    }
}