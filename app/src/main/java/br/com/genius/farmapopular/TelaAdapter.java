package br.com.genius.farmapopular;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import static br.com.genius.farmapopular.R.id.parent;

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
        TextView nomeFarmacia=(TextView)view.findViewById(R.id.NomeFarmacia);
        TextView estado=(TextView)view.findViewById(R.id.Uf);
        TextView municipio=(TextView)view.findViewById(R.id.Municipio);

        nomeFarmacia.setText(listas.getFarmacia());
        estado.setText(listas.getUF());
        municipio.setText(listas.getMunicipio());

        return view;
    }


}

