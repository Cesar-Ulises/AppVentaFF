package com.example.proyecto_final.Alabanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.proyecto_final.R;

public class Detalle extends AppCompatActivity {

TextView tv_titulo, tv_autor, tv_letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tv_titulo = findViewById(R.id.tv_tituloA);
        tv_autor = findViewById(R.id.tv_autorA);
        tv_letra = findViewById(R.id.tv_ala);

        Alabanzas a = (Alabanzas) getIntent().getExtras().getSerializable("objeto");

        tv_titulo.setText(a.getTitulo());
        tv_autor.setText(a.getAutor());
        tv_letra.setText(a.getLetra());
    }
}
