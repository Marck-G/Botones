package org.medion.mk_dev.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act1 extends AppCompatActivity {

    private EditText tNum1;
    private EditText tNum2;
    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        tNum1 = ( EditText ) findViewById( R.id.num1 );
        tNum2 = ( EditText ) findViewById( R.id.num2 );
        resul = ( TextView ) findViewById( R.id.resultado );
    }

    public void action(View view) {
        int num1 = Integer.parseInt( tNum1.getText().toString() );
        int num2 = Integer.parseInt( tNum2.getText().toString() );
        int res = 0;
        switch ( view.getId() ){
            case R.id.mas:
                res = num1 + num2;
                break;
            case R.id.menos:
                res = ( int ) Math.abs( num1 - num2 );
                break;
            case R.id.produc:
                res = num1 * num2;
                break;
            case R.id.div:
                try {
                    res = num1 / num2;
                } catch ( ArithmeticException e){
                    Toast.makeText( getApplicationContext(), "División entre 0!", Toast.LENGTH_LONG).show();
                }
                break;
        }
        resul.setText("Resultado: " + res );

    }
}
