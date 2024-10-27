import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JSlider sliderInicio;
    private JSlider sliderFim;
    private JSlider sliderPasso;
    private JLabel lblValorInicio;
    private JLabel lblValorFim;
    private JLabel lblValorPasso;
    private JButton btnContar;
    private JTextArea txtResultado;

    public TelaContador() {
        // Configurações da janela
        setTitle("Contador Swing");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel principal para sliders e botão
        JPanel painelPrincipal = new JPanel(new GridLayout(4, 3, 5, 5));

        // Linha 1: Slider "Início"
        JLabel lblInicio = new JLabel("Início:");
        sliderInicio = new JSlider(0, 5, 0);
        lblValorInicio = new JLabel("0");

        sliderInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblValorInicio.setText(String.valueOf(sliderInicio.getValue()));
            }
        });

        // Linha 2: Slider "Fim"
        JLabel lblFim = new JLabel("Fim:");
        sliderFim = new JSlider(6, 20, 6);
        lblValorFim = new JLabel("6");

        sliderFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblValorFim.setText(String.valueOf(sliderFim.getValue()));
            }
        });

        // Linha 3: Slider "Passo"
        JLabel lblPasso = new JLabel("Passo:");
        sliderPasso = new JSlider(1, 5, 1);
        lblValorPasso = new JLabel("1");

        sliderPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblValorPasso.setText(String.valueOf(sliderPasso.getValue()));
            }
        });

        // Botão "Contar"
        btnContar = new JButton("Contar");
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarContagem();
            }
        });

        // Adicionando componentes ao painel principal
        painelPrincipal.add(lblInicio);
        painelPrincipal.add(sliderInicio);
        painelPrincipal.add(lblValorInicio);

        painelPrincipal.add(lblFim);
        painelPrincipal.add(sliderFim);
        painelPrincipal.add(lblValorFim);

        painelPrincipal.add(lblPasso);
        painelPrincipal.add(sliderPasso);
        painelPrincipal.add(lblValorPasso);

        painelPrincipal.add(new JLabel()); // Espaço em branco
        painelPrincipal.add(btnContar);

        // Painel para exibir o resultado ao lado dos componentes
        txtResultado = new JTextArea(10, 10);
        txtResultado.setEditable(false);

        // Adicionando borda ao JTextArea para diferenciar
        txtResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
        JScrollPane scrollPane = new JScrollPane(txtResultado);

        // Adiciona o painel principal e a área de resultado ao JFrame
        add(painelPrincipal, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.EAST);

        setVisible(true);
    }

    private void realizarContagem() {
        int inicio = sliderInicio.getValue();
        int fim = sliderFim.getValue();
        int passo = sliderPasso.getValue();

        // Construindo a contagem vertical
        StringBuilder contagem = new StringBuilder();
        for (int i = inicio; i <= fim; i += passo) {
            contagem.append(i).append("\n");
        }

        // Exibindo o resultado no JTextArea
        txtResultado.setText(contagem.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaContador();
            }
        });
    }
}