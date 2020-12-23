package com.app.dijkstra;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.app.dijkstra.R.id.rute;
import static com.app.dijkstra.R.id.rute02;
import static com.google.android.gms.analytics.internal.zzy.i;
import static com.google.android.gms.analytics.internal.zzy.r;
import static com.google.android.gms.analytics.internal.zzy.s;
import static com.google.android.gms.analytics.internal.zzy.v;

public class DaftarRute extends AppCompatActivity {

    Intent intent,intent1 = null;
    //ImageButton myImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_rute);

        /*myImageButton = (ImageButton)findViewById(R.id.rute01);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadnewActivity = new Intent(DaftarRute.this, DaftarRuteGambar.class);
                startActivity(intentLoadnewActivity);
            }
        });*/
    }

    public void rutegambar1 (View view){
        intent = new Intent(DaftarRute.this, RuteGambar1.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        intent = new Intent(DaftarRute.this, MenuUtama.class);
        startActivity(intent);
    }



}
