package com.biji.a10119218latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


/*
Joyson Sitorus
10119218
IF6
 */
 */
 */
*/
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bruh = findViewById(R.id.regis);
        bruh.setOnClickListener(view -> startActivity(new Intent(this,RegisterActivity.class)));
    }
}