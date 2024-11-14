import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamentoTarefas {
    private List<Tarefa> tarefas;
    private List<Usuario> usuarios;

    public SistemaGerenciamentoTarefas() {
        tarefas = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Métodos de gerenciamento de tarefas
    public void criarTarefa(int id, String titulo, String descricao, String prioridade, Usuario membro) {
        Tarefa tarefa = new Tarefa(id, titulo, descricao, prioridade);
        tarefa.setMembroDesignado(membro);
        tarefas.add(tarefa);
    }

    public void atualizarTarefa(int id, String descricao, String status, String prioridade) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.atualizarTarefa(descricao, status, prioridade);
            }
        }
    }

    public void excluirTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    public List<Tarefa> visualizarTarefas() {
        return tarefas;
    }

    public List<Tarefa> organizarPorPrioridade(String prioridade) {
        List<Tarefa> tarefasPrioridade = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getPrioridade().equalsIgnoreCase(prioridade)) {
                tarefasPrioridade.add(tarefa);
            }
        }
        return tarefasPrioridade;
    }

    // Métodos de gerenciamento de usuários
    public void adicionarUsuario(int id, String nome, String papel) {
        Usuario usuario = new Usuario(id, nome, papel);
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}

