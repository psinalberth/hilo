package ps.pdm.hilo.controller;

import java.util.ArrayList;
import java.util.List;

import ps.pdm.hilo.interfaces.DataAccessObject;
import ps.pdm.hilo.model.Cliente;

/**
 * Created by inalberth on 14/04/15.
 */
public class ClienteController {

    private static List<Cliente> clientes = new ArrayList<Cliente>();

    private static Cliente cliente;

    public ClienteController(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public static void init() {

        cliente = new Cliente(getQuantidade()+1, "Ramon Bezerra", "Av. Getúlio Vargas 04", "Monte Castelo");
        clientes.add(cliente);

        cliente = new Cliente(getQuantidade()+1, "Manolo Cabrero", "Rua Projetada 13", "Sacavém");
        clientes.add(cliente);

        cliente = new Cliente(getQuantidade()+1, "Helena Rodrigues", "Av. Dois 45", "Centro");
        clientes.add(cliente);
    }

    public static void adicionar(Cliente modelo) {
        clientes.add(modelo);
    }

    public static Cliente obter(int id) {
        return clientes.get(id);
    }

    public static void alterar(Cliente modelo) {

    }

    public static void remover(Cliente modelo) {
        clientes.remove(modelo);
    }

    public static List<Cliente> obterTodos() {
        return clientes;
    }

    public static int getQuantidade() {
        return clientes.size();
    }
}