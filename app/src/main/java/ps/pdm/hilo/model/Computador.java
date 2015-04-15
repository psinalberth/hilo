package ps.pdm.hilo.model;

/**
 * Created by inalberth on 06/04/15.
 */
public class Computador {

    private int id;
    private String descricao;
    private String marca;
    private String estado;

    public Computador() {

    }

    public Computador(int id, String descricao, String marca, String estado) {

        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String toString() {
        return this.descricao + " " + marca;
    }
}