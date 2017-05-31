package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by I9CenterTechnology on 28/05/2017.
 */

public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Farmacia+Popular&z=20");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}