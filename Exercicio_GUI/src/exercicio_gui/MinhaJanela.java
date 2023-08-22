/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author augus
 */
public class MinhaJanela extends JFrame implements ActionListener {
    private JPanel painel1, painel2, painel3;
    private JButton botao1, botao2;
    private JTextArea console;
    private int linha;
    private JPanel[][] mapa;
    
    public MinhaJanela(){
        linha = 1;
        setSize(1024, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Minha Janela");
        setLocationRelativeTo(null);
        criaJanela();
        setVisible(true);
    }
    
    public void criaJanela() {
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel2.setLayout(new BorderLayout());
        painel3 = new JPanel();
        painel3.setLayout(new FlowLayout());
        setLayout(new GridLayout(3, 0));
        add(painel1);
        add(painel2);
        add(painel3);
        
        // -- Definição do Painel 1 --------------
        painel1.setLayout(new GridLayout(3, 3));
        mapa = new JPanel[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mapa[i][j] = new JPanel();
                mapa[i][j].setBackground(new Color(0, 0, 255));
                mapa[i][j].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
                painel1.add(mapa[i][j]);
            }
        }
        
        // -- Definição do Painel 2 --------------
        console = new JTextArea();
        console.setEditable(false);
        painel2.add(new JScrollPane(console), BorderLayout.CENTER);
        console.append("Hello world");
        
        // -- Definição do Painel 3 --------------
        botao1 = new JButton("Ação");
        botao1.addActionListener(this);
        painel3.add(botao1);
        botao2 = new JButton("Escreve");
        botao2.addActionListener(this);
        painel3.add(botao2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao2) {
            console.append("\nLinha " + linha);
            linha++;
        }
    }
}
