package aula.ada.api;

public class TarefaNaoEncontradaException extends RuntimeException {
    public TarefaNaoEncontradaException(long id) { super("Tarefa não encontrada com ID: " + id); }
}
