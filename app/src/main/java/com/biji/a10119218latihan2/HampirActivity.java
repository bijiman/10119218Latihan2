package com.biji.a10119218latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

/*
24 April 2022
Latihan 2
10119218
Joyson Sitorus
IF6
 */

public class HampirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hampir);

        MaterialButton btnVerify = findViewById(R.id.buttonverify);
        btnVerify.setOnClickListener(view -> startActivity(new Intent(this,VerifyActivity.class)));
    }
}