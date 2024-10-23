package aula2;

import java.util.*;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random gerar = new Random();
        Turma turma = new Turma();
        double ra, av1, av2;

        // Gerar dados dos alunos
        for (int i = 0; i < 10; i++) {
            ra = (gerar.nextInt(1000)) + 240000;
            av1 = gerar.nextInt(11);
            av2 = gerar.nextInt(11);
            turma.adicionarAluno(new Aluno(ra, av1, av2));
        }      
        
        // EXIBIR TURMA
        System.out.println("Turma Inicial:");
        turma.exibirTurma();

        // Criar uma instância da classe Av1_alterada e executar
        Av1_alterada av1Alterada = new Av1_alterada(turma);
        av1Alterada.executar();

        leia.close(); // Fecha o Scanner
    }
}