import javax.swing.JOptionPane;

public class ExRepita {
    public static void main(String[] args) throws Exception {
 
        int n;

        do {

        n = Integer.parseInt (JOptionPane.showInputDialog(null, "Informe um Número: (O valor 0 interrompe)"));

        } while (n != 0);

    }
}
