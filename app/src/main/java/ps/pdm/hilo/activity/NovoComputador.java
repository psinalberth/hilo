package ps.pdm.hilo.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import ps.pdm.hilo.R;

public class NovoComputador extends ActionBarActivity {

    private EditText txtDescricao;
    private Spinner cbMarca;
    private Button btIncluir, btLimpar;
    private RadioButton rbNovo, rbUsado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_computador);

        txtDescricao = (EditText) findViewById(R.id.txtDescricao);

        cbMarca = (Spinner) findViewById(R.id.cbMarca);

        rbNovo = (RadioButton) findViewById(R.id.rbNovo);
        rbUsado = (RadioButton) findViewById(R.id.rbUsado);

        btIncluir = (Button) findViewById(R.id.btIncluir);
        btLimpar = (Button) findViewById(R.id.btLimpar);
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
}