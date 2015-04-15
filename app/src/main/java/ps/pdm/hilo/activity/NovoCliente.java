package ps.pdm.hilo.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ps.pdm.hilo.R;
import ps.pdm.hilo.controller.ClienteController;
import ps.pdm.hilo.model.Cliente;

public class NovoCliente extends ActionBarActivity implements View.OnClickListener {

    private EditText txtNome, txtEndereco, txtBairro;
    private Button btIncluir, btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_cliente);

        txtNome = (EditText) findViewById(R.id.txtNome);
        txtEndereco = (EditText) findViewById(R.id.txtEndereco);
        txtBairro = (EditText) findViewById(R.id.txtBairro);

        btIncluir = (Button) findViewById(R.id.btIncluir);
        btLimpar = (Button) findViewById(R.id.btLimpar);

        btIncluir.setOnClickListener(this);
        btLimpar.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_novo_cliente, menu);
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

    private void novoCliente() {

        String nome = txtNome.getText().toString();
        String endereco = txtEndereco.getText().toString();
        String bairro = txtBairro.getText().toString();

        Cliente cliente = new Cliente(ClienteController.getQuantidade()+1, nome, endereco, bairro);


        /*Intent intent = new Intent(this, ListarEntradas.class);
        intent.putExtra("cliente", cliente);
        startActivity(intent);*/

        ClienteController.adicionar(cliente);

        for (Cliente c : ClienteController.obterTodos()) {
            Log.i("INFO", c.getNome());
        }

        finish();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btIncluir: novoCliente();
                break;
            case R.id.btLimpar:
                break;
        }
    }
}