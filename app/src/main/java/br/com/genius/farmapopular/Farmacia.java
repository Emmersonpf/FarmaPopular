package br.com.genius.farmapopular;

import android.app.ListActivity;
import android.net.Uri;
import android.opengl.EGLExt;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.loopj.android.http.AsyncHttpClient;
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
    List Lista;
    String[] items = new String[]{"Clebson"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        AsyncHttpClient dados = new AsyncHttpClient();
        dados.get("http://sage.saude.gov.br/paineis/farmaciaPopular/lista_farmacia.php?output=json&", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                try {
                    JSONArray jsonArray = response.getJSONArray("resultset");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        Lista.add(jsonArray.getJSONObject(i));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Lista);
            setListAdapter(adapter);

    }

}