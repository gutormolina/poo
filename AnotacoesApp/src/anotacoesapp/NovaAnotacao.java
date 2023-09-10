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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
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
    private BlocoDeAnotacoes bloco;
    private Janela janela;
    
    public NovaAnotacao(BlocoDeAnotacoes bloco, Janela janela) {
        setSize(600, 400);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Nova Anotação");
        setLocationRelativeTo(null);
        criaJanela();
        setVisible(true);
        this.bloco = bloco;
        this.janela = janela;
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                janela.setNovaAnotAberta(false);
            }
        });
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
            Calendar rightNow = Calendar.getInstance();
            int a = rightNow.get(Calendar.YEAR);
            int m = rightNow.get(Calendar.MONTH) + 1;
            int d = rightNow.get(Calendar.DAY_OF_MONTH);
            long t = System.currentTimeMillis(); 
            
            Data data = new Data(d, m, a, t);
            Anotacao anotacao = new Anotacao(titulo.getText(), descricao.getText(), data);
            
            bloco.inserir(anotacao);
            
            janela.setNovaAnotAberta(false);
            super.dispose();
            
            janela.atualizaAnot();
        }
        
        if (e.getSource() == cancelar) {
            janela.setNovaAnotAberta(false);
            super.dispose();
        }
    }
}
