package ps.pdm.hilo.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import ps.pdm.hilo.R;

public class NovaEntrada extends ActionBarActivity {

    private EditText txtProblema, txtDataEntrada, txtDataSaida, txtCliente, txtComputador;
    private CheckBox checkEntrega, checkLimpeza, checkEmbalagem;
    private Button btIncluir, btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_entrada);

        txtCliente = (EditText) findViewById(R.id.txtCliente);
        txtComputador = (EditText) findViewById(R.id.txtEquipamento);

        txtProblema = (EditText) findViewById(R.id.txtProblema);
        txtDataEntrada = (EditText) findViewById(R.id.txtDataEntrada);
        txtDataSaida = (EditText) findViewById(R.id.txtDataSaida);

        checkEntrega = (CheckBox) findViewById(R.id.checkEntrega);
        checkLimpeza = (CheckBox) findViewById(R.id.checkLimpeza);
        checkEmbalagem = (CheckBox) findViewById(R.id.checkEmbalagem);

        btIncluir = (Button) findViewById(R.id.btIncluir);
        btLimpar = (Button) findViewById(R.id.btLimpar);
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
}