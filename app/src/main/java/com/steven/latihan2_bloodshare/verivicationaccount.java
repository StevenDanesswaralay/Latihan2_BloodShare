package com.steven.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/* Tanggal Pengerjaan : 29 April 2021
 * Nim                 : 10118078
 * Nama                : Steven Danesswaralay
 * Kelas               : IF-2
 */
public class verivicationaccount extends AppCompatActivity{
    Button resn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verivicationaccount);
        Intent intent = getIntent();

        resn = findViewById(R.id.resn);

        resn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(verivicationaccount.this,home.class));
            }
        });
    }
}