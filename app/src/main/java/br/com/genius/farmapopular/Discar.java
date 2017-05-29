package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/**
 * Created by I9CenterTechnology on 28/05/2017.
 */

public class Discar extends MainActivity {

    public void OnClickDiscar(View view) {
        Uri uri = Uri.parse("tel:" + 136);
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);

    }
}