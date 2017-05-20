package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }


    public void disc(View view) {
        Uri uri = Uri.parse("tel:" + 136);

        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);

    }

    public void OnClickMapa(View v){
        Intent z=new Intent(this,MapsActivity.class);
        startActivity(z);

    }


    public void OnClickAjuda(View v){
        String url = "https://www.youtube.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

   public void farmacia(View v){
       Intent i=new Intent(this,EstadoBusca.class);
       startActivity(i);
   }

   public void BtAquirir(View v){
       Intent i = new Intent(this,Adquirir.class);
       startActivity(i);
   }
}


