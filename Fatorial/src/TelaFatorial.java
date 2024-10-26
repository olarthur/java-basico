import javax.swing.*;
import java.awt.*;

public class TelaFatorial extends JFrame {

    private JSpinner spinnerNumero;
    private JLabel lblResultado;

    public TelaFatorial() {
        setTitle("Calculadora de Fatorial");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        // Controle giratório para o usuário inserir o número
        spinnerNumero = new JSpinner(new SpinnerNumberModel(0, 0, 12, 1)); // Limitado a 12
        spinnerNumero.setFont(new Font("Serif", Font.BOLD, 20));
        add(spinnerNumero);

        // Label "!="
        JLabel lblIgual = new JLabel("! =");
        lblIgual.setFont(new Font("Serif", Font.BOLD, 20));
        add(lblIgual);

        // Label para mostrar o resultado do fatorial
        lblResultado = new JLabel("1"); // Fatorial de 0 é 1
        lblResultado.setFont(new Font("Serif", Font.BOLD, 20));
        add(lblResultado);

        // Evento para calcular o fatorial quando o número no spinner muda
        spinnerNumero.addChangeListener(e -> {
            int numero = (int) spinnerNumero.getValue();
            lblResultado.setText(calcularFatorial(numero) + "");
        });
    }

    // Método para calcular o fatorial usando um loop while
    private int calcularFatorial(int n) {
        int fatorial = 1; // Inicializa o fatorial como 1
        int c = n;

        while (c >= 1) {
            fatorial *= c; // Multiplica para calcular o fatorial
            c--; // Decrementa c
        }

        return fatorial; // Retorna o valor do fatorial calculado
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaFatorial frame = new TelaFatorial();
            frame.setVisible(true);
        });
    }
}