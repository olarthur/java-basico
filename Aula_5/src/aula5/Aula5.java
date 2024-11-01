package aula5;

public class Aula5 {

    public static void main(String[] args) {
        Aluno estudante1 = new Aluno("Arthur", "444.444.444-41");
        
        estudante1.setNome("Arthur Oliveira");
        estudante1.av1(7.5);
        estudante1.av2(5.5);
        
        estudante1.exibirNotas();
        //System.out.println(estudante1.getNome());
    }
    
}
