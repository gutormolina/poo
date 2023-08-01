/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LembretesApp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class BlocoDeLembretes {
    private List<Lembrete> lista;
    
    public BlocoDeLembretes() {
        lista = new LinkedList();
    }
    
    public void inserir(Lembrete l) {
        lista.add(l);
    }
    
    public Lembrete remover(int posicao) {
        return lista.remove(posicao);
    }
    
    public Lembrete buscar(int posicao) { // pode usar lista.contains para checar
        return lista.get(posicao); // se o objeto passado está na lista
    }
    
    public void ordenar() {
        Collections.sort(lista);
    }
    
    @Override
    public String toString() {
        return lista.toString();
    }
}
