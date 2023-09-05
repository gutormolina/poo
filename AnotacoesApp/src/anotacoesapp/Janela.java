/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author augus
 */
public class Janela extends JFrame implements ActionListener{
   
    private JPanel painel1, painel2, painel3;
    private JButton novaAnot, ordData, ordTitulo, pagAnt, pagProx;
    private JLabel pags;
    private BlocoDeAnotacoes bloco;
    
    
    public Janela() {
        setSize(1024, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("AnotacoesApp");
        setLocationRelativeTo(null);
        criaJanela();
        setVisible(true);
    }
    
    public void criaJanela() {
        setLayout(new GridLayout(3, 1));
        
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        
        add(painel1);
        add(painel2);
        add(painel3);
        
        // -- Definição do Painel 1 --------------
        painel1.setLayout(new FlowLayout());
        novaAnot = new JButton("Adicionar anotação");
        ordData = new JButton("Ordenar por data");
        ordTitulo = new JButton("Ordenar por título");
        novaAnot.addActionListener(this);
        ordData.addActionListener(this);
        ordTitulo.addActionListener(this);
        painel1.add(novaAnot);
        painel1.add(ordData);
        painel1.add(ordTitulo);
        
        // -- Definição do Painel 2 --------------
        painel2.setLayout(new GridLayout(6,2));
        
        
        // -- Definição do Painel 3 --------------
        painel3.setLayout(new FlowLayout());
        pagAnt = new JButton("Página Anterior");
        pags = new JLabel("Página 1");
        pagProx = new JButton("Próxima Página");
        pagAnt.addActionListener(this);
        pagProx.addActionListener(this);
        painel3.add(pagAnt);
        painel3.add(pags);
        painel3.add(pagProx);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == novaAnot) {
            NovaAnotacao novaAnotacao = new NovaAnotacao(bloco);
        }
        
        if (e.getSource() == ordData) {
            bloco.ordenarData();
        }
        
        if (e.getSource() == ordTitulo) {
            bloco.ordenarTitulo();
        }
        
        if (e.getSource() == pagAnt) {
            
        }
        
        if (e.getSource() == pagProx) {
            
        }
    }
}
