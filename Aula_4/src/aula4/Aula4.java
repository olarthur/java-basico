package aula4;

import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int escolha;
        
        do {
            System.out.printf("\n\n--------------------\n");
            System.out.println("\t .. Menu de exemplos: ..|\n");
            System.out.println("\tOpcao 1: Exemplo de notas.\n");
            System.out.println("\tOpcao 2: Exemplo de repetição.\n");
            System.out.println("\tOpcao 0: Sair do sistema.\n");
            System.out.println("\nEscolha uma opcao: ");
            escolha = leia.nextInt();  
            
            switch (escolha) {
                case 1: 
                    notas();
                    break;
                case 2: 
                    repeticao();
                    break;
                case 0: 
                    sair();
                    break;
                default: 
                    System.out.println("Opcao invalida\n"); 
            }
            
        } while (escolha != 0);
        
        System.out.println("\nObrigado por utilizar nosso sistema!\n");
        leia.close(); // Fechar o scanner
    }
    
    public static void notas() {
        Scanner leia = new Scanner(System.in);
       
        float av1, av2, av3, media;
       
        System.out.println("Informe a nota Av1: ");
        av1 = leia.nextFloat();
        System.out.println("Informe a nota Av2: ");
        av2 = leia.nextFloat();
        System.out.println("Informe a nota Av3: ");
        av3 = leia.nextFloat();
       
        media = valorMedia(av1, av2, av3);
       
        System.out.printf("A média = %.2f\n", media);
       
        int media_menu = (int) media;
       
        switch (media_menu) {
            case 10: 
                System.out.println("Parabéns, nota MÁXIMA!"); 
                break;
            case 9: 
                System.out.println("Ótimo, quase nota MÁXIMA!"); 
                break;
            case 8: 
                System.out.println("Ótimo, grande nota"); 
                break;
            case 7: 
                System.out.println("Muito bem, podemos melhorar."); 
                break;
            case 6: 
                System.out.println("Aprovado"); 
                break;
            default: 
                System.out.println("Aluno Reprovado! ");
        }
    }

    public static float valorMedia(float nota1, float nota2, float nota3) {
        float valorMedia;
        if (nota1 < nota2 && nota1 < nota3) {
            valorMedia = (nota2 + nota3) / 2;
        } else if (nota2 < nota1 && nota2 < nota3) {
            valorMedia = (nota1 + nota3) / 2;
        } else {
            valorMedia = (nota1 + nota2) / 2;
        }
        return valorMedia;
    }
    
    public static void repeticao() {
        System.out.println("Exemplo de repetição ainda a ser implementado.");
    }

    public static void sair() {
        System.out.println("Saindo do sistema...");
    }
}