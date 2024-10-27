public class Vetor02 {
    public static void main(String[] args) throws Exception {

        String mes[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Set", "Oct", "Nov", "Dec"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }
}
