package ps.pdm.hilo.model;

import java.util.Date;

/**
 * Created by inalberth on 06/04/15.
 */
public class Entrada {

    private int id;
    private Cliente cliente;
    private Computador computador;
    private String descricaoProblema;
    private boolean limparComputador;
    private boolean entregaDomicilio;
    private boolean embalarComputador;

    public Entrada(int id, Cliente cliente, Computador computador, String descricaoProblema,
                   boolean limparComputador, boolean entregaDomicilio,
                   boolean embalarComputador) {

        this.id = id;
        this.cliente = cliente;
        this.computador = computador;
        this.descricaoProblema = descricaoProblema;
        this.limparComputador = limparComputador;
        this.entregaDomicilio = entregaDomicilio;
        this.embalarComputador = embalarComputador;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setLimparComputador(boolean limparComputador) {
        this.limparComputador = limparComputador;
    }

    public boolean isLimparComputador() {
        return limparComputador;
    }

    public void setEntregaDomicilio(boolean entregaDomicilio) {
        this.entregaDomicilio = entregaDomicilio;
    }

    public boolean isEntregaDomicilio() {
        return entregaDomicilio;
    }

    public void setEmbalarComputador(boolean embalarComputador) {
        this.embalarComputador = embalarComputador;
    }

    public boolean isEmbalarComputador() {
        return embalarComputador;
    }
}