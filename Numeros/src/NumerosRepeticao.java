import java.util.Scanner;
public class NumerosRepeticao {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int n, s = 0;
        String resp;

        do {

            System.out.print("Digite um número: ");
            n = leia.nextInt();
            s += n;
            System.out.print("Quer contiuar? [S/N] ");
            resp = leia.next();
        } while(resp.equals("S"));

        System.out.println("A soma de todos os valores é: " + s);

        leia.close();
    }
}
