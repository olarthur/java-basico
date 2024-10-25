package programamedia;

import java.util.*;

public class ProgramMedia {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float n1 = leia.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = leia.nextFloat();
        float m = (n1 + n2) / 2; 

        System.out.println("Sua média foi: " + m);

        if (m > 9) {
            System.out.println("Parabéns!");            
        }

        leia.close();
    }
}
