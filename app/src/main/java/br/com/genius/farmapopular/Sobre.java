package br.com.genius.farmapopular;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/**
 * Created by I9CenterTechnology on 28/05/2017.
 */

public class Sobre extends Activity {


    public void OnClickAjuda(View v){
        String url = "https://www.youtube.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
