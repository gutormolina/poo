/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author augus
 */
public class NovaAnotacao extends JFrame implements ActionListener{
    private JPanel painel1, painel2, painel3;
    private JButton botao1, botao2;
    private JTextArea descricao;
    private JTextField titulo;
    
    public NovaAnotacao() {
        setSize(800, 600);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Nova Anotação");
        setLocationRelativeTo(null);
        criaJanela();
        setVisible(true);
    }
    
    public void criaJanela() {
        setLayout(new GridLayout(3,1));
        
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        
        add(painel1);
        add(painel2);
        add(painel3);
        
        // -- Definição do Painel 1 --------------
        painel1.setLayout(new FlowLayout());
        titulo = new JTextField();
        titulo.setEditable(true);
        painel1.add(titulo);
        titulo.setText("Novo Título");
        
        // -- Definição do Painel 2 --------------
        painel2.setLayout(new BorderLayout());
        descricao = new JTextArea();
        descricao.setEditable(true);
        painel2.add(new JScrollPane(descricao), BorderLayout.CENTER);
        descricao.append("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi vel efficitur ex. Cras consectetur dolor ut pellentesque euismod. Suspendisse id convallis lectus. Curabitur turpis turpis, laoreet at feugiat accumsan, euismod vel neque. Duis egestas, nisi id tempor tristique, nibh felis accumsan lorem, id egestas quam massa at elit. Aliquam molestie neque vel luctus scelerisque. Vestibulum tristique sem fermentum ipsum ultrices, nec pulvinar turpis molestie. Aenean tortor est, posuere vel efficitur at, consectetur ut orci. Etiam at sem ut eros venenatis eleifend. Nunc in porta orci. Pellentesque vulputate nisi ut venenatis volutpat. Mauris fringilla commodo vulputate. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Maecenas augue sapien, vulputate ac vulputate quis, posuere efficitur lectus. Phasellus auctor gravida lectus id vehicula.");
        descricao.setLineWrap(true);
        
        // -- Definição do Painel 3 --------------
        painel3.setLayout(new FlowLayout());
        botao1 = new JButton("Salvar");
        botao2 = new JButton("Cancelar");
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        painel3.add(botao1);
        painel3.add(botao2);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
