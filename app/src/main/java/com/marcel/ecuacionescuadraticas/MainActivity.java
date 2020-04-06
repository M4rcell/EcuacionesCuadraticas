package com.marcel.ecuacionescuadraticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         boton =(Button) findViewById(R.id.button);

         boton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent ecuacion = new Intent(getApplicationContext(), Ecuacion.class);
                 startActivity(ecuacion);

             }
         });

    }
}
