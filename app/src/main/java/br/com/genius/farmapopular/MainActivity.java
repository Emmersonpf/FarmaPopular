package br.com.genius.farmapopular;
<<<<<<< HEAD

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
=======
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

>>>>>>> 973c492648bb2d2cb80a0e6b6ddb5d40bf4f9fef

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


    }

    public void onClickDiscar(View v) {

        String numero ="tel:"  + 136;

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(numero)));


    }
<<<<<<< HEAD

    public void farmacia(View v){
        Intent intent =new Intent(this,Farmacia.class);
        startActivity(intent);
    }

}
=======
}
>>>>>>> 973c492648bb2d2cb80a0e6b6ddb5d40bf4f9fef
