package ps.pdm.hilo.activity;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import ps.pdm.hilo.R;
import ps.pdm.hilo.adapter.EntradaAdapter;
import ps.pdm.hilo.controller.EntradaController;

public class ListarEntradas extends ActionBarActivity {

    private ListView listView;
    private EntradaAdapter entradaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_entradas);

        listView = (ListView) findViewById(android.R.id.list);

        entradaAdapter = new EntradaAdapter(this, R.layout.entrada_list_item, EntradaController.obterTodos());
        listView.setAdapter(entradaAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listar_entradas, menu);
        return super.onCreateOptionsMenu(menu);
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
}
