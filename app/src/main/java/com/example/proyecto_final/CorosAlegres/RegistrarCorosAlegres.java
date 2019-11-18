package com.example.proyecto_final.CorosAlegres;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.proyecto_final.CorosAdoracion.RegistrarCorosAdoracion;
import com.example.proyecto_final.R;
import com.loopj.android.http.AsyncHttpClient;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistrarCorosAlegres extends AppCompatActivity {
    private EditText ettitulocal, etautorcal, etletracal;
    private Button btnRegistrarcal;
    private ListView lvdatoscal;
    private AsyncHttpClient clientecal = new AsyncHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_coros_alegres);

        ettitulocal = findViewById(R.id.ettituloal);
        etautorcal = findViewById(R.id.etautoral);
        etletracal = findViewById(R.id.etletraal);

        btnRegistrarcal = findViewById(R.id.btnRegistraral);

        clientecal = new AsyncHttpClient();

        almacenarCoros();
    }

    private void almacenarCoros() {
        btnRegistrarcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ettitulocal.getText().toString().length()== 0 )  {
                    ettitulocal.setError("Campo Obligatorio");
                }else if (etautorcal.getText().toString().length()== 0){
                    etautorcal.setError("Campo Obligatorio");
                }else  if (etletracal.getText().toString().length()== 0){
                    etletracal.setError("Campo Obligatorio");
                }else{
                    CorosAle a = new CorosAle();
                    a.setTitulo(ettitulocal.getText().toString().replaceAll(" ", "%20"));
                    a.setAutor(etautorcal.getText().toString().replaceAll(" ", "%20"));
                    a.setLetra(etletracal.getText().toString().replaceAll(" ", "%20"));

                    //agregarCoros(a);

                }
            }
        });
    }

}
