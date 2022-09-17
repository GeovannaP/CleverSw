package com.example.aplicativo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class TelaLogin extends AppCompatActivity {
    private TextView text_FormLogin;
    private EditText edit_email, edit_senha;
    private Button bt_entrar;
    String [] mensagens = {"Preencha todos os campos obrigatórios", "Login efetuado com sucesso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin);
        Objects.requireNonNull(getSupportActionBar()).hide();

        IniciarComponentes();

        text_FormLogin.setOnClickListener(v -> {

            Intent intent = new Intent (TelaLogin.this,TelaCadastro.class);
            startActivity(intent);

        });

        bt_entrar.setOnClickListener(v -> {
            String email= edit_email.getText().toString();
            String senha = edit_senha.getText().toString();


            if(email.isEmpty() || senha.isEmpty()){
                Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                snackbar.setBackgroundTint(Color.WHITE);
                snackbar.setTextColor(Color.BLACK);
                snackbar.show();

            }else{
                AutenticarUsuario();
            }
        });
    }
    private void AutenticarUsuario(){


    }




    private void IniciarComponentes(){
        text_FormLogin = findViewById(R.id.text_tela_cadastro);
        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        bt_entrar = findViewById(R.id.bt_cadastrar);

    }
}