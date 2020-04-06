package com.marcel.ecuacionescuadraticas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Ecuacion extends AppCompatActivity {

    private EditText va ,vb,vc ,x1,x2;
    private Button btnresultado;
    private Spinner spinner1,spinner2,spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion);
        va=(EditText) findViewById(R.id.a);
        vb=(EditText) findViewById(R.id.b);
        vc=(EditText) findViewById(R.id.c);

        x1=(EditText) findViewById(R.id.x1);
        x2=(EditText) findViewById(R.id.x2);

        btnresultado=(Button) findViewById(R.id.BtnResultado);

        spinner1=(Spinner) findViewById(R.id.sp1);
        spinner2=(Spinner) findViewById(R.id.sp2);
        spinner3=(Spinner) findViewById(R.id.sp3);


        String []opcion1={"+","-"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcion1);
        spinner1.setAdapter(adapter1);

        String []opcion2={"+","-"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcion2);
        spinner2.setAdapter(adapter2);

        String []opcion3={"+","-"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcion3);
        spinner3.setAdapter(adapter3);


     }
    public void operar(View view)
    {

        if (va.getText().toString().isEmpty() || vb.getText().toString().isEmpty() || vc.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Verifique los Campos",Toast.LENGTH_SHORT).show();

        }
        else
        {
            int na = Integer.parseInt(va.getText().toString());
            int nb = Integer.parseInt(vb.getText().toString());
            int nc = Integer.parseInt(vc.getText().toString());



            int operacion1 = calcularSumar(na,nb,nc);

            int operacion2 = calcularResta(na,nb,nc);


            String resultado1=String.valueOf(operacion1);
            x1.setText(resultado1);

            String resultado2=String.valueOf(operacion2);
            x2.setText(resultado2);
        }


    }

    private int calcularResta(int na, int nb, int nc) {

        int resultado=0;

        String selec1=spinner1.getSelectedItem().toString();
        String selec2=spinner2.getSelectedItem().toString();
        String selec3=spinner3.getSelectedItem().toString();

        if (selec1.equals("+") && selec2.equals("+") && selec3.equals("+")) {

            resultado = ((-(nb)-(int) Math.sqrt(Math.pow((nb),2)-(4)*(na)*(nc)))/(2*(na)));
        }
        else if (selec1.equals("+") && selec2.equals("+") && selec3.equals("-"))
        {
            resultado = ((-(nb)-(int) Math.sqrt(Math.pow((nb),2)-(4)*(na)*(-nc)))/(2*(na)));
        }
        else if (selec1.equals("+") && selec2.equals("-") && selec3.equals("-"))
        {
            resultado = ((-(-nb)-(int) Math.sqrt(Math.pow((-nb),2)-(4)*(na)*(-nc)))/(2*(na)));
        }
        else if (selec1.equals("-") && selec2.equals("+") && selec3.equals("+"))
        {
            resultado = ((-(nb)-(int) Math.sqrt(Math.pow((nb),2)-(4)*(-na)*(nc)))/(2*(-na)));
        }
        else if (selec1.equals("-") && selec2.equals("-") && selec3.equals("+"))
        {
            resultado = ((-(-nb)-(int) Math.sqrt(Math.pow((-nb),2)-(4)*(-na)*(nc)))/(2*(-na)));
        }
        else if (selec1.equals("-") && selec2.equals("-") && selec3.equals("-"))
        {
            resultado = ((-(-nb)-(int) Math.sqrt(Math.pow((-nb),2)-(4)*(-na)*(-nc)))/(2*(-na)));
        }
        else if (selec1.equals("+") && selec2.equals("-") && selec3.equals("+"))
        {
            resultado = ((-(-nb)-(int) Math.sqrt(Math.pow((-nb),2)-(4)*(na)*(nc)))/(2*(na)));
        }

        return resultado;
    }

    private int calcularSumar(int na, int nb, int nc) {

        int resultado=0;

        String selec1=spinner1.getSelectedItem().toString();
        String selec2=spinner2.getSelectedItem().toString();
        String selec3=spinner3.getSelectedItem().toString();



        if (selec1.equals("+") && selec2.equals("+") && selec3.equals("+")) {

            resultado = ((-(nb)+(int) Math.sqrt(Math.pow((nb),2)-(4)*(na)*(nc)))/(2*(na)));
        }
        else if (selec1.equals("+") && selec2.equals("+") && selec3.equals("-"))
        {
            resultado = ((-(nb)+(int) Math.sqrt(Math.pow((nb),2)-(4)*(na)*(-nc)))/(2*(na)));
        }
        else if (selec1.equals("+") && selec2.equals("-") && selec3.equals("-"))
        {
            resultado = ((-(-nb)+(int) Math.sqrt(Math.pow((-nb),2)-(4)*(na)*(-nc)))/(2*(na)));
        }
        else if (selec1.equals("-") && selec2.equals("+") && selec3.equals("+"))
        {
            resultado = ((-(nb)+(int) Math.sqrt(Math.pow((nb),2)-(4)*(-na)*(nc)))/(2*(-na)));
        }
        else if (selec1.equals("-") && selec2.equals("-") && selec3.equals("+"))
        {
            resultado = ((-(-nb)+(int) Math.sqrt(Math.pow((-nb),2)-(4)*(-na)*(nc)))/(2*(-na)));
        }
        else if (selec1.equals("-") && selec2.equals("-") && selec3.equals("-"))
        {
            resultado = ((-(-nb)+(int) Math.sqrt(Math.pow((-nb),2)-(4)*(-na)*(-nc)))/(2*(-na)));
        }
        else if (selec1.equals("+") && selec2.equals("-") && selec3.equals("+"))
        {
            resultado = ((-(-nb)+(int) Math.sqrt(Math.pow((-nb),2)-(4)*(na)*(nc)))/(2*(na)));
        }

        return resultado;
    }


}
