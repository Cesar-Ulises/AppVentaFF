package com.example.proyecto_final;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import com.example.proyecto_final.Alabanzas.RegistrarAlabanzas;
import com.example.proyecto_final.CorosAdoracion.RegistrarCorosAdoracion;
import com.example.proyecto_final.CorosAlegres.RegistrarCorosAlegres;

public class MainActivity extends AppCompatActivity {
    final Context context = this;


    AlertDialog.Builder dialogo;


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            new android.app.AlertDialog.Builder(this)
                    .setIcon(R.drawable.warning)
                    .setTitle("Warning")
                    .setMessage("¿Realmente desea salir?")
                    .setNegativeButton(android.R.string.cancel, null)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.finishAffinity();
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
            Intent intent = new Intent(this, RegistrarCorosAlegres.class);
            startActivity(intent);
            //se retorna true porque el metodo espera un valor booleano
            return true;
        }if (id == R.id.mRegCoAdora) {
            Intent intent = new Intent(this, RegistrarCorosAdoracion.class);
            startActivity(intent);
            //se retorna true porque el metodo espera un valor booleano
            return true;
        }
        //Acerca de..
        if (id == R.id.mAcerca) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    context);
            // Establecer el título
            alertDialogBuilder.setTitle("Desarrollado por: ");
            // Establecer mensaje de diálogo
            alertDialogBuilder
                    .setMessage("- César Alvarenga \n" +
                            "\n - Alberto Castro \n" +
                            "\n - Flor Alvarez \n" +
                            "\n - Oscar Cortez \n")
                    .setCancelable(false)
                    .setNegativeButton("Aceptar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // Si presiona que Aceptar se cerrara el mensaje de dialogo
                            dialog.cancel();
                        }
                    });
            // Crear mensaje AlertDialog
            AlertDialog alertDialog = alertDialogBuilder.create();
            // Mostrar alert
            alertDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }
}
