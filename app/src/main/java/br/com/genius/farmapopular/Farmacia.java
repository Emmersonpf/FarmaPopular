package br.com.genius.farmapopular;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

import static java.lang.Thread.sleep;

/**
 * Created by Desenvolvimento on 15/05/2017.
 */

public class Farmacia extends ListActivity {
    ArrayList<Dados> Lista=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        AsyncHttpClient dados = new AsyncHttpClient();
        dados.get("http://sage.saude.gov.br/paineis/farmaciaPopular/lista_farmacia.php?output=json&", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                try {
                    ArrayList<String> ListaLocal=new ArrayList<>();
                    JSONArray jsonArray = response.getJSONArray("resultset");
                    for (int i = 0; i < jsonArray.length(); i++) {
                      Dados d=new Dados();
                        d.setDados(jsonArray.getJSONArray(i).toString());
                        Lista.add(d);
                    }
                    execulte();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void execulte(){
        ArrayList<String> Listatela=new ArrayList<>();
        for (int j=0;j<Lista.size();j++){
            Listatela.add(Lista.get(j).getDados().toString());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Listatela);
        setListAdapter(adapter);
    }

}