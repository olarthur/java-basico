package aula5;

public class Aluno implements Aula{
    private String nome;
    private int idade;
    private String ra;
    private String cpf;
    private String curso;
    private double notaAv1;
    private double notaAv2;
    
    
    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = "000.000.000-00";
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaAv1() {
        return notaAv1;
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public double getNotaAv2() {
        return notaAv2;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    @Override
    public void av1 (double a) {
        if (a >= 0 && a <= 10.0) {
           this.notaAv1 = a;
        } else {
            this.notaAv1 = 0;
        }
        
        if (a >= 5.6 && a <= 5.9) {
            this.notaAv1 = 6.0;
        }
    }

    @Override
    public void av2((double a) {
        if (a >= 0 && a <= 10.0) {
           this.notaAv2 = a;
        } else {
            this.notaAv2 = 0;
        }
    
        if (a >= 5.6 && a <= 5.9) {
            this.notaAv2 = 6.0;
        }
    }

    @Override
    public void entradaCatraca() {
        
    }

    public void exibirNotas() {
        System.out.println("Notas do aluno: " + this.getNome());
        System.out.println("Nota Av1 = " + this.notaAv1);
        System.out.println("Nota Av2 = " + this.notaAv2);

    }
}
