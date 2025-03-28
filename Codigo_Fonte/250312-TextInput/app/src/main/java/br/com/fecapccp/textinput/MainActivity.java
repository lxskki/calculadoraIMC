package br.com.fecapccp.textinput;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculadora = findViewById(R.id.btnCalculadora);
        btnCalculadora.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculoIMCActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Limpa qualquer stack de activities anteriores
        getIntent().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }
}