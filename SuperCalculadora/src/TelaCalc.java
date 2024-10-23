import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class TelaCalc extends JFrame {

    private JTextField textField;
    private JTextArea resultArea;

    public TelaCalc() {
        // Configuração do JFrame
        setTitle("Calculadora Avançada");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label para o campo de texto
        JLabel label = new JLabel("Digite um número:");
        add(label);

        // Campo de texto para inserção do número
        textField = new JTextField(10);
        add(textField);

        // Botão para acionar os cálculos
        JButton calcularBtn = new JButton("+ - * =");
        add(calcularBtn);

        // Área de texto para mostrar os resultados
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false); // Impede a edição
        JScrollPane scrollPane = new JScrollPane(resultArea); // Adiciona barra de rolagem se necessário
        add(scrollPane);

        // Listener para o botão de cálculo
        calcularBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void calcular() {
        try {
            double valor = Double.parseDouble(textField.getText());

            int restoDivisaoPor2 = (int) (valor % 2);
            double aoCubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);
            double raizCubica = Math.cbrt(valor);
            double valorAbsoluto = Math.abs(valor);

            // Exibe os resultados na área de texto
            resultArea.setText(String.format(
                "Resto da divisão por 2: %.2f\n" +
                "Número elevado ao cubo: %.2f\n" +
                "Raiz quadrada: %.2f\n" +
                "Raiz cúbica: %.2f\n" +
                "Valor absoluto: %.2f",
                restoDivisaoPor2, aoCubo, raizQuadrada, raizCubica, valorAbsoluto
            ));
        } catch (NumberFormatException ex) {
            // Exibe mensagem de erro caso o valor não seja um número
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Executa a aplicação na thread de interface gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCalc().setVisible(true);
            }
        });
    }
}