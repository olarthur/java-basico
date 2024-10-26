import javax.swing.JOptionPane;

public class ExRepita {
    public static void main(String[] args) throws Exception {
 
        int n, totV = 0, par = 0, impar = 0, hun = 0, media;

        do {

        n = Integer.parseInt (JOptionPane.showInputDialog(null, "<html>Informe um Número: <br><em>(O valor 0 interrompe)</em></html>"));
        
        if (n % 2 == 0) {
            if (n != 0)
            par++;
        } else {
            impar++;
        }

        if(n > 100) {
            hun++;
        }
        
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br><hr>" + "Total de Pares: " + par +  "<br>Total de Ímpares: " + impar + "</html>");
       
    }
}
