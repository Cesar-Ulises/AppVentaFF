package com.example.proyecto_final.CorosAlegres;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyecto_final.Alabanzas.Alabanzas;
import com.example.proyecto_final.Alabanzas.Detalle;
import com.example.proyecto_final.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class registro_coro_alegre extends AppCompatActivity {
    private ListView lvdatoscal;
    private AsyncHttpClient clientecal = new AsyncHttpClient();
    private EditText buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_coro_alegre);

        lvdatoscal = findViewById(R.id.lvDatosale);
        clientecal = new AsyncHttpClient();
        buscar = findViewById(R.id.buscarca);
    }

    private void obtenerCoros(){
        String url = "https://appmovilgamez.000webhostapp.com/obtenerCoroAle.php";
        clientecal.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    //listarCoros(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }


}
