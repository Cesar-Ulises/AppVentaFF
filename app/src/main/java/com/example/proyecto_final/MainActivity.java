package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.proyecto_final.Alabanzas.RegistrarAlabanzas;
import com.example.proyecto_final.CorosAdoracion.RegistrarCorosAdoracion;
import com.example.proyecto_final.CorosAlegres.RegistrarCorosAlegres_Class;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para que se integre el menú a la interfaz
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //Si toca una opción del menú iniciará la activity que le corresponde
        if (id == R.id.mRegAlabanzas) {
            Intent intent = new Intent(this, RegistrarAlabanzas.class);
            startActivity(intent);
            return true;
        }if (id == R.id.mRegCoAlegres) {
            //Intent sirve para lanzar otra actividad
            Intent intent = new Intent(this, RegistrarCorosAlegres_Class.class);
            startActivity(intent);
            //se retorna true porque el metodo espera un valor booleano
            return true;
        }if (id == R.id.mRegCoAdora) {
            Intent intent = new Intent(this, RegistrarCorosAdoracion.class);
            startActivity(intent);
            //se retorna true porque el metodo espera un valor booleano
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
