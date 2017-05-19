package br.com.genius.farmapopular;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.permission;
import static android.R.attr.phoneNumber;

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


   public void farmacia(View v){
       Intent i=new Intent(this,EstadoBusca.class);
       startActivity(i);
   }
}


