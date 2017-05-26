package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

    public void disc(View view) {
        Uri uri = Uri.parse("tel:" + 136);
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);

    }

    public void OnClickMapa(View v){
        /*
        =======================Antigo===========================================
        Intent z=new Intent(this,MapsActivity.class);
        startActivity(z);
        ==========================Fim===========================================
        */
        //==========================Novo=========================================
        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Farmacia+Popular&z=16");
        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");
        // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);
        //==========================Fim==========================================

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
    public void BtMedic(View v){
        Intent i = new Intent(this,Medic_Activity.class);
        startActivity(i);
    }

}


