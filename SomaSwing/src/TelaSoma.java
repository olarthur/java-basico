import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JFrame {
    // Declaração dos componentes da interface
    private JTextField txt1;
    private JTextField txt2;
    private JButton btnSoma;
    private JLabel lblResultado;
    private JLabel lblMais;

    // Construtor da classe
    public TelaSoma() {
        setTitle("Soma de Números");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Inicialização dos componentes
        txt1 = new JTextField(5);
        txt2 = new JTextField(5);
        lblMais = new JLabel("+");
        btnSoma = new JButton("=");
        lblResultado = new JLabel("0");

        // Adicionando componentes à janela
        add(txt1);
        add(lblMais);
        add(txt2);
        add(btnSoma);
        add(lblResultado);

        // Adicionando o evento ao botão
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lê os valores inseridos nos campos de texto e realiza a soma
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                    int soma = num1 + num2;

                    // Exibe o resultado da soma no JLabel
                    lblResultado.setText(String.valueOf(soma));
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Erro");
                }
            }
        });

        // Exibe a janela
        setVisible(true);
    }

    // Método principal
    public static void main(String[] args) {
        new TelaSoma();
    }
}