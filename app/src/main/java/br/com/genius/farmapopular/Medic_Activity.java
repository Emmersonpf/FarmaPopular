package br.com.genius.farmapopular;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.MessageFormat;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class Medic_Activity extends ListActivity {
    Gson gson;
    jsonMedicamentos j;
    ArrayList<DadosMedicamentos> dadosMedicamentoses=new ArrayList<DadosMedicamentos>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String Url="https://api.myjson.com/bins/qi8f9";
        final AsyncHttpClient dados = new AsyncHttpClient();
        dados.get(Medic_Activity.this,Url,new AsyncHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String response=new String(responseBody);
                gson=new Gson();
                j=gson.fromJson(response,jsonMedicamentos.class);
                for(int i=0;i<j.getTable_data().size();i++) {
                    DadosMedicamentos d=new DadosMedicamentos();
                    d.setItem(j.getTable_data().get(i).getKey_0());
                    d.setIndicacao(j.getTable_data().get(i).getKey_1());
                    d.setFarmaco(j.getTable_data().get(i).getKey_2());
                    d.setMedicamento( j.getTable_data().get(i).getKey_3());
                    d.setLaboratorio( j.getTable_data().get(i).getKey_4());
                    d.setApresentação( j.getTable_data().get(i).getKey_5());
                    d.setQuantidade( j.getTable_data().get(i).getKey_6());
                    dadosMedicamentoses.add(d);
                }
                chamarTela();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
    private void chamarTela() {
        AdapterMedicamento adapter = new AdapterMedicamento(dadosMedicamentoses, this);
        setListAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão
                startActivity(new Intent(this, MainActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;


    }
    @Override
    public void onBackPressed(){ //Botão BACK padrão
        startActivity(new Intent(this, MainActivity.class));
        finishAffinity();
        return;
    }

}
