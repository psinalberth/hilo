package ps.pdm.hilo.activity;

import java.util.Locale;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import ps.pdm.hilo.R;
import ps.pdm.hilo.adapter.HiloFragmentAdapter;


public class ListarTudo extends FragmentActivity implements ActionBar.TabListener {

    private ViewPager listarTudoPager;
    private ActionBar actionBar;
    private HiloFragmentAdapter fragmentAdapter;
    private static final String[] tabs = {"Clientes", "Computadores", "Entradas"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_listar_tudo);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
