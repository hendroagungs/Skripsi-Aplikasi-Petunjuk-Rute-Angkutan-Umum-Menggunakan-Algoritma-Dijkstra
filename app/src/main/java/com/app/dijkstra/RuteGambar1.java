package com.app.dijkstra;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by hendroagungs on 11/12/2018.
 */

public class RuteGambar1 extends AppCompatActivity {
    Intent intent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rute);

    }

    @Override
    public void onBackPressed() {
        intent = new Intent(RuteGambar1.this, DaftarRute.class);
        startActivity(intent);
    }
}
