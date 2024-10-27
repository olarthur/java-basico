import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class TelaVetor extends JFrame {
    private JSpinner spinnerNumero;
    private JButton btnAdicionar, btnRemover, btnOrdenar;
    private JLabel[] lblVetor;
    private int[] vetor;
    private int posicaoSelecionada = -1;

    public TelaVetor() {
        // Configurações da janela
        setTitle("Gerenciador de Vetor com JSpinner");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializa o vetor e a interface
        vetor = new int[10];
        Arrays.fill(vetor, 0);

        // Spinner para o número
        spinnerNumero = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        spinnerNumero.setPreferredSize(new Dimension(60, 30)); // Tamanho do JSpinner

        // Painel para os botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(3, 1, 5, 5));

        btnAdicionar = new JButton("Adicionar");
        btnRemover = new JButton("Remover");
        btnOrdenar = new JButton("Ordenar");

        painelBotoes.add(btnAdicionar);
        painelBotoes.add(btnRemover);
        painelBotoes.add(btnOrdenar);

        // Painel do vetor
        JPanel painelVetor = new JPanel(new GridLayout(10, 1, 5, 5));
        painelVetor.setBorder(BorderFactory.createTitledBorder("Vetor"));

        // Array de labels para exibir o vetor
        lblVetor = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            lblVetor[i] = new JLabel("[" + i + "] = " + vetor[i]);
            lblVetor[i].setOpaque(true);
            lblVetor[i].setBackground(Color.LIGHT_GRAY);
            lblVetor[i].setHorizontalAlignment(SwingConstants.CENTER);
            final int posicao = i;
            lblVetor[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    selecionarPosicao(posicao);
                }
            });
            painelVetor.add(lblVetor[i]);
        }

        // Adicionando ação aos botões
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarNumero();
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerNumero();
            }
        });

        btnOrdenar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ordenarVetor();
            }
        });

        // Painel principal para organizar em colunas
        JPanel painelPrincipal = new JPanel(new GridLayout(1, 3, 10, 0));

        // Adiciona os componentes ao painel principal
        painelPrincipal.add(spinnerNumero); // Spinner diretamente no painel principal
        painelPrincipal.add(painelBotoes);  // Botões
        painelPrincipal.add(painelVetor);   // Vetor

        // Adiciona o painel principal ao JFrame
        add(painelPrincipal, BorderLayout.CENTER);

        setVisible(true);
    }

    private void selecionarPosicao(int posicao) {
        posicaoSelecionada = posicao;
        atualizarInterface();
    }

    private void adicionarNumero() {
        if (posicaoSelecionada >= 0) {
            vetor[posicaoSelecionada] = (int) spinnerNumero.getValue();
            atualizarInterface();
        }
    }

    private void removerNumero() {
        if (posicaoSelecionada >= 0) {
            vetor[posicaoSelecionada] = 0;
            atualizarInterface();
        }
    }

    private void ordenarVetor() {
        Arrays.sort(vetor);
        atualizarInterface();
    }

    private void atualizarInterface() {
        for (int i = 0; i < 10; i++) {
            lblVetor[i].setText("[" + i + "] = " + vetor[i]);
            lblVetor[i].setBackground(i == posicaoSelecionada ? Color.YELLOW : Color.LIGHT_GRAY);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaVetor());
    }
}