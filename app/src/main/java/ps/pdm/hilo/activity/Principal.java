package ps.pdm.hilo.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import ps.pdm.hilo.R;
import ps.pdm.hilo.controller.ClienteController;


public class Principal extends ActionBarActivity implements View.OnClickListener {

    private Button btNovoCliente, btNovoComputador, btNovaEntrada, btListarEntradas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btNovoCliente = (Button) findViewById(R.id.btNovoCliente);
        btNovoComputador = (Button) findViewById(R.id.btNovoComputador);
        btNovaEntrada = (Button) findViewById(R.id.btNovaEntrada);
        btListarEntradas = (Button) findViewById(R.id.btListarEntradas);

        btNovoCliente.setOnClickListener(this);
        btNovoComputador.setOnClickListener(this);
        btNovaEntrada.setOnClickListener(this);
        btListarEntradas.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()) {

            case R.id.btNovoCliente:
                intent = new Intent(this, NovoCliente.class);
                break;

            case R.id.btNovoComputador:
                intent = new Intent(this, NovoComputador.class);
                break;

            case R.id.btNovaEntrada:
                intent = new Intent(this, NovaEntrada.class);
                break;

            case R.id.btListarEntradas:
                intent = new Intent(this, ListarEntradas.class);
                break;
        }

        startActivity(intent);
    }
}