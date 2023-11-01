package com.itsoeh.ebarrera.evaluacionae;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Registrar extends AppCompatActivity {
    private Button btnBackLog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        btnBackLog = findViewById(R.id.registro_btn_back);
        btnBackLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicBack();
            }
        });
    }

    private void clicBack() {
        Intent brinco = new Intent(this, Login.class);
        startActivity(brinco);
    }
}
