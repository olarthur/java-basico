import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = leia.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = leia.nextFloat();
        System.out.printf("A nota de %s e %.2f \n", nome, nota);
    }
}
