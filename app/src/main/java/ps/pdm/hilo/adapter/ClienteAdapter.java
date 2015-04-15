package ps.pdm.hilo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import ps.pdm.hilo.R;
import ps.pdm.hilo.model.Cliente;

/**
 * Created by inalberth on 14/04/15.
 */
public class ClienteAdapter extends ArrayAdapter<Cliente> {

    private List<Cliente> objects;

    public ClienteAdapter(Context context, int resource, List<Cliente> objects) {
        super(context, resource, objects);
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(R.layout.cliente_list_item, null);
        }

        Cliente cliente = objects.get(position);

        if (cliente != null) {

            TextView lbNome = (TextView) view.findViewById(R.id.lbNome);
            TextView txtNome = (TextView) view.findViewById(R.id.txtListNome);
            TextView lbEndereco = (TextView) view.findViewById(R.id.lbEndereco);
            TextView txtEndereco = (TextView) view.findViewById(R.id.txtListEndereco);
            TextView lbBairro = (TextView) view.findViewById(R.id.lbBairro);
            TextView txtBairro = (TextView) view.findViewById(R.id.txtBairro);

            if (lbNome != null)
                lbNome.setText("Nome: ");

            if (txtNome != null)
                txtNome.setText(cliente.getNome());

            if (lbEndereco != null)
                lbEndereco.setText("Endereço: ");

            if (txtEndereco != null)
                txtEndereco.setText(cliente.getEndereco());

            if (lbBairro != null)
                lbBairro.setText("Bairro: ");

            if (txtBairro != null)
                txtBairro.setText(cliente.getBairro());
        }

        return view;
    }
}
