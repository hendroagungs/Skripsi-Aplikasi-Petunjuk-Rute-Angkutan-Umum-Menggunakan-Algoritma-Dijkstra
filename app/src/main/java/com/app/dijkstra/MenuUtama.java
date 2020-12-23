package com.app.dijkstra;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static com.google.android.gms.analytics.internal.zzy.c;
import static java.lang.System.exit;

public class MenuUtama extends Activity implements OnClickListener {
    Button cmdRute, cmdAbout,cmdDaftarRute,cmdExit;
    Intent intent = null;
    ProgressDialog progDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        // setTitle("Menu Utama");

        // tombol
        cmdRute = (Button) findViewById(R.id.rute);
        cmdAbout = (Button) findViewById(R.id.about);
        cmdDaftarRute = (Button) findViewById(R.id.daftarrute);
        cmdExit = (Button) findViewById(R.id.exit);

        //setaction listener onclick
        cmdRute.setOnClickListener(this);
        cmdAbout.setOnClickListener(this);
        cmdDaftarRute.setOnClickListener(this);
        cmdExit.setOnClickListener(this);
    }
    //fungsi saat icon di click
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.daftarrute:
                progDialog = ProgressDialog.show(MenuUtama.this, "",
                        "Loading...", true, false);
                startActivity(new Intent(MenuUtama.this, DaftarRute.class));
                finish();
                break;

            case R.id.rute:
                progDialog = ProgressDialog.show(MenuUtama.this, "",
                        "Loading...", true, false);
                startActivity(new Intent(MenuUtama.this, SearchActivity.class));
                finish();
                break;

            case R.id.about:
                progDialog = ProgressDialog.show(MenuUtama.this, "",
                        "Loading...", true, false);
                startActivity(new Intent(MenuUtama.this, About.class));
                finish();
                break;

            case R.id.exit:
                Intent a = new Intent(Intent.ACTION_MAIN);
                a.addCategory(Intent.CATEGORY_HOME);
                a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(a);
                break;
        }
    }


    @Override
    //fungsi saat tombol back di tekan
    public void onBackPressed() {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setMessage("Apakah ingin keluar dari Aplikasi?");
        ad.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                    Intent a = new Intent(Intent.ACTION_MAIN);
                    a.addCategory(Intent.CATEGORY_HOME);
                    a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(a);
            }
        });
        ad.setNegativeButton("Tidak",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        ad.show();
    }
}