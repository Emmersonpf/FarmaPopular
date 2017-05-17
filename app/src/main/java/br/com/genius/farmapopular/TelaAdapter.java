package br.com.genius.farmapopular;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Desenvolvimento on 17/05/2017.
 */

public class TelaAdapter extends BaseAdapter {
    private final List<Dados> lista;
    private final Activity act;

    public TelaAdapter(List<Dados> lista, Activity act) {
        this.lista = lista;
        this.act=act;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(R.layout.lista_farmacia_cadastrada, parent, false);
        Dados listas= lista.get(position);
        TextView endereco=(TextView)view.findViewById(R.id.Endereco);
        TextView uf=(TextView)view.findViewById(R.id.uf);
        TextView cidade=(TextView)view.findViewById(R.id.Cidade);

        endereco.setText("RUA: "+listas.getEndereco());
        uf.setText("ESTADO:"+listas.getEstado());
        cidade.setText("CIDADE: "+listas.getCidade());
        return view;
    }
}
