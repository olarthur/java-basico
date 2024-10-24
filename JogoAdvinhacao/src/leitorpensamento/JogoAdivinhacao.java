package leitorpensamento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoAdivinhacao extends JFrame {
    private JSpinner spinnerNumero; // Campo com scroll de números
    private JLabel lblMensagem;
    private JButton btnAdvinhar;
    private int numeroPensado; // Número gerado aleatoriamente

    public JogoAdivinhacao() {
        // Configuração da janela
        setTitle("Jogo de Adivinhação");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre componentes

        // Gera o número aleatório entre 1 e 5
        Random random = new Random();
        numeroPensado = random.nextInt(5) + 1;

        // Mensagem inicial
        JLabel lblInstrucoes = new JLabel("Estou pensando em um número entre 1 e 5");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Ocupar duas colunas
        add(lblInstrucoes, gbc);

        // Campo de número com spinner (de 1 a 5)
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 5, 1);
        spinnerNumero = new JSpinner(model);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(spinnerNumero, gbc);

        // Botão "Advinhar"
        btnAdvinhar = new JButton("Advinhar");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(btnAdvinhar, gbc);

        // Mensagem de feedback
        lblMensagem = new JLabel("");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Ocupar duas colunas
        add(lblMensagem, gbc);

        // Ação do botão
        btnAdvinhar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarNumero();
            }
        });

        // Tornar a janela visível
        setVisible(true);
    }

    private void verificarNumero() {
        int numeroEscolhido = (int) spinnerNumero.getValue(); // Obtém o valor do spinner

        if (numeroEscolhido == 0) {
            JOptionPane.showMessageDialog(this, "Programa encerrado.");
            System.exit(0); // Encerra o programa se o usuário digitar 0
        } else if (numeroEscolhido == numeroPensado) {
            lblMensagem.setText("Acertou!");
            JOptionPane.showMessageDialog(this, "Você acertou! O número era " + numeroPensado + ".");
            System.exit(0); // Encerra o programa se o usuário acertar
        } else {
            lblMensagem.setText("Errou, tente novamente!");
        }
    }

    public static void main(String[] args) {
        // Executa o programa
        new JogoAdivinhacao();
    }
}