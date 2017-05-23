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
        String NumEstado="";
        String text="";
        text=dropdown.getSelectedItem().toString();
        switch (text){
            case "RO":
                NumEstado="11";
                break;
            case "AC":
                NumEstado="12";
                break;
            case "AM":
                NumEstado="13";
                break;
            case "RR":
                NumEstado="14";
                break;
            case "PA":
                NumEstado="15";
                break;
            case "AP":
                NumEstado="16";
                break;
            case "TO":
                NumEstado="17";
                break;
            case "MA":
                NumEstado="21";
                break;
            case "PI":
                NumEstado="22";
                break;
            case "CE":
                NumEstado="23";
                break;
            case "RN":
                NumEstado="24";
                break;
            case "PB":
                NumEstado="25";
                break;
            case "PE":
                NumEstado="26";
                break;
            case "AL":
                NumEstado="27";
                break;
            case "SE":
                NumEstado="28";
                break;
            case "BA":
                NumEstado="29";
                break;
            case "MG":
                NumEstado="31";
                break;
            case "ES":
                NumEstado="32";
                break;
            case "RJ":
                NumEstado="33";
                break;
            case "SP":
                NumEstado="35";
                break;
            case "PR":
                NumEstado="41";
                break;
            case "SC":
                NumEstado="42";
                break;
            case "RS":
                NumEstado="43";
                break;
            case "MS":
                NumEstado="50";
                break;
            case "MT":
                NumEstado="51";
                break;
            case "GO":
                NumEstado="52";
                break;
            case "DF":
                NumEstado="53";
                break;
        }
        Bundle bundle=new Bundle(  );
        bundle.putString("text",NumEstado);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
