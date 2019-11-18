package com.example.proyecto_final.CorosAdoracion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
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

public class registro_coro_ado extends AppCompatActivity {

    private ListView lvdatosa;
    private AsyncHttpClient clientea = new AsyncHttpClient();
    private EditText buscar;
    private ProgressDialog progressDialog;



    AlertDialog.Builder dialogo;


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new android.app.AlertDialog.Builder(this)
                    .setIcon(R.drawable.warning)
                    .setTitle("Warning")
                    .setIcon(R.drawable.warning)
                    .setMessage("¿Realmente desea salir?")
                    .setNegativeButton(android.R.string.cancel, null)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .show();
            return true;
        }
        //para las demas cosas, se reenvia el evento al listener habitual
        return super.onKeyDown(keyCode, event);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_coro_ado);

        buscar = findViewById(R.id.buscarc);
        lvdatosa = findViewById(R.id.lvDatosRCADO);

        clientea = new AsyncHttpClient();
        progressDialog= new ProgressDialog(this);

        obtenerCoros();
    }





    private void obtenerCoros(){
        progressDialog.setMessage("Cargando datos");
//muestras el ProgressDialog
        progressDialog.show();
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

            final ArrayAdapter<CorosAdo> a = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listar);
            lvdatosa.setAdapter(a);
            progressDialog.dismiss();

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


        }catch(Exception el){
            el.printStackTrace();
        }

        lvdatosa.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                CorosAdo a = listar.get(position);
                String url = "https://appmovilgamez.000webhostapp.com/eliminarca.php?id_ca="+a.getId();

                clientea.post(url, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        if (statusCode == 200){
                            Toast.makeText(registro_coro_ado.this, "Coro liminado Correctamente", Toast.LENGTH_SHORT).show();
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


        lvdatosa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CorosAdo c = (CorosAdo) parent.getItemAtPosition(position);
                Intent  intent = new Intent(getApplicationContext(), DetalleCoroAdo.class);
                intent.putExtra("objeto", (Serializable) c);
                startActivity(intent);
            }
        });
    }

    public void actu(View view) {
        finish();
        overridePendingTransition(0, 0);
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }
}
