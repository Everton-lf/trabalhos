package aula.ada.api;


import aula.ada.dto.TarefaRequest;
import aula.ada.dto.TarefaResponse;
import java.util.List;

public interface TarefaApi {
    List<TarefaResponse> listar();
    TarefaResponse buscar(long id);
    TarefaResponse criar(TarefaRequest request);
    TarefaResponse atualizar(long id, TarefaRequest request);
    void excluir(long id);
}
