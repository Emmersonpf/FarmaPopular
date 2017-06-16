package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by I9CenterTechnology on 28/05/2017.
 */

public class Sobre extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

    }

    public void voltar(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void btnSite(View v){
        String url = "http://ideagenius.com.br/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}

