package br.com.genius.farmapopular;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Desenvolvimento on 24/05/2017.
 */

public class AdapterMedicamento extends BaseAdapter {
    private final List<DadosMedicamentos> lista;
    private final Activity act;

    public AdapterMedicamento(List<DadosMedicamentos> lista, Activity act) {
        this.lista = lista;
        this.act = act;
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
                .inflate(R.layout.lista_medicamentos, parent, false);
        DadosMedicamentos listas= lista.get(position);
        TextView medicamento=(TextView)view.findViewById(R.id.Medicamento);
        TextView apresentacao=(TextView)view.findViewById(R.id.apresentacao);
        medicamento.setText(listas.getMedicamento());
        apresentacao.setText(listas.getApresentação());
        return view;
    }
}
