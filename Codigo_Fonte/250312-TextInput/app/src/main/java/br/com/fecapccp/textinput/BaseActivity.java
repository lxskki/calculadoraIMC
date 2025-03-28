package br.com.fecapccp.textinput;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    protected void setupViews() {
        double peso = getIntent().getDoubleExtra("peso", 0);
        double altura = getIntent().getDoubleExtra("altura", 0);
        double imc = getIntent().getDoubleExtra("imc", 0);
        String classificacao = getIntent().getStringExtra("classificacao");

        TextView textImc = findViewById(R.id.textImc);
        TextView textClassificacao = findViewById(R.id.textClassificacao);
        TextView textMensagem = findViewById(R.id.textMensagem);

        textImc.setText(getString(R.string.label_imc, imc));
        textClassificacao.setText(getString(R.string.label_classificacao, classificacao));
    }

    protected void setupButtons() {
        Button btnFechar = findViewById(R.id.btnFechar);
        Button btnVoltar = findViewById(R.id.btnVoltar);

        btnFechar.setOnClickListener(v -> finish());
        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}
