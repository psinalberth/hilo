package ps.pdm.hilo.controller;

import java.util.List;

import ps.pdm.hilo.interfaces.DataAccessObject;
import ps.pdm.hilo.model.Entrada;

/**
 * Created by inalberth on 14/04/15.
 */
public class EntradaController implements DataAccessObject<Entrada> {

    private List<Entrada> entradas;

    public EntradaController() {
        init();
    }

    private void init() {


    }

    @Override
    public void adicionar(Entrada modelo) {

        entradas.add(modelo);
    }

    @Override
    public Entrada obter() {
        return null;
    }

    @Override
    public void alterar(Entrada modelo) {

    }

    @Override
    public void remover(Entrada modelo) {

    }

    @Override
    public List<Entrada> obterTodos() {
        return null;
    }
}