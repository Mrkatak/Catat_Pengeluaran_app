package com.example.catat_pengeluaran_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    // Deklarasi variable

    TextView tv_Username;
    EditText et_Inputpengeluaran;
    Button btn_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Insisialisasi variable
        tv_Username = findViewById(R.id.tv_Username);
        et_Inputpengeluaran = findViewById(R.id.et_Inputpengeluaran);
        btn_Submit = findViewById(R.id.btn_Submit);

        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Membuat alert dialog
                AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(MainActivity.this);

                // Membuat judul alert dialog
                alertdialogBuilder.setTitle("Konfirmasi");

                // Membuat pesan alert dialog
                alertdialogBuilder.setMessage("Anda yakin ingin menyimpan?")
                        .setIcon(R.drawable.baseline_add_moderator_24)
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String name = tv_Username.getText().toString();
                                String pengeluaran = et_Inputpengeluaran.getText().toString();

                                // Cek Input jumlah harus di isi
                                if(pengeluaran.isEmpty()){
                                    Toast.makeText(MainActivity.this, "Jumlah harus di isi", Toast.LENGTH_SHORT).show();
                                }else {
                                    Toast.makeText(MainActivity.this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                                }

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