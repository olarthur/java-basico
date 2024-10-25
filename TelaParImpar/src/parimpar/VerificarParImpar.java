package parimpar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerificarParImpar extends JFrame {
    
    // Declaração dos componentes
    private JLabel lblValor;
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;

    // Construtor do JFrame
    public VerificarParImpar() {
        // Configurações do JFrame
        setTitle("Verificar Par ou Ímpar");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Inicialização dos componentes
        lblValor = new JLabel("Valor:");
        txtValor = new JTextField(10);
        btnVerificar = new JButton("Verificar");
        lblResultado = new JLabel("Resultado");

        // Adiciona os componentes ao JFrame
        add(lblValor);
        add(txtValor);
        add(btnVerificar);
        add(lblResultado);

        // Adiciona o evento de clique no botão
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarParImpar();
            }
        });

        // Define a visibilidade do JFrame
        setVisible(true);
    }

    // Método que verifica se o número é par ou ímpar
    private void verificarParImpar() {
        try {
            int valor = Integer.parseInt(txtValor.getText());
            if (valor % 2 == 0) {
                lblResultado.setText("O valor " + valor + " é Par");
            } else {
                lblResultado.setText("O valor " + valor + " é Ímpar");
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Por favor, insira um número válido.");
        }
    }

    public static void main(String[] args) {
        new VerificarParImpar();
    }
}