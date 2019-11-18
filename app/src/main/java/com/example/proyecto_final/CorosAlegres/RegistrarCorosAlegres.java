package com.example.proyecto_final.CorosAlegres;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
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
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class RegistrarCorosAlegres extends AppCompatActivity {
    private EditText ettitulocal, etautorcal, etletracal;
    private Button btnRegistrarcal;
    private ListView lvdatoscal;
    private AsyncHttpClient clientecal = new AsyncHttpClient();


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

                    agregarCoros(a);

                }
            }
        });
    }


    private  void agregarCoros(CorosAle a){
        String url = "https://appmovilgamez.000webhostapp.com/agregarale.php?";
        String parametros = "titulo="+a.getTitulo()+"&autor="+a.getAutor()+"&letra="+a.getLetra();
        clientecal.post(url + parametros, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200){
                    Toast.makeText(RegistrarCorosAlegres.this, "Coro agregado correctamente", Toast.LENGTH_SHORT).show();
                    ettitulocal.setText("");
                    etautorcal.setText("");
                    etletracal.setText("");
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

    public void verlistaale(View view) {
        Intent intent = new Intent(this, registro_coro_alegre.class);
        startActivity(intent);
    }
}
