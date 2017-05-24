package br.com.genius.farmapopular;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.opengl.EGLExt;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;

import cz.msebera.android.httpclient.Header;

import static java.lang.Thread.sleep;

/**
 * Created by Desenvolvimento on 15/05/2017.
 */

public class Farmacia extends ListActivity {
    final ArrayList<jsonFormat.MetadataBean> ListaLocal=new ArrayList<>();
    final ArrayList<Dados> s=new ArrayList<Dados>();
    jsonFormat j;
    Gson gson;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String txt = bundle.getString("text");
        String Url="http://sage.saude.gov.br/paineis/aqt/lista_farmacia.php?ufs="+txt+"&output=json&";
        final AsyncHttpClient dados = new AsyncHttpClient();
        dados.get(Farmacia.this,Url,new AsyncHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response=new String(responseBody);
                gson=new Gson();
                j=gson.fromJson(response,jsonFormat.class);
                for(int i=0;i<j.getResultset().size();i++) {
                    Dados d=new Dados();
                        d.setCodIbge(j.getResultset().get(i).get(0));
                        d.setUF(j.getResultset().get(i).get(1));
                        d.setMunicipio(j.getResultset().get(i).get(2));
                        d.setFarmacia(j.getResultset().get(i).get(3));
                        d.setEndereco(j.getResultset().get(i).get(4));
                        d.setBairro(j.getResultset().get(i).get(5));
                        d.setCep(j.getResultset().get(i).get(6));
                        d.setDDD(j.getResultset().get(i).get(7));
                        d.setTelefone(j.getResultset().get(i).get(8));
                        d.setEmail(j.getResultset().get(i).get(9));
                        d.setCnpjFarmacia(j.getResultset().get(i).get(10));
                        d.setCnpjMatriz(j.getResultset().get(i).get(11));
                        d.setAno(j.getResultset().get(i).get(12));
                        d.setMes(j.getResultset().get(i).get(13));
                        s.add(d);
                }
                chamarTela();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
    private void chamarTela() {
        TelaAdapter adapter = new TelaAdapter(s, this);
        setListAdapter(adapter);
    }
    @Override
    public void onListItemClick(ListView l,View v,int position,long id){
        Intent intent=new Intent(Farmacia.this,MostrarDados.class);
        Bundle bundle=new Bundle(  );
        bundle.putString("nome",s.get(position).getFarmacia());
        bundle.putString("endereco",s.get(position).getEndereco());
        bundle.putString("telefone",s.get(position).getTelefone());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}