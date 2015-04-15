package ps.pdm.hilo.model;

import java.io.Serializable;

/**
 * Created by inalberth on 06/04/15.
 */
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private String endereco;
    private String bairro;

    public Cliente() {

    }

    public Cliente(int id, String nome, String endereco, String bairro) {

        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public String toString() {
        return this.nome;
    }
}
