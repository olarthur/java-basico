public class Usuario {
    
    private int id;
    private String nome;
    private String papel;

    public Usuario(int id, String nome, String papel) {
        this.id = id;
        this.nome = nome;
        this.papel = papel;
    }


    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getPapel() { return papel; }
    public void setPapel(String papel) { this.papel = papel; }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", papel=" + papel + "]";
    }
}
