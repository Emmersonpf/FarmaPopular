package br.com.genius.farmapopular;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Desenvolvimento on 19/05/2017.
 */

public class EstadoBusca extends Activity{
    AutoCompleteTextView auto;
    String[]uf=new String[]{"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ",
                            "RN","RS","RO","RR","SC","SP","SE","TO"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.select_estado);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, uf);
        dropdown.setAdapter(adapter1);
    }

    public void Buscar(View v){
        Intent intent=new Intent(EstadoBusca.this,Farmacia.class);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String text="";
        text=dropdown.getSelectedItem().toString();
        Bundle bundle=new Bundle(  );
        bundle.putString("text",text);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
