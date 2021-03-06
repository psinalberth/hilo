package ps.pdm.hilo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import ps.pdm.hilo.R;
import ps.pdm.hilo.model.Entrada;

/**
 * Created by inalberth on 14/04/15.
 */
public class EntradaAdapter extends ArrayAdapter<Entrada> {

    private List<Entrada> entradas;

    public EntradaAdapter(Context context, int resource, List<Entrada> objects) {
        super(context, resource, objects);
        this.entradas = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(R.layout.entrada_list_item, null);
        }

        Entrada entrada = entradas.get(position);

        if (entrada != null) {

            TextView lbCliente = (TextView) view.findViewById(R.id.lbCliente);
            TextView txtListCliente = (TextView) view.findViewById(R.id.txtListCliente);
            TextView lbComputador = (TextView) view.findViewById(R.id.lbComputador);
            TextView txtListComputador = (TextView) view.findViewById(R.id.txtListComputador);
            TextView lbEstadoComputador = (TextView) view.findViewById(R.id.lbEstadoComputador);
            TextView txtListEstadoComputador = (TextView) view.findViewById(R.id.txtListEstadoComputador);
            TextView lbDescricaoProblema = (TextView) view.findViewById(R.id.lbDescricaoProblema);
            TextView txtListDescricaoProblema = (TextView) view.findViewById(R.id.txtListDescricaoProblema);
            TextView lbLimparComputador = (TextView) view.findViewById(R.id.lbLimparComputador);
            TextView txtLimparComputador = (TextView) view.findViewById(R.id.txtLimparComputador);
            TextView lbEntregaDomicilio = (TextView) view.findViewById(R.id.lbEntregaDomicilio);
            TextView txtEntregaDomicilio = (TextView) view.findViewById(R.id.txtEntregaDomicilio);
            TextView lbEmbalarEntrega = (TextView) view.findViewById(R.id.lbEmbalarEntrega);
            TextView txtEmbalarEntrega = (TextView) view.findViewById(R.id.txtEmbalarEntrega);

            if (lbCliente != null)
                lbCliente.setText("Cliente: ");

            if (txtListCliente != null)
                txtListCliente.setText(entrada.getCliente().toString());

            if (lbComputador != null)
                lbComputador.setText("Computador: ");

            if (txtListComputador != null)
                txtListComputador.setText(entrada.getComputador().toString());

            if (lbEstadoComputador != null)
                lbEstadoComputador.setText("Estado do Equipamento:");

            if (txtListEstadoComputador != null)
                txtListEstadoComputador.setText(entrada.getComputador().getEstado());

            if (lbDescricaoProblema != null)
                lbDescricaoProblema.setText("Problema: ");

            if (txtListDescricaoProblema != null)
                txtListDescricaoProblema.setText(entrada.getDescricaoProblema());

            if (lbLimparComputador != null)
                lbLimparComputador.setText("Limpeza: ");

            if (txtLimparComputador != null) {

                if (entrada.isLimparComputador()) {
                    txtLimparComputador.setText("Sim");
                } else {
                    txtLimparComputador.setText("Não");
                }
            }

            if (lbEntregaDomicilio != null)
                lbEntregaDomicilio.setText("Entrega em Domicílio: ");

            if (txtEntregaDomicilio != null) {

                if (entrada.isEntregaDomicilio()) {
                    txtEntregaDomicilio.setText("Sim");
                } else {
                    txtEntregaDomicilio.setText("Não");
                }
            }

            if (lbEmbalarEntrega != null)
                lbEmbalarEntrega.setText("Embalar para Entrega: ");

            if (txtEmbalarEntrega != null) {

                if (entrada.isEmbalarComputador()) {
                    txtEmbalarEntrega.setText("Sim");
                } else {
                    txtEmbalarEntrega.setText("Não");
                }
            }
        }

        return view;
    }
}
