package br.com.fecapccp.textinput;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculoIMCActivity extends AppCompatActivity {

    private EditText editPeso, editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnLimpar = findViewById(R.id.btnLimpar);
        Button btnFechar = findViewById(R.id.btnFechar);

        btnCalcular.setOnClickListener(v -> calcularIMC());
        btnLimpar.setOnClickListener(v -> limparCampos());
        btnFechar.setOnClickListener(v -> finish());
    }

    private void calcularIMC() {
        String strPeso = editPeso.getText().toString();
        String strAltura = editAltura.getText().toString();

        if (strPeso.isEmpty() || strAltura.isEmpty()) {
            Toast.makeText(this, R.string.preencha_campos, Toast.LENGTH_SHORT).show();
            return;
        }

        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAltura);
        double imc = peso / (altura * altura);

        Intent intent;
        String classificacao;

        if (imc < 18.5) {
            intent = new Intent(this, AbaixoDoPesoActivity.class);
            classificacao = getString(R.string.abaixo_peso);
        } else if (imc < 25) {
            intent = new Intent(this, PesoNormalActivity.class);
            classificacao = getString(R.string.peso_normal);
        } else if (imc < 30) {
            intent = new Intent(this, SobrepesoActivity.class);
            classificacao = getString(R.string.sobrepeso);
        } else if (imc < 35) {
            intent = new Intent(this, Obesidade1Activity.class);
            classificacao = getString(R.string.obesidade_1);
        } else if (imc < 40) {
            intent = new Intent(this, Obesidade2Activity.class);
            classificacao = getString(R.string.obesidade_2);
        } else {
            intent = new Intent(this, Obesidade3Activity.class);
            classificacao = getString(R.string.obesidade_3);
        }

        intent.putExtra("peso", peso);
        intent.putExtra("altura", altura);
        intent.putExtra("imc", imc);
        intent.putExtra("classificacao", classificacao);
        startActivity(intent);
    }

    private void limparCampos() {
        editPeso.setText("");
        editAltura.setText("");
        editPeso.requestFocus();
    }
}