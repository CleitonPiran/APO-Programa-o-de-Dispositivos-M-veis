package br.com.cpelegrin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class SobreActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        // Habilita o botão de voltar na AppBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Trata o botão de voltar
        if (item.getItemId() == android.R.id.home) {
            finish(); // Fecha a Activity e volta para a anterior
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
