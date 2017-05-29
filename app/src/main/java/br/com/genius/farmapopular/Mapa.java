package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/**
 * Created by I9CenterTechnology on 28/05/2017.
 */

public class Mapa extends MainActivity {

    public void OnClickMapa(View v){

        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Farmacia+Popular&z=20");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }


}