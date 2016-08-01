package br.eaj.ufrn.tads.e_agrarius;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("aula03", "onCreate()");

    }

    public Context getContext(){
        return this;
    }

    public void clicaBotao (View v){

        TextView texto = (TextView) findViewById(R.id.editText);
        String resultado = texto.getText().toString();

        //String t = ((TextView)findViewById(R.id.editText)).getText().toString();

        Intent i = new Intent(getContext(), Tela2.class);
        Bundle param = new Bundle();

        param.putString("palavra", resultado);

        i.putExtras(param);

        startActivity(i);
    }

    @Override
    protected void onStart() {
       super.onStart();
        Log.i("aula03", "onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("aula03", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("aula03", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("aula03", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("aula03", "onDestroy()");
    }
}
