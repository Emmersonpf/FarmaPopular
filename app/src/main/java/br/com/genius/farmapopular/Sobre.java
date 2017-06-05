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
    public void btnA(View v){
        String url = "https://www.linkedin.com/in/clebson-ferreira-4a7996a7/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void btnB(View v){
        String url = "https://www.linkedin.com/in/emmerson-ferreira-05818686/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void btnC(View v){
        String url = "https://www.facebook.com/enagiodepaula";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void btnD(View v){
        String url = "https://www.linkedin.com/in/josuel-rodrigues-319906107/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void btnE(View v){
        String url = "https://www.linkedin.com/in/luiz-henrique-23666849/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}


        /*String url = "https://www.youtube.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);*/
