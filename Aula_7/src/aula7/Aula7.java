package aula7;

public class Aula7 {

    public static void main(String[] args) {
        //Instanciar classe
        
        Aluno aluno1 = new Aluno("Arthur", "471-520-444-41", "08/01/2004");
        
        System.out.println(aluno1.exibir_cadastro());
        
        Professor p1 = new Professor("Daniel", "477-777-777-47", "10/10/1910");
        p1.setSalario(500);
        System.out.println(p1.exibir_cadastro());
    }
    
}