/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author augus
 */
public class Janela extends JFrame implements ActionListener{
   
    private JPanel painel1, painel2, painel3, painelAnot;
    private JButton novaAnot, ordData, ordTitulo, verAnot, remAnot, pagAnt, pagProx;
    private JLabel pags;
    private BlocoDeAnotacoes bloco;
    private boolean novaAnotAberta = false;
    private Border blackline;
    private List<JButton> verAnotBotoes, remAnotBotoes;
    private int paginaAtual = 1, maxAnots = 4;
    
    public Janela() {
        setSize(1024, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("AnotacoesApp");
        setLocationRelativeTo(null);
        this.bloco = new BlocoDeAnotacoes();
        verAnotBotoes = new ArrayList<>();
        remAnotBotoes = new ArrayList<>();
        criaJanela();
        setVisible(true);
        blackline = BorderFactory.createLineBorder(Color.gray);
        atualizaAnot();
    }

    public void setNovaAnotAberta(boolean novaAnotAberta) {
        this.novaAnotAberta = novaAnotAberta;
    }
    
    public void atualizaAnot() {
        verAnotBotoes.clear();
        remAnotBotoes.clear();    
        
        painel2.removeAll();
        
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.Y_AXIS));
        
        int inicio = (paginaAtual - 1) * maxAnots;
        int fim = Math.min(inicio + maxAnots, bloco.getLista().size());
        
        for (int i = inicio; i < fim; i++) {
            Anotacao anotacao = this.bloco.getLista().get(i);
            painelAnot = new JPanel();
            painelAnot.setLayout(new FlowLayout());
            painel2.add(painelAnot);
            
            verAnot = new JButton(anotacao.getTitulo());
            verAnot.setPreferredSize(new Dimension(900, 50));
            verAnot.addActionListener(this);
            
            
            remAnot = new JButton("X");
            remAnot.setPreferredSize(new Dimension(50,50));
            remAnot.addActionListener(this);
            
            verAnotBotoes.add(verAnot);
            remAnotBotoes.add(remAnot);
            painelAnot.add(verAnot);
            painelAnot.add(remAnot);
        }
        
        pags.setText("Página " + paginaAtual);
        painel2.setBorder(blackline);
        painel2.revalidate();
        painel2.repaint();
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
        
        // -- Definição do Painel 3 --------------
        painel3.setLayout(new FlowLayout());
        pagAnt = new JButton("Página Anterior");
        pags = new JLabel();
        pagProx = new JButton("Próxima Página");
        pagAnt.addActionListener(this);
        pagProx.addActionListener(this);
        painel3.add(pagAnt);
        painel3.add(pags);
        painel3.add(pagProx);
        
        atualizaAnot();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == novaAnot & !novaAnotAberta) {
            NovaAnotacao novaAnotacao = new NovaAnotacao(bloco, this);
            novaAnotAberta = true;
            novaAnotacao.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    if (e.getSource() == novaAnotacao);
                    novaAnotAberta = false;
                }
            });
        }
        
        if (e.getSource() == ordData) {
            bloco.ordenarData();
            atualizaAnot();
        }
        
        if (e.getSource() == ordTitulo) {
            bloco.ordenarTitulo();
            atualizaAnot();
        }
        
        if (e.getSource() == pagAnt) {
            if (paginaAtual > 1) {
                paginaAtual--;
                atualizaAnot();
            }
        }
        
        if (e.getSource() == pagProx) {
            int totalPaginas = (int) Math.ceil((double) bloco.getLista().size() / maxAnots);
            if (paginaAtual < totalPaginas) {
                paginaAtual++;
                atualizaAnot();
            }
        }
        
        if (e.getSource() == verAnot) {
            int index = verAnotBotoes.indexOf(e.getSource());
            Anotacao anotacao = this.bloco.getLista().get(index);
            VerAnotacao verAnotacao = new VerAnotacao(anotacao, bloco, this);
        }
        
        if (e.getSource() == remAnot) {
            int index = remAnotBotoes.indexOf(e.getSource());
            Anotacao anotacao = this.bloco.getLista().get(index);
            bloco.remover(anotacao);
            verAnotBotoes.remove(index);
            atualizaAnot();
        }
    }
}
