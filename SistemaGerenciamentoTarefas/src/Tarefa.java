public class Tarefa {
    
    private int id;
    private String titulo;
    private String descricao;
    private String status;  
    private String prioridade; 
    private Usuario membroDesignado;


    public Tarefa(int id, String titulo, String descricao, String prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "pendente";
        this.prioridade = prioridade;
    }


    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }
    public Usuario getMembroDesignado() { return membroDesignado; }
    public void setMembroDesignado(Usuario membro) { this.membroDesignado = membro; }


    public void atualizarTarefa(String descricao, String status, String prioridade) {
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa [id=" + id + ", titulo=" + titulo + ", status=" + status + ", prioridade=" + prioridade + "]";
    }
}
