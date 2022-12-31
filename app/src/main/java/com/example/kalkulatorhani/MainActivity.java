package com.example.kalkulatorhani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etangka1, etangka2;
    private RadioButton rbttambah, rbtkurang, rbtkali, rbtbagi;
    private TextView tvHasil, hitung;
    private Button bt_hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etangka1 = findViewById(R.id.editText1);
        etangka2 = findViewById(R.id.editText2);
        tvHasil = findViewById(R.id.textViewHasil);
        bt_hitung = findViewById(R.id.button_1);
        rbttambah = findViewById(R.id.Button1);
        rbtkurang = findViewById(R.id.Button2);
        rbtkali = findViewById(R.id.Button3);
        rbtbagi = findViewById(R.id.Button4);

        bt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Angka1 = Double.valueOf(etangka1.getText().toString());
                double Angka2 = Double.valueOf(etangka2.getText().toString());
                double Hasil;

                if (etangka1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Angka 1 masih kosong!", Toast.LENGTH_SHORT).show();
                } else if (etangka2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Angka 2 masih kosong!", Toast.LENGTH_SHORT).show();
                } else {
                    if (rbttambah.isChecked()) {
                        Hasil = Angka1 + Angka2;
                        tvHasil.setText(String.valueOf(Hasil));
                    } else if (rbtkurang.isChecked()) {
                        Hasil = Angka1 - Angka2;
                        tvHasil.setText(String.valueOf(Hasil));
                    } else if (rbtkali.isChecked()) {
                        Hasil = Angka1 * Angka2;
                        tvHasil.setText(String.valueOf(Hasil));
                    } else if (rbtbagi.isChecked()) {
                        Hasil = Angka1 / Angka2;
                        tvHasil.setText(String.valueOf(Hasil));
                    } else {
                        Toast.makeText(MainActivity.this, "Silahkan pilih operator terlebih dahulu!", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}
