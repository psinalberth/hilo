package ps.pdm.hilo.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import ps.pdm.hilo.R;
import ps.pdm.hilo.controller.ClienteController;
import ps.pdm.hilo.controller.ComputadorController;
import ps.pdm.hilo.controller.EntradaController;
import ps.pdm.hilo.model.Cliente;
import ps.pdm.hilo.model.Computador;
import ps.pdm.hilo.model.Entrada;

public class NovaEntrada extends ActionBarActivity implements View.OnClickListener {

    private EditText txtProblema, txtDataEntrada, txtDataSaida, txtCliente, txtComputador;
    private Spinner cbCliente, cbComputador;
    private CheckBox checkEntrega, checkLimpeza, checkEmbalagem;
    private Button btIncluir, btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_entrada);

        cbCliente = (Spinner) findViewById(R.id.cbCliente);
        cbComputador = (Spinner) findViewById(R.id.cbComputador);

        txtProblema = (EditText) findViewById(R.id.txtProblema);

        checkEntrega = (CheckBox) findViewById(R.id.checkEntrega);
        checkLimpeza = (CheckBox) findViewById(R.id.checkLimpeza);
        checkEmbalagem = (CheckBox) findViewById(R.id.checkEmbalagem);

        btIncluir = (Button) findViewById(R.id.btIncluir);
        btLimpar = (Button) findViewById(R.id.btLimpar);

        btIncluir.setOnClickListener(this);
        btLimpar.setOnClickListener(this);

        ArrayAdapter clienteAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ClienteController.obterTodos());
        cbCliente.setAdapter(clienteAdapter);

        ArrayAdapter computadorAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ComputadorController.obterTodos());
        cbComputador.setAdapter(computadorAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nova_entrada, menu);
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

    private void novaEntrada() {

        Cliente cliente = (Cliente) cbCliente.getSelectedItem();
        Computador computador = (Computador) cbComputador.getSelectedItem();
        String descricaoProblema = txtProblema.getText().toString();
        boolean limparComputador = checkLimpeza.isChecked();
        boolean entregaDomicilio = checkEntrega.isChecked();
        boolean embalarEntrega = checkEntrega.isChecked();

        Entrada entrada = new Entrada(EntradaController.getQuantidade()+1, cliente, computador, descricaoProblema, limparComputador, entregaDomicilio, embalarEntrega);
        EntradaController.adicionar(entrada);

        finish();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btIncluir: novaEntrada();
                break;

            case R.id.btLimpar:
                break;
        }
    }
}