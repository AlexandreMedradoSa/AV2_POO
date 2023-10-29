package q5_AlexandreFarias;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoAdivinhacao {
    private JFrame janela;
    private JPanel painel;
    private JTextField campoTentativas;
    private JButton[] botoesNumeros;
    private int numeroAlvo;
    private int tentativasRestantes;

    public JogoAdivinhacao() {
        janela = new JFrame("Jogo de Adivinhação");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());

        painel = new JPanel();
        painel.setLayout(new GridLayout(4, 5));

        campoTentativas = new JTextField(20);
        campoTentativas.setEditable(false);

        botoesNumeros = new JButton[20];

        for (int i = 0; i < 20; i++) {
            botoesNumeros[i] = new JButton(String.valueOf(i + 1));
            botoesNumeros[i].addActionListener(new OuvinteBotao(i + 1));
            painel.add(botoesNumeros[i]);
        }

        janela.add(campoTentativas, BorderLayout.NORTH);
        janela.add(painel, BorderLayout.CENTER);

        janela.pack();
        janela.setVisible(true);

        iniciarJogo();
    }

    private void iniciarJogo() {
        Random random = new Random();
        numeroAlvo = random.nextInt(20) + 1;
        tentativasRestantes = 5;
        campoTentativas.setText("Tentativas restantes: " + tentativasRestantes);
    }

    private class OuvinteBotao implements ActionListener {
        private int numeroEscolhido;

        public OuvinteBotao(int numero) {
            numeroEscolhido = numero;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (tentativasRestantes > 0) {
                tentativasRestantes--;
                campoTentativas.setText("Tentativas restantes: " + tentativasRestantes);

                if (numeroEscolhido == numeroAlvo) {
                    JOptionPane.showMessageDialog(janela, "Você acertou! O número é " + numeroAlvo);
                    iniciarJogo();
                } else if (tentativasRestantes == 0) {
                    JOptionPane.showMessageDialog(janela, "Suas tentativas acabaram. O número era " + numeroAlvo);
                    iniciarJogo();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JogoAdivinhacao());
    }
}
