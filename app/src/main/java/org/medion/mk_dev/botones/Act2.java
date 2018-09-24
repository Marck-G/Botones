package org.medion.mk_dev.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Act2 extends AppCompatActivity {
    private final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    private EditText numero;
    private EditText letra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        numero = ( EditText ) findViewById( R.id.dni );
        letra = ( EditText ) findViewById( R.id.dni_char );
    }

    public void validarDNI(View view) {
        try {
            long number = Long.parseLong( numero.getText().toString() );
            char character = letra.getText().toString().toUpperCase().charAt( 0 );
            if ( character == LETRAS.charAt( ( int ) ( number % 23 ) ) ){
                Toast.makeText( getApplicationContext(),"DNI Correcto.",Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText( getApplicationContext(),"DNI Invalido.",Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException | StringIndexOutOfBoundsException e){
            Toast.makeText( getApplicationContext(),"Introduce el número del DNI y la letra",Toast.LENGTH_LONG).show();
        }


    }
}
