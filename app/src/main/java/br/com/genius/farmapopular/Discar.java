package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by I9CenterTechnology on 28/05/2017.
 */

public class Discar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uri = Uri.parse("tel:" + 136);
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}