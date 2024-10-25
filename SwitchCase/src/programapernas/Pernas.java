package programapernas;

import java.util.Scanner;
public class Pernas {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas pernas? ");
        int pernas = leia.nextInt();
        String tipo;
        System.out.println("Isso é um(a): ");

        switch (pernas) {
            case 1: 
            tipo = "Saci";
            break;
            case 2: 
            tipo = "Bípede";
            break;
            case 3: 
            tipo = "Tripé";
            break;
            case 4: 
            tipo = "Quadrúpede";
            break;
            case 6, 8:
            tipo = "Aranha";
            break;
            default: 
            tipo = "ET";
        }
        System.out.println(tipo);

        leia.close();
    }
}
