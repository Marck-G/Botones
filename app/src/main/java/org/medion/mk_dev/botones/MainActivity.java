package org.medion.mk_dev.botones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void act2(View view) {
        Intent intent = new Intent( this , Act2.class );
        startActivity( intent );
    }

    public void act1(View view) {
        Intent intent = new Intent( this , Act1.class );
        startActivity( intent );
    }

    public void act3(View view) {
        Intent intent = new Intent( this , Act3.class );
        startActivity( intent );
    }
}
