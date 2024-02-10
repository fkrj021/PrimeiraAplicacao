package com.example.primeiraaplicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPrimeiroNome;
    Button bttApresentar;
    Button btnFechar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrimeiroNome = findViewById(R.id.edtPrimeiroNome);
        bttApresentar = findViewById(R.id.bttApresentar);
        tvResult = findViewById(R.id.tvResult);
        btnFechar = findViewById(R.id.btnFechar);

        bttApresentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("O texto digitado foi: \n " + edtPrimeiroNome.getText());
            }
        });

        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}