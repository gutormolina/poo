/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author augus
 */
public class VerAnotacao extends JFrame implements ActionListener {
    private JPanel painel1, painel2, painel3, texto;
    private JLabel dataDeCriacao;
    private JTextField titulo;
    private JTextArea descricao;
    private JButton salvar, cancelar;
    private Anotacao anotacao;
    private BlocoDeAnotacoes bloco;
    private Janela janela;
    private Data data;
    
    public VerAnotacao(Anotacao anotacao, BlocoDeAnotacoes bloco, Janela janela) {
        setSize(450, 500);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.anotacao = anotacao;
        this.bloco = bloco;
        this.janela = janela;
        this.data = anotacao.getData();
        setTitle(anotacao.getTitulo());
        setLocationRelativeTo(null);
        criaJanela();
        setVisible(true);
    }
    
    public void criaJanela() {
        setLayout(new BorderLayout(0, 10));
        
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        
        add(painel1, BorderLayout.NORTH);
        add(painel2);
        add(painel3, BorderLayout.SOUTH);
        
        // -- Definição do Painel 1 --------------
        dataDeCriacao = new JLabel();
        painel1.add(dataDeCriacao);
        dataDeCriacao.setText(data.getDia() + "/" + data.getMes() + "/" + data.getAno());

        // -- Definição do Painel 2 --------------
        
        texto = new JPanel();
        painel2.setLayout(new BorderLayout(0, 10));
        painel2.add(texto);
        texto.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 30));
        titulo = new JTextField();
        titulo.setPreferredSize(new Dimension (200, 30));
        titulo.setEditable(true);
        texto.add(titulo);
        titulo.setText(anotacao.getTitulo());
        descricao = new JTextArea();
        descricao.setEditable(true);
        descricao.setLineWrap(true);
        descricao.setPreferredSize(new Dimension(410, 250));
        texto.add(new JScrollPane(descricao), BorderLayout.CENTER);
        descricao.setText(anotacao.getDescricao());

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
            bloco.remover(anotacao);
            Anotacao anotEdit = new Anotacao(titulo.getText(), descricao.getText(), anotacao.getData());
            bloco.inserir(anotEdit);
            janela.atualizaAnot();
            super.dispose();
        }
        
        if (e.getSource() == cancelar) {
            super.dispose();
        }
    }
}
