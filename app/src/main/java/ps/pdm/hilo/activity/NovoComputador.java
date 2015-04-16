package ps.pdm.hilo.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import ps.pdm.hilo.R;
import ps.pdm.hilo.controller.ComputadorController;
import ps.pdm.hilo.model.Computador;
import ps.pdm.hilo.util.HiloUtils;

public class NovoComputador extends ActionBarActivity implements View.OnClickListener {

    private EditText txtDescricao;
    private Spinner cbMarca;
    private Button btIncluir, btLimpar;
    private RadioGroup rgEstadoComputador;
    private RadioButton rbEstado;

    private ViewGroup viewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_computador);

        txtDescricao = (EditText) findViewById(R.id.txtDescricao);

        cbMarca = (Spinner) findViewById(R.id.cbMarca);

        rgEstadoComputador = (RadioGroup) findViewById(R.id.rgEstadoComputador);

        btIncluir = (Button) findViewById(R.id.btIncluir);
        btLimpar = (Button) findViewById(R.id.btLimpar);

        viewGroup = (ViewGroup) findViewById(R.id.layoutNovoComputador);

        btIncluir.setOnClickListener(this);
        btLimpar.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_novo_computador, menu);
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

    private void novoComputador() {

        int index = rgEstadoComputador.getCheckedRadioButtonId();

        rbEstado = (RadioButton) findViewById(index);

        String descricao = txtDescricao.getText().toString();
        String marca = cbMarca.getSelectedItem().toString();
        String estado = rbEstado.getText().toString();

        if (HiloUtils.validarCampos(viewGroup)) {

            Computador computador = new Computador(ComputadorController.getQuantidade() + 1, descricao, marca, estado);
            ComputadorController.adicionar(computador);

            finish();

        } else {

            Toast.makeText(this, "Existem campos em branco. Por favor, tente novamente", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btIncluir: novoComputador();
                break;
            case R.id.btLimpar: HiloUtils.limparCampos(viewGroup);
                break;
        }
    }
}