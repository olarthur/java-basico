import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) throws Exception {

        double v[] = {1.1, 5.4, -6.3, 3.7, -7.8}; 

        Arrays.sort(v);;
        for (double valor : v){ 
            System.out.print(valor + " ");
        }
    }
}
