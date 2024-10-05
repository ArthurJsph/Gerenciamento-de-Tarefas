
package mytasks.taskManager;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa salvarTarefa(Tarefa tarefa) {
        return (Tarefa) tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTodasTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa obterTarefaPorId(Long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.orElse(null);
    }

    public void deletarTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }



    
}
