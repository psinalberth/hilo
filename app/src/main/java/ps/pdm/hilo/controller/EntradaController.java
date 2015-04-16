package ps.pdm.hilo.controller;

import java.util.ArrayList;
import java.util.List;

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

            new Entrada(1, cliente.obter(2), computador.obter(3), "Beeps consecutivos ao ligar", true, false, true),
            new Entrada(2, cliente.obter(1), computador.obter(1), "Despejo de memória constante", false, false, false),
            new Entrada(3, cliente.obter(0), computador.obter(2), "Placa de som danificada", true, true, true)
        };

        for (Entrada e : initEntradas) {
            entradas.add(e);
        }

    }

    public static void adicionar(Entrada modelo) {

        entradas.add(modelo);
    }

    public static Entrada obter() {
        return null;
    }

    public static void alterar(Entrada modelo) {

    }

    public static void remover(Entrada modelo) {

    }

    public static List<Entrada> obterTodos() {
        return entradas;
    }

    public static int getQuantidade() {
        return entradas.size();
    }
}