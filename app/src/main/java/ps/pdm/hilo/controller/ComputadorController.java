package ps.pdm.hilo.controller;

import java.util.ArrayList;
import java.util.List;

import ps.pdm.hilo.model.Computador;

/**
 * Created by inalberth on 15/04/15.
 */
public class ComputadorController {

    private static List<Computador> computadores = new ArrayList<Computador>();

    public static void init() {

        final Computador initComputadores[] = {

                new Computador(1, "Notebook 8GB 500GB", "Asus", "Novo"),
                new Computador(2, "Computador 4GB 320GB", "Lenovo", "Usado"),
                new Computador(3, "Notebook 16GB 1TB", "Sony", "Novo"),
                new Computador(4, "Computador 8GB 750GB", "Dell", "Novo")
        };

        for (Computador c : initComputadores) {
            computadores.add(c);
        }
    }

    public static void adicionar(Computador computador) {
        computadores.add(computador);
    }

    public static Computador obter(int id) {
        return computadores.get(id);
    }

    public static List<Computador> obterTodos() {
        return computadores;
    }

    public static void alterar(Computador computador) {

    }

    public static void remover(Computador computador) {
        computadores.remove(computador);
    }

    public static int getQuantidade() {
        return computadores.size();
    }
}
