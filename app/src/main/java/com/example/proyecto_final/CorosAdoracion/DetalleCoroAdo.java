package com.example.proyecto_final.CorosAdoracion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.proyecto_final.Alabanzas.Alabanzas;
import com.example.proyecto_final.R;

public class DetalleCoroAdo extends AppCompatActivity {

    TextView tv_titulo, tv_autor, tv_letra, tv_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_coro_ado);

        tv_id = findViewById(R.id.tv_idCado);
        tv_titulo = findViewById(R.id.tv_tituloCado);
        tv_autor = findViewById(R.id.tv_autorCado);
        tv_letra = findViewById(R.id.tv_alaCado);

        CorosAdo a = (CorosAdo) getIntent().getExtras().getSerializable("objeto");

        tv_id.setText(a.getId()+"");
        tv_titulo.setText(a.getTitulo());
        tv_autor.setText(a.getAutor());
        tv_letra.setText(a.getLetra());
    }
}
