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
    private JPanel painel1, painel2, painel3, painel4;
    private JLabel dataDeCriacao;
    private JTextField titulo;
    private JTextArea descricao;
    private JButton salvar, cancelar;
    private Anotacao anotacao;
    private BlocoDeAnotacoes bloco;
    private Janela janela;
    private Data data;
    
    public VerAnotacao(Anotacao anotacao, BlocoDeAnotacoes bloco, Janela janela) {
        setSize(600, 400);
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
        setLayout(new GridLayout(4, 1));
        
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        painel4 = new JPanel();
        
        add(painel1);
        add(painel2);
        add(painel3);
        add(painel4);
        
        // -- Definição do Painel 1 --------------
        dataDeCriacao = new JLabel();
        painel1.add(dataDeCriacao);
        dataDeCriacao.setText(data.getDia() + "/" + data.getMes() + "/" + data.getAno());

        // -- Definição do Painel 2 --------------
        painel2.setLayout(new FlowLayout());
        titulo = new JTextField();
        titulo.setEditable(true);
        painel2.add(titulo);
        titulo.setText(anotacao.getTitulo());

        // -- Definição do Painel 3 --------------
        painel3.setLayout(new BorderLayout());
        descricao = new JTextArea();
        descricao.setEditable(true);
        painel3.add(new JScrollPane(descricao), BorderLayout.CENTER);
        descricao.setLineWrap(true);
        descricao.setText(anotacao.getDescricao());

        // -- Definição do Painel 4 --------------
        painel4.setLayout(new FlowLayout());
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        salvar.addActionListener(this);
        cancelar.addActionListener(this);
        painel4.add(salvar);
        painel4.add(cancelar);
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
