package org.medion.mk_dev.botones;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Act4 extends AppCompatActivity {
    private SeekBar termostato;
    private ToggleButton persianas;
    private Switch luces;
    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);

        termostato  = ( SeekBar )  findViewById( R.id.termostato );
        persianas   = ( ToggleButton )  findViewById( R.id.persianas );
        luces       = ( Switch ) findViewById( R.id.luces );
        temp        = ( TextView )  findViewById( R.id.temp );

        termostato.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               temp.setText( String.valueOf( progress + "ºC" ) );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText( getApplicationContext(), "Se ha establecido la temperatura", Toast.LENGTH_SHORT ).show();
            }
        });
        persianas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( ( ( ToggleButton ) v ).isChecked() ){
                   Toast.makeText( getApplicationContext(), "Subiendo las persianas", Toast.LENGTH_SHORT ).show();
               } else{
                   Toast.makeText( getApplicationContext(), "Bajando las persianas", Toast.LENGTH_SHORT ).show();
               }
            }
        });

        luces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( ( ( Switch ) v ).isChecked() ){
                    Toast.makeText( getApplicationContext(), "Luces encendidas", Toast.LENGTH_SHORT ).show();
                }else{
                    Toast.makeText( getApplicationContext(), "Luces apagadas", Toast.LENGTH_SHORT ).show();
                }
            }
        });



    }
}
