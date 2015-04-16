package ps.pdm.hilo.activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import ps.pdm.hilo.R;
import ps.pdm.hilo.adapter.EntradaAdapter;
import ps.pdm.hilo.controller.EntradaController;

public class ListarEntradas extends ListActivity {

    private EntradaAdapter entradaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_entradas);

        entradaAdapter = new EntradaAdapter(this, R.layout.entrada_list_item, EntradaController.obterTodos());
        setListAdapter(entradaAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listar_entradas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        int itemPosition = position;

        String item = (String) l.getItemAtPosition(position);
    }
}
