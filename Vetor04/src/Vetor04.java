import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) throws Exception {

        int vet[] = {2, 6, 5, 0, 8, 3, 1};
        for (int v: vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("O valor está na posição " + p);

    }
}
