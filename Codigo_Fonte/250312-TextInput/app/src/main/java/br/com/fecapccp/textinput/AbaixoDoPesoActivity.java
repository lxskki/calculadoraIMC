package br.com.fecapccp.textinput;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AbaixoDoPesoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaixo_peso);

        double peso = getIntent().getDoubleExtra("peso", 0);
        double altura = getIntent().getDoubleExtra("altura", 0);
        double imc = getIntent().getDoubleExtra("imc", 0);
        String classificacao = getIntent().getStringExtra("classificacao");

        ImageView imageFeedback = findViewById(R.id.imageFeedback);
        TextView textImc = findViewById(R.id.textImc);
        TextView textClassificacao = findViewById(R.id.textClassificacao);
        TextView textMensagem = findViewById(R.id.textMensagem);
        Button btnFechar = findViewById(R.id.btnFechar);
        Button btnVoltar = findViewById(R.id.btnVoltar);

        textImc.setText(getString(R.string.label_imc, imc));
        textClassificacao.setText(getString(R.string.label_classificacao, classificacao));
        textMensagem.setText(R.string.mensagem_abaixo_peso);

        btnFechar.setOnClickListener(v -> finish());
        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}
