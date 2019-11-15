package com.example.proyecto_final.CorosAlegres;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.proyecto_final.R;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistrarCorosAlegres extends AppCompatActivity implements View.OnClickListener {
    EditText etnombre, etautor, etletra;
    Button btnR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_coros_alegres);

        etnombre = findViewById(R.id.etNombreCoroAle);
        etautor = findViewById(R.id.etAutorCoroAle);
        etletra = findViewById(R.id.etLetraCoroAle);
        btnR = findViewById(R.id.btnGuardarCoroAle);

        btnR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final String titulo = etnombre.getText().toString();
        final String autor = etautor.getText().toString();
        final String letra = etletra.getText().toString();

        if (etnombre.getText().toString().length() == 0){
            etnombre.setError("Campo Obligatorio");
        }else if (etautor.getText().toString().length() == 0){
            etautor.setError("Campo Obligatorio");
        }else if (etletra.getText().toString().length() == 0){
            etletra.setError("Campo Obligatorio");
        }else {
            Response.Listener<String> responseListener = new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        JSONObject jsonResponse = new JSONObject(response);
                        boolean success = jsonResponse.getBoolean("success");

                        if (success ){
                            Toast.makeText(RegistrarCorosAlegres.this, "Registro realizado exitosamente", Toast.LENGTH_SHORT).show();
                            etnombre.setText(null);
                            etautor.setText(null);
                            etletra.setText(null);
                        }else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegistrarCorosAlegres.this);
                            builder.setMessage("Error al registrar")
                                    .setNegativeButton("Retry", null)
                                    .create().show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            };
            RegisterRequestCoroAle registrarRequestCoro = new RegisterRequestCoroAle(titulo, autor, letra, responseListener);
            RequestQueue queue = Volley.newRequestQueue(RegistrarCorosAlegres.this);
            queue.add(registrarRequestCoro);
        }
    }
}
