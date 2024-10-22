import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisaoFrame extends JFrame {

    // Componentes da interface
    private JLabel labelNumerador;
    private JLabel labelDenominador;
    private JTextField campoNumerador;
    private JTextField campoDenominador;
    private JButton botaoDividir;
    private JLabel labelDivisao;
    private JLabel labelResto;
    private JLabel resultadoDivisao;
    private JLabel resultadoResto;

    // Construtor
    public DivisaoFrame() {
        // Definindo o título da janela
        super("Divisão com Resto");

        // Configurando o layout
        setLayout(null);

        // Criação dos componentes
        labelNumerador = new JLabel("Numerador:");
        labelDenominador = new JLabel("Denominador:");
        campoNumerador = new JTextField(10);
        campoDenominador = new JTextField(10);
        botaoDividir = new JButton("Dividir");
        labelDivisao = new JLabel("Divisão:");
        labelResto = new JLabel("Resto:");
        resultadoDivisao = new JLabel("0");
        resultadoResto = new JLabel("0");

        // Definindo posições dos componentes
        labelNumerador.setBounds(30, 30, 100, 25);
        campoNumerador.setBounds(150, 30, 100, 25);
        labelDenominador.setBounds(30, 70, 100, 25);
        campoDenominador.setBounds(150, 70, 100, 25);
        botaoDividir.setBounds(150, 110, 100, 25);
        labelDivisao.setBounds(30, 150, 100, 25);
        resultadoDivisao.setBounds(150, 150, 100, 25);
        labelResto.setBounds(30, 190, 100, 25);
        resultadoResto.setBounds(150, 190, 100, 25);

        // Adicionando os componentes ao frame
        add(labelNumerador);
        add(campoNumerador);
        add(labelDenominador);
        add(campoDenominador);
        add(botaoDividir);
        add(labelDivisao);
        add(resultadoDivisao);
        add(labelResto);
        add(resultadoResto);

        // Ação do botão "Dividir"
        botaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtendo os valores de entrada
                    int numerador = Integer.parseInt(campoNumerador.getText());
                    int denominador = Integer.parseInt(campoDenominador.getText());

                    // Realizando as operações de divisão e resto
                    int divisao = numerador / denominador;
                    int resto = numerador % denominador;

                    // Atualizando os rótulos com os resultados
                    resultadoDivisao.setText(String.valueOf(divisao));
                    resultadoResto.setText(String.valueOf(resto));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos!");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                }
            }
        });

        // Configurações da janela
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        new DivisaoFrame();
    }
}