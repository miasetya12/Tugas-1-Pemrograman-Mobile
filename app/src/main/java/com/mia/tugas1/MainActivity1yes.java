package com.mia.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1yes extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity, btnMovePP, btnMoveL, btnMoveP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1yes);
        btnMoveActivity = findViewById(R.id.btn_move_segitiga);
        btnMovePP = findViewById(R.id.btn_move_persegiPanjang);
        btnMoveL = findViewById(R.id.btn_move_lingkaran);
        btnMoveP = findViewById(R.id.btn_move_persegi);
        btnMovePP.setOnClickListener(this);
        btnMoveActivity.setOnClickListener(this);
        btnMoveL.setOnClickListener(this);
        btnMoveP.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_move_segitiga) {
            Intent moveIntent = new Intent(MainActivity1yes.this, MainActivity.class);
            startActivity(moveIntent);
        }
        if (view.getId() == R.id.btn_move_persegiPanjang) {
            Intent moveIntent = new Intent(MainActivity1yes.this, PersegiPanjangAct.class);
            startActivity(moveIntent);
        }

        if (view.getId() == R.id.btn_move_lingkaran) {
            Intent moveIntent = new Intent(MainActivity1yes.this, LingkaranAct.class);
            startActivity(moveIntent);
        }
        if (view.getId() == R.id.btn_move_persegi) {
            Intent moveIntent = new Intent(MainActivity1yes.this, PersegiAct.class);
            startActivity(moveIntent);
        }
    }

}