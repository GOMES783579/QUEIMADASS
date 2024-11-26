package com.example.denunciadequeimadas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaLogin extends AppCompatActivity {

    private TextView text_tela_cadrastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        text_tela_cadrastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaLogin.this,FormCadrastro.class);
                startActivity(intent);
            }
        });
    }

    private void  IniciarComponentes(){
        text_tela_cadrastro = findViewById(R.id.text_tela_cadrastro);
    }
}