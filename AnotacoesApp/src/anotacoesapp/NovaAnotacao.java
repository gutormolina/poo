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
    private JButton salvar, cancelar;
    private JTextArea descricao;
    private JTextField titulo;
    private Anotacao anotacao;
    
    public NovaAnotacao(BlocoDeAnotacoes bloco) {
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
        descricao.setLineWrap(true);
        
        // -- Definição do Painel 3 --------------
        painel3.setLayout(new FlowLayout());
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        salvar.addActionListener(this);
        cancelar.addActionListener(this);
        painel3.add(salvar);
        painel3.add(cancelar);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salvar) {
            
        }
        
        if (e.getSource() == cancelar) {
            super.dispose();
        }
    }
}
