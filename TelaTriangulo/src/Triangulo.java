import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangulo extends JFrame {

    private JSlider sliA, sliB, sliC;
    private JLabel lblValorA, lblValorB, lblValorC;
    private JLabel lblForma, lblTipo;
    private JPanel pnlResultado;

    public Triangulo() {
        setTitle("Verificador de Triângulos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Painel para centralizar os segmentos
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.Y_AXIS));
        centralPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Segmento A
        JPanel panelA = new JPanel();
        panelA.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblA = new JLabel("Segmento A:");
        sliA = new JSlider(0, 20, 0);
        lblValorA = new JLabel("0");
        panelA.add(lblA);
        panelA.add(sliA);
        panelA.add(lblValorA);
        centralPanel.add(panelA);

        // Segmento B
        JPanel panelB = new JPanel();
        panelB.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB = new JLabel("Segmento B:");
        sliB = new JSlider(0, 20, 0);
        lblValorB = new JLabel("0");
        panelB.add(lblB);
        panelB.add(sliB);
        panelB.add(lblValorB);
        centralPanel.add(panelB);

        // Segmento C
        JPanel panelC = new JPanel();
        panelC.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblC = new JLabel("Segmento C:");
        sliC = new JSlider(0, 20, 0);
        lblValorC = new JLabel("0");
        panelC.add(lblC);
        panelC.add(sliC);
        panelC.add(lblValorC);
        centralPanel.add(panelC);

        // Atualização dos valores dos sliders
        sliA.addChangeListener(e -> lblValorA.setText(String.valueOf(sliA.getValue())));
        sliB.addChangeListener(e -> lblValorB.setText(String.valueOf(sliB.getValue())));
        sliC.addChangeListener(e -> lblValorC.setText(String.valueOf(sliC.getValue())));

        // Botão Verificar com tamanho personalizado
        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setPreferredSize(new Dimension(200, 50));
        centralPanel.add(btnVerificar);

        // Adiciona o painel centralizado ao JFrame
        add(Box.createVerticalGlue());
        add(centralPanel);
        add(Box.createVerticalGlue());

        // Painel de Resultado
        pnlResultado = new JPanel();
        pnlResultado.setLayout(new GridLayout(2, 1));
        pnlResultado.setPreferredSize(new Dimension(300, 100));
        pnlResultado.setVisible(false);

        lblForma = new JLabel("Forma ou não", SwingConstants.CENTER);
        lblForma.setFont(new Font("Serif", Font.PLAIN, 24));
        lblTipo = new JLabel("Tipo de Triângulo", SwingConstants.CENTER);
        lblTipo.setFont(new Font("Serif", Font.PLAIN, 24));

        pnlResultado.add(lblForma);
        pnlResultado.add(lblTipo);
        add(pnlResultado);

        // Evento do botão Verificar
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarTriangulo();
            }
        });
    }

    private void verificarTriangulo() {
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();

        if (a + b > c && a + c > b && b + c > a) {
            lblForma.setText("Forma um Triângulo");
            if (a == b && b == c) {
                lblTipo.setText("Equilátero");
            } else if (a != b && b != c && a != c) {
                lblTipo.setText("Escaleno");
            } else {
                lblTipo.setText("Isósceles");
            }
        } else {
            lblForma.setText("Não forma um Triângulo");
            lblTipo.setText("-");
        }

        pnlResultado.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Triangulo frame = new Triangulo();
            frame.setVisible(true);
        });
    }
}