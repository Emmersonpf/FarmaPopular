package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void OnClickFarmacia(View v){
        Intent i=new Intent(this,EstadoBusca.class);
        startActivity(i);
    }

    public void OnClickMapa(View v){
        Intent i=new Intent(this,Mapa.class);
        startActivity(i);
    }

    public void OnClickBtMedic(View v){
        Intent i = new Intent(this,Medic_Activity.class);
        Toast.makeText(this,"Carregando...",Toast.LENGTH_LONG).show();
        startActivity(i);
    }

    public void OnClickDiscar(View v){
        Intent i=new Intent(this,Discar.class);
        startActivity(i);
    }

    public void OnClickBtAquirir(View v){
        Intent i = new Intent(this,Adquirir.class);
        startActivity(i);
    }


    public void OnClickAjuda(View v){
        Intent i=new Intent(this,Sobre.class);
        startActivity(i);
    }

}


