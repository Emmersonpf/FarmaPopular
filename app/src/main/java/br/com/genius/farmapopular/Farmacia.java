package br.com.genius.farmapopular;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.opengl.EGLExt;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

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
        String Url="http://sage.saude.gov.br/paineis/farmaciaPopular/lista_farmacia.php?output=json&";
        final AsyncHttpClient dados = new AsyncHttpClient();
        dados.get(Farmacia.this,Url,new AsyncHttpResponseHandler(){

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response=new String(responseBody);

                gson=new Gson();
                j=gson.fromJson(response,jsonFormat.class);
                for(int i=0;i<j.getResultset().size();i++) {
                    Dados d=new Dados();
                    d.setEndereco(j.getResultset().get(i).get(3).toString());
                    d.setEstado(j.getResultset().get(i).get(1).toString());
                    d.setCidade(j.getResultset().get(i).get(2).toString());
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


}