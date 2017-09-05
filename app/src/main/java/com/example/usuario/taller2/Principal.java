package com.example.usuario.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {


    private TextView total, unidad;
    private EditText cantidad;
    private Spinner genero, tipo, marca;

    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        unidad = (TextView) findViewById(R.id.lblunidad);
        total = (TextView) findViewById(R.id.lblresultado);

        cantidad = (EditText) findViewById(R.id.lblunidad);

        genero = (Spinner) findViewById(R.id.spgenero);
        tipo = (Spinner) findViewById(R.id.sptipo);
        marca = (Spinner) findViewById(R.id.spmarca);

        resources = this.getResources();

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.genero, android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.Tipo, android.R.layout.simple_spinner_item);
        tipo.setAdapter(adapter1    );

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.marca, android.R.layout.simple_spinner_item);
        marca.setAdapter(adapter2);



    }
}
