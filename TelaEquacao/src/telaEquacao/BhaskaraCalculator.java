package telaEquacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BhaskaraCalculator extends JFrame {

    // Declaração dos componentes
    private JSpinner spinnerA, spinnerB, spinnerC;
    private JLabel lblDeltaFormula, lblDeltaValue, lblX1, lblX2, lblType;
    private JLabel lblB, lbl4A, lblA, lblC;

    // Construtor do JFrame
    public BhaskaraCalculator() {
        // Configurações do JFrame
        setTitle("Calculadora de Bhaskara");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 5, 5));  // 6 linhas, cada uma com um painel para organização vertical

        // Painel para a Equação
        JPanel panelEquation = new JPanel();
        panelEquation.add(new JLabel("Equação: "));
        spinnerA = new JSpinner(new SpinnerNumberModel(1, -100, 100, 1));
        spinnerB = new JSpinner(new SpinnerNumberModel(0, -100, 100, 1));
        spinnerC = new JSpinner(new SpinnerNumberModel(0, -100, 100, 1));
        panelEquation.add(spinnerA);
        panelEquation.add(new JLabel("x² +"));
        panelEquation.add(spinnerB);
        panelEquation.add(new JLabel("x +"));
        panelEquation.add(spinnerC);
        panelEquation.add(new JLabel("= 0"));
        add(panelEquation);

        // Painel para Fórmula de Delta
        JPanel panelDeltaFormula = new JPanel();
        lblDeltaFormula = new JLabel("Δ = ");
        lblB = new JLabel("B²");
        lbl4A = new JLabel(" - 4 *");
        lblA = new JLabel("A");
        lblC = new JLabel(" C");
        panelDeltaFormula.add(lblDeltaFormula);
        panelDeltaFormula.add(lblB);
        panelDeltaFormula.add(lbl4A);
        panelDeltaFormula.add(lblA);
        panelDeltaFormula.add(new JLabel("*"));
        panelDeltaFormula.add(lblC);
        add(panelDeltaFormula);

        // Painel para o Botão de Calcular
        JPanel panelButton = new JPanel();
        JButton btnCalcular = new JButton("Calcular Δ");
        panelButton.add(btnCalcular);
        add(panelButton);

        // Painel para Resultado de Delta
        JPanel panelDeltaResult = new JPanel();
        lblDeltaValue = new JLabel("Δ = ");
        panelDeltaResult.add(lblDeltaValue);
        add(panelDeltaResult);

        // Painel para Resultados de X1 e X2
        JPanel panelResults = new JPanel();
        lblX1 = new JLabel("x1 = ");
        lblX2 = new JLabel("x2 = ");
        panelResults.add(lblX1);
        panelResults.add(lblX2);
        add(panelResults);

        // Painel para Tipo de Raízes
        JPanel panelType = new JPanel();
        lblType = new JLabel("Tipo: ");
        panelType.add(lblType);
        add(panelType);

        // Evento do botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularBhaskara();
            }
        });

        // Evento para atualizar a fórmula de Delta ao mudar os valores
        spinnerA.addChangeListener(e -> atualizarFormulaDelta());
        spinnerB.addChangeListener(e -> atualizarFormulaDelta());
        spinnerC.addChangeListener(e -> atualizarFormulaDelta());

        // Exibe o JFrame
        setVisible(true);
    }

    // Método para atualizar a fórmula de Delta com valores de A, B e C
    private void atualizarFormulaDelta() {
        int a = (int) spinnerA.getValue();
        int b = (int) spinnerB.getValue();
        int c = (int) spinnerC.getValue();

        lblB.setText(b + "²");
        lblA.setText(String.valueOf(a));
        lblC.setText(String.valueOf(c));
    }

    // Método para calcular Bhaskara
    private void calcularBhaskara() {
        int a = (int) spinnerA.getValue();
        int b = (int) spinnerB.getValue();
        int c = (int) spinnerC.getValue();

        int delta = b * b - 4 * a * c;
        lblDeltaValue.setText("Δ = " + delta);

        if (delta < 0) {
            lblX1.setText("x1 = ---");
            lblX2.setText("x2 = ---");
            lblType.setText("Tipo: Sem raízes reais");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            lblX1.setText(String.format("x1 = %.2f", x1));
            lblX2.setText(String.format("x2 = %.2f", x2));
            lblType.setText("Tipo: Raízes Reais");
        }
    }

    // Método principal
    public static void main(String[] args) {
        new BhaskaraCalculator();
    }
}