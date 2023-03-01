package com.example.tarea2pm1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.metrics.EditingSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_nombre, tv_apellido, tv_edad, tv_correo;
    EditText pt_nombre, pt_apellido, pt_edad, pt_correo;
    Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        tv_apellido = (TextView) findViewById(R.id.tv_nombre);
        tv_edad = (TextView) findViewById(R.id.tv_edad);
        tv_correo = (TextView) findViewById(R.id.tv_correo);

        pt_nombre = (EditText) findViewById(R.id.pt_nombre);
        pt_apellido = (EditText) findViewById(R.id.pt_apellido);
        pt_edad = (EditText) findViewById(R.id.pt_edad);
        pt_correo = (EditText) findViewById(R.id.pt_correo);

        btn_submit =(Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityResultados.class);
                String nombre = pt_nombre.getText().toString();
                String apellido = pt_apellido.getText().toString();
                String edad = pt_edad.getText().toString();
                String correo = pt_correo.getText().toString();;
                //Create the bundle
                Bundle bundle = new Bundle();

                bundle.putString("Nombre", nombre);
                bundle.putString("Apellido", apellido);
                bundle.putString("Edad", edad);
                bundle.putString("Correo", correo);

                //Add the bundle to the intent
                i.putExtras(bundle);


                //Fire the second activity
                startActivity(i);
            }

        });
    }
}