package com.example.tarea2pm1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultados extends AppCompatActivity {

    private TextView tv_resultado_nombre,tv_resultado_apellido,tv_resultado_edad, tv_resultado_correo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        setContentView(R.layout.activity_resultados);
        //Get the bundle
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("Nombre");
        String apellido = extras.getString("Apellido");
        String edad = extras.getString("Edad");
        String correo = extras.getString("Correo");

        tv_resultado_nombre = findViewById(R.id.tv_resultado_nombre);
        tv_resultado_apellido =findViewById(R.id.tv_resultado_apellido);
        tv_resultado_edad = findViewById(R.id.tv_resultado_edad);
        tv_resultado_correo = findViewById(R.id.tv_resultado_correo);

        tv_resultado_nombre.setText("Nombre: " + nombre);
        tv_resultado_apellido.setText("Apellido: " + apellido);
        tv_resultado_edad.setText("Edad: " + edad);
        tv_resultado_correo.setText("Correo: " + correo);








    }
}