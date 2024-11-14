public class Main {
    public static void main(String[] args) {
        GerenciamentoTarefas sistema = new GerenciamentoTarefas();

        // Criação de usuários
        Usuario usuario1 = new Usuario(1, "Alice", "Developer");
        Usuario usuario2 = new Usuario(2, "Bob", "Scrum Master");

        sistema.adicionarUsuario(usuario1.getId(), usuario1.getNome(), usuario1.getPapel());
        sistema.adicionarUsuario(usuario2.getId(), usuario2.getNome(), usuario2.getPapel());

        // Criação de tarefas
        sistema.criarTarefa(1, "Implementar Tela de Criação", "Criar tela para adicionar tarefas", "alta", usuario1);
        sistema.criarTarefa(2, "Configurar Banco de Dados", "Configurar banco para persistir dados", "média", usuario2);

        // Visualização de tarefas
        for (Tarefa tarefa : sistema.visualizarTarefas()) {
            System.out.println(tarefa);
        }

        // Atualizar tarefa
        sistema.atualizarTarefa(1, "Criar tela de criação e edição", "em progresso", "alta");

        // Visualizar tarefas organizadas por prioridade
        for (Tarefa tarefa : sistema.organizarPorPrioridade("alta")) {
            System.out.println(tarefa);
        }
    }
}
