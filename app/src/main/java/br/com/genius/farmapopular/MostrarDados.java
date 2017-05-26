package br.com.genius.farmapopular;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Desenvolvimento on 23/05/2017.
 */

public class MostrarDados extends AppCompatActivity {
    String Numeros=new String();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.mostrardados);
        TextView nomeview=(TextView)findViewById( R.id.nome);
        TextView enderecoview=(TextView)findViewById( R.id.endereco);
        TextView telefoneview=(TextView)findViewById( R.id.telefone);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String nome = bundle.getString("nome");
        final String endereco = bundle.getString("endereco");
        final String telefone = bundle.getString("telefone");
        nomeview.setText(nome);
        enderecoview.setText( endereco);
        telefoneview.setText( telefone );
        Numeros=bundle.getString("telefone").toString();
    }
    public void Ligar(View v){
        Uri uri = Uri.parse("tel:" + Numeros);
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);
    }
    public void voltar(View v){
        Intent i=new Intent(this,EstadoBusca.class);
        startActivity(i);
    }
}
