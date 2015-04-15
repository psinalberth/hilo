package ps.pdm.hilo.interfaces;

import java.util.List;

/**
 * Created by inalberth on 14/04/15.
 */
public interface DataAccessObject<T> {

    public void adicionar(T modelo);

    public T obter();

    public void alterar(T modelo);

    public void remover(T modelo);

    public List<T> obterTodos();
}
