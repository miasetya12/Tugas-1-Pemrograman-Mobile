package com.mia.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtAlas, edtTinggi;
    Button btnHitung, btnKembali;
    TextView tv_hasil_luas, tv_hasil_kll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlas = (EditText) findViewById(R.id.edt_alas);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        tv_hasil_luas = (TextView) findViewById(R.id.tv_hasil_luas);
        tv_hasil_kll = (TextView) findViewById(R.id.tv_hasil_kll);
        btnKembali = findViewById(R.id.btn_kembali);
        btnKembali.setOnClickListener(this);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil_luas, pinggir, hasil_kll;
                bilangan1=Double.valueOf(edtAlas.getText().toString().trim());
                bilangan2=Double.valueOf(edtTinggi.getText().toString().trim());

                hasil_luas = (bilangan1/2)*bilangan2;
                String hasilLuas = String.valueOf(hasil_luas);
                tv_hasil_luas.setText(hasilLuas);

                pinggir = Math.sqrt(Math.pow(bilangan1,2)+Math.pow(bilangan2,2));
                hasil_kll = bilangan1+bilangan2+pinggir;
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