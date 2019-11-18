package com.example.proyecto_final.Alabanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.proyecto_final.R;
import com.loopj.android.http.AsyncHttpClient;

public class registro_alabanzas extends AppCompatActivity {

    private ListView lvdatos;
    private AsyncHttpClient cliente = new AsyncHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_alabanzas);

        lvdatos = findViewById(R.id.lvDatosR);

        cliente = new AsyncHttpClient();
    }
}
