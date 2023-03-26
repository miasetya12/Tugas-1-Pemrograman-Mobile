package com.mia.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiAct extends AppCompatActivity implements View.OnClickListener {
    EditText edtSisi;
    Button btnHitung, btnKembali;
    TextView tv_hasil_luas, tv_hasil_kll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        edtSisi = (EditText) findViewById(R.id.edt_sisi);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        tv_hasil_luas = (TextView) findViewById(R.id.tv_hasil_luas);
        tv_hasil_kll = (TextView) findViewById(R.id.tv_hasil_kll);
        btnKembali = findViewById(R.id.btn_kembali);
        btnKembali.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, hasil_luas, hasil_kll;
                bilangan1=Double.valueOf(edtSisi.getText().toString().trim());

                hasil_luas = bilangan1*bilangan1;
                String hasilLuas = String.valueOf(hasil_luas);
                tv_hasil_luas.setText(hasilLuas);

                hasil_kll = 4*bilangan1;
                String hasilKll = String.valueOf(hasil_kll);
                tv_hasil_kll.setText(hasilKll);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_kembali) {
            finish();
        }
    }
}