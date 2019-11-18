package com.example.proyecto_final.CorosAdoracion;

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

import com.example.proyecto_final.R;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class registro_coro_ado extends AppCompatActivity {

    private ListView lvdatosa;
    private AsyncHttpClient clientea = new AsyncHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_coro_ado);


        lvdatosa = findViewById(R.id.lvDatosRCADO);

        clientea = new AsyncHttpClient();

        obtenerCoros();
    }


    private void obtenerCoros(){
        String url = "https://appmovilgamez.000webhostapp.com/obtenerCoroA.php";
        clientea.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                   listarCoros(new String(responseBody));
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }


    private  void listarCoros(String respuesta){
        final ArrayList<CorosAdo> listar = new ArrayList<CorosAdo>();
        try{
            JSONArray jsonArreglo = new JSONArray(respuesta);
            for (int i=0; i<jsonArreglo.length(); i++){
                CorosAdo a = new CorosAdo();
                a.setId(jsonArreglo.getJSONObject(i).getInt("id_ca"));
                a.setTitulo(jsonArreglo.getJSONObject(i).getString("titulo"));
                a.setAutor(jsonArreglo.getJSONObject(i).getString("autor"));
                a.setLetra(jsonArreglo.getJSONObject(i).getString("letra"));

                listar.add(a);

            }

            ArrayAdapter<CorosAdo> a = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listar);
            lvdatosa.setAdapter(a);


        }catch(Exception el){
            el.printStackTrace();
        }


    }
}
