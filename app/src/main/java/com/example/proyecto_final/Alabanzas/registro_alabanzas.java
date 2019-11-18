package com.example.proyecto_final.Alabanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.proyecto_final.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class registro_alabanzas extends AppCompatActivity {

    private ListView lvdatos;
    private AsyncHttpClient cliente = new AsyncHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_alabanzas);

        lvdatos = findViewById(R.id.lvDatosR);

        cliente = new AsyncHttpClient();

        obtenerAlabanzas();
    }

    private void obtenerAlabanzas(){
        String url = "https://appmovilgamez.000webhostapp.com/obtenerDatos.php";
        cliente.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                   // listarAlabanzas(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
}
