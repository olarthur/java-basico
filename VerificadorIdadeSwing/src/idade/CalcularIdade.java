package idade;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CalcularIdade extends JFrame {
    private JTextField txtAnoNascimento;
    private JTextField txtIdade;
    private JTextField txtSituacao;
    private JButton btnCalcular;

    public CalcularIdade() {
        // Configuração da janela
        setTitle("Calculadora de Idade");
        setSize(400, 250); // Ajuste no tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o layout principal como GridLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes

        // JLabel e campo de texto para "Ano de Nascimento"
        JLabel lblAnoNascimento = new JLabel("Ano de Nascimento:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // Alinhamento à esquerda
        add(lblAnoNascimento, gbc);

        txtAnoNascimento = new JTextField();
        txtAnoNascimento.setPreferredSize(new Dimension(100, 25)); // Definindo o tamanho do JTextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtAnoNascimento, gbc);

        // Botão "Calcular Idade"
        btnCalcular = new JButton("Calcular Idade");
        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Painel para centralizar o botão
        panelButton.add(btnCalcular);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // O botão ocupa as duas colunas
        gbc.anchor = GridBagConstraints.CENTER; // Centralizar o botão
        add(panelButton, gbc);

        // JLabel e campo de texto para "Idade"
        JLabel lblIdade = new JLabel("Idade:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // Voltar para uma coluna
        gbc.anchor = GridBagConstraints.WEST; // Alinhamento à esquerda
        add(lblIdade, gbc);

        txtIdade = new JTextField(10);
        txtIdade.setText("0");
        txtIdade.setEditable(false); // Campo não editável
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(txtIdade, gbc);

        // JLabel e campo de texto para "Situação"
        JLabel lblSituacao = new JLabel("Situação:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST; // Alinhamento à esquerda
        add(lblSituacao, gbc);

        txtSituacao = new JTextField(10);
        txtSituacao.setText("<vazio>");
        txtSituacao.setEditable(false); // Campo não editável
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(txtSituacao, gbc);

        // Ação ao clicar no botão "Calcular Idade"
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIdade();
            }
        });

        // Torna a janela visível
        setVisible(true);
    }

    private void calcularIdade() {
        try {
            // Obtém o ano de nascimento
            int anoNascimento = Integer.parseInt(txtAnoNascimento.getText());

            // Calcula a idade
            int anoAtual = LocalDate.now().getYear();
            int idade = anoAtual - anoNascimento;

            // Define a idade no campo de texto
            txtIdade.setText(Integer.toString(idade));

            // Define a situação do voto com base na idade
            String situacao = (idade >= 16 && idade < 18) || (idade > 70) ? "O voto é Opcional" : "O voto é Obrigatório";
            
            txtSituacao.setText(situacao); // Atualiza o campo de situação

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um ano válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Executa o programa
        new CalcularIdade();
    }
}