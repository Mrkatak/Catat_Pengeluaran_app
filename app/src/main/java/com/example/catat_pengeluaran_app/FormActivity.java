package com.example.catat_pengeluaran_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class FormActivity extends AppCompatActivity {

    //Deklarasi variable
    Button btn_simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btn_simpan = findViewById(R.id.btn_simpan);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Membuat alert dialog
                AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(FormActivity.this);

                // Membuat judul alert dialog
                alertdialogBuilder.setTitle("Konfirmasi");

                // Membuat pesan alert dialog
                alertdialogBuilder.setMessage("Anda yakin ingin menyimpan?")
                        .setIcon(R.drawable.baseline_add_moderator_24)
                        .setCancelable(false)

                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(FormActivity.this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                dialogInterface.cancel();
                            }
                        });
                // membuat dialog
                AlertDialog alertDialog = alertdialogBuilder.create();

                //menampilkan dialog
                alertDialog.show();
            }
        });



    }
}