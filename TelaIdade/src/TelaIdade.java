import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TelaIdade extends JFrame {
    // Declaração dos componentes da interface
    private JLabel lblAnoNascimento;
    private JTextField txtAnoNascimento;
    private JLabel lblAnoAtual;
    private JButton btnCalcular;
    private JLabel lblResultado;

    // Construtor da classe
    public TelaIdade() {
        setTitle("Calculadora de Idade");
        setSize(560, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Obtém o ano atual do sistema
        int anoAtual = LocalDate.now().getYear();

        // Inicialização dos componentes
        lblAnoNascimento = new JLabel("Ano de Nascimento:");
        txtAnoNascimento = new JTextField(5);
        lblAnoAtual = new JLabel("Ano Atual: " + anoAtual);
        btnCalcular = new JButton("Calcular Idade");
        lblResultado = new JLabel("Idade: ");

        // Adicionando componentes à janela
        add(lblAnoNascimento);
        add(txtAnoNascimento);
        add(lblAnoAtual);  // Exibe o ano atual diretamente na janela
        add(btnCalcular);
        add(lblResultado);

        // Adicionando o evento ao botão
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lê o ano de nascimento inserido pelo usuário
                    int anoNascimento = Integer.parseInt(txtAnoNascimento.getText());
                    // Calcula a idade
                    int idade = anoAtual - anoNascimento;

                    // Exibe o resultado no JLabel
                    lblResultado.setText("Idade: " + idade + " anos");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Erro: ano inválido.");
                }
            }
        });

        // Exibe a janela
        setVisible(true);
    }

    // Método principal
    public static void main(String[] args) {
        new TelaIdade();
    }
}