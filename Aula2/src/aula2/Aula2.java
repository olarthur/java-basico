package aula2;

import java.util.*;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random gerar = new Random();
        Turma turma = new Turma();
        double ra, av1, av2;

        
        for (int i = 0; i < 10; i++) {
            ra = (gerar.nextInt(1000)) + 240000;
            av1 = gerar.nextInt(11);
            av2 = gerar.nextInt(11);
            turma.adicionarAluno(new Aluno(ra, av1, av2));
        }      
        
        System.out.println("Turma Inicial:");
        turma.exibirTurma();

        Av1_alterada av1Alterada = new Av1_alterada(turma);
        av1Alterada.executar();
        leia.close();
    }
}
