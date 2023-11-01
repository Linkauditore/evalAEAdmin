package com.itsoeh.ebarrera.evaluacionae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button btnEntrada, btnRegistro,btnOlvidarcontra;
    private EditText txtUsuario, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnEntrada = findViewById(R.id.login_btn_entrar);
        btnRegistro = findViewById(R.id.login_btn_registrar);
        btnOlvidarcontra = findViewById(R.id.login_btn_forgetPassword);
        txtUsuario = findViewById(R.id.login_txt_correo);
        txtPassword = findViewById(R.id.login_txt_contraseña);
        btnEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicEntrar();
            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicRegistro();
            }
        });
        btnOlvidarcontra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicOlvideContra();
            }
        });
    }

    private void clicOlvideContra() {
        Intent brinco = new Intent(this,Recuperarcontra.class);
        startActivity(brinco);
    }


    private void clicRegistro() {
        Intent brinco = new Intent(this, Registrar.class);
        startActivity(brinco);
    }


    private void clicEntrar() {
        String correo = txtUsuario.getText().toString();
        String contraseña = txtPassword.getText().toString();
        if(correo.equals("20011316@itsoeh.edu.mx") || contraseña.equals("12345")) {
            Intent brinco = new Intent(this, MainActivity.class);
            startActivity(brinco);
            Toast.makeText(Login.this, "Te has loggeado exitosamente", Toast.LENGTH_SHORT).show();
        }else{
            AlertDialog.Builder aviso = new AlertDialog.Builder(this);
            aviso.setTitle("Error al ingresar")
                    .setMessage("El usuario o contraseña son incorrectos")
                    .setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();
        }
    }
}