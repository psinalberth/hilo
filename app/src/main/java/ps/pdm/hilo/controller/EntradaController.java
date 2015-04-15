package ps.pdm.hilo.controller;

import java.util.ArrayList;
import java.util.List;

import ps.pdm.hilo.interfaces.DataAccessObject;
import ps.pdm.hilo.model.Entrada;

/**
 * Created by inalberth on 14/04/15.
 */
public class EntradaController {

    private static List<Entrada> entradas = new ArrayList<Entrada>();
    private static ClienteController cliente;
    private static ComputadorController computador;

    public static void init() {

        final Entrada initEntradas[] = {

            new Entrada(1, cliente.obter(2), computador.obter(3), "Beeps consecutivos ao ligar", true, false, true)
        };

        for (Entrada e : initEntradas) {
            entradas.add(e);
        }

    }

    public void adicionar(Entrada modelo) {

        entradas.add(modelo);
    }

    public Entrada obter() {
        return null;
    }

    public void alterar(Entrada modelo) {

    }

    public void remover(Entrada modelo) {

    }

    public static List<Entrada> obterTodos() {
        return entradas;
    }
}