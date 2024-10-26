package contador02;

import javax.swing.*;
import java.awt.*;

public class ContagemApp extends JFrame {

    private JLabel lblContagem;
    private JTextField txtNumero;
    private JButton btnContar;

    public ContagemApp() {
        setTitle("Contagem");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        // Label de contagem
        lblContagem = new JLabel("Contagem:");
        lblContagem.setFont(new Font("Serif", Font.BOLD, 20));
        add(lblContagem);

        // Botão de contar
        btnContar = new JButton("Contar");
        btnContar.setPreferredSize(new Dimension(100, 40));
        add(btnContar);

        // Aqui é onde o código do evento de clique deve ser adicionado
        btnContar.addActionListener(e -> {
            int cc = 0;
            String contagem = "";
            while (cc < 5) {
                contagem += cc + " ";
                cc++;
            }

            lblContagem.setText(contagem);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContagemApp frame = new ContagemApp();
            frame.setVisible(true);
        });
    }
}
