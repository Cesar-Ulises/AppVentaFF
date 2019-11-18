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
import com.example.proyecto_final.CorosAdoracion.CorosAdo;
import com.example.proyecto_final.CorosAdoracion.DetalleCoroAdo;
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

        obtenerCoros();
    }

    private void obtenerCoros(){
        String url = "https://appmovilgamez.000webhostapp.com/obtenerCoroAle.php";
        clientecal.post(url, new AsyncHttpResponseHandler() {
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
        final ArrayList<CorosAle> listar = new ArrayList<CorosAle>();
        try{
            JSONArray jsonArreglo = new JSONArray(respuesta);
            for (int i=0; i<jsonArreglo.length(); i++){
                CorosAle a = new CorosAle();
                a.setId(jsonArreglo.getJSONObject(i).getInt("id_cale"));
                a.setTitulo(jsonArreglo.getJSONObject(i).getString("titulo"));
                a.setAutor(jsonArreglo.getJSONObject(i).getString("autor"));
                a.setLetra(jsonArreglo.getJSONObject(i).getString("letra"));

                listar.add(a);

            }

            final ArrayAdapter<CorosAle> a = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listar);
            lvdatoscal.setAdapter(a);

            buscar.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    a.getFilter().filter(s);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

            lvdatoscal.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                    CorosAle a = listar.get(position);
                    String url = "https://appmovilgamez.000webhostapp.com/eliminarale.php?id_cale="+a.getId();

                    clientecal.post(url, new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                            if (statusCode == 200){
                                Toast.makeText(registro_coro_alegre.this, "Coro liminado Correctamente", Toast.LENGTH_SHORT).show();
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                obtenerCoros();
                            }
                        }

                        @Override
                        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                        }
                    });

                    return true;
                }
            });


            lvdatoscal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    CorosAle ca = (CorosAle) parent.getItemAtPosition(position);
                    Intent  intent = new Intent(getApplicationContext(), DetalleCoroAle.class);
                    intent.putExtra("objeto", (Serializable) ca);
                    startActivity(intent);
                }
            });
        }catch(Exception el){
            el.printStackTrace();
        }


    }

}
