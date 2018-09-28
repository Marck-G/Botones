package org.medion.mk_dev.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Act3 extends AppCompatActivity implements View.OnClickListener{

    private ImageView img;
    private Button btnG;
    private Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        img = ( ImageView ) findViewById( R.id.img );
        btnG = (Button) findViewById( R.id.btnG );
        btnB = ( Button ) findViewById( R.id.btnB );
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageDrawable( getDrawable( R.mipmap.ic_bing ) );
            }
        });
        btnG.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        img.setImageDrawable( getDrawable( R.mipmap.ic_google ) );
    }

    public void yahoo(View view) {
        img.setImageDrawable( getDrawable( R.mipmap.ic_yahoo ) );
    }
}
