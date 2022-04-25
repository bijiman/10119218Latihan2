package com.biji.a10119218latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

/*
24 April 2022
Latihan 2
10119218
Joyson Sitorus
IF6
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialButton btnRegis = findViewById(R.id.buttonregister);
        btnRegis.setOnClickListener(view -> startActivity(new Intent(this,HampirActivity.class)));
    }
}