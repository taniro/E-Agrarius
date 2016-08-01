package br.eaj.ufrn.tads.e_agrarius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Bundle param = getIntent().getExtras();
        String nome = param.getString("palavra");

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(nome);
    }
}
