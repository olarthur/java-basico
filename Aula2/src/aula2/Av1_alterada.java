package aula2;

import java.util.Scanner;

public  class Av1_alterada {
    private Turma turma; 

    public Av1_alterada(Turma turma) {
        this.turma = turma; 
    }

    public void executar() {
        Scanner leia = new Scanner(System.in);
        
        while (true) {
            System.out.print("Deseja alterar uma nota AV1? (1 para sim, 0 para não): ");
            int opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o programa.");
                break; 
            } else if (opcao == 1) {
                System.out.print("Digite o RA do aluno: ");
                double ra = leia.nextDouble();

                Aluno aluno = turma.buscarAlunoPorRA(ra);
                if (aluno != null) {
                    double notaAtual = aluno.getAv1();
                    System.out.printf("Nota atual da AV1: %.2f\n", notaAtual);

                    System.out.print("Digite a nova nota para AV1: ");
                    double novaNotaAv1 = leia.nextDouble();
                    aluno.setAv1(novaNotaAv1);

                    System.out.printf("Nota da AV1 alterada de %.2f para %.2f com sucesso!\n", notaAtual, novaNotaAv1);
                    System.out.println("Turma atualizada:");
                    turma.exibirTurma(); 
                } else {
                    System.out.println("Aluno não encontrado.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

