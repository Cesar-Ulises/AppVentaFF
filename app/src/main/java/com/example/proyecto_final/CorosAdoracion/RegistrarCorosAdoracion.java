package com.example.proyecto_final.CorosAdoracion;

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
import com.example.proyecto_final.CorosAlegres.RegisterRequestCoroAle;
import com.example.proyecto_final.CorosAlegres.RegistrarCorosAlegres;
import com.example.proyecto_final.R;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistrarCorosAdoracion extends AppCompatActivity implements View.OnClickListener {
    EditText etnombre, etautor, etletra;
    Button btnR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_coros_adoracion);

        etnombre = findViewById(R.id.etNombreCoroAdo);
        etautor = findViewById(R.id.etAutorCoroAdo);
        etletra = findViewById(R.id.etLetraCoroAdo);
        btnR = findViewById(R.id.btnGuardarCoroAdo);

        btnR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
