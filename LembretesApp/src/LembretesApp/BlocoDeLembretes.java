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
    
    public List<Lembrete> buscar(String substring) {
        List<Lembrete> lembretesEncontrados = new LinkedList<>();
        
        for (Lembrete lembrete : lista) {
            if (lembrete.getDescricao().contains(substring)) {
                lembretesEncontrados.add(lembrete);
            }
        }
        
        return lembretesEncontrados;
    }
    
    public List<Lembrete> buscar(int mes, int ano) {
        List<Lembrete> lembretesEncontrados = new LinkedList<>();
        
        for (Lembrete lembrete : lista) {
            if (lembrete.getData().getAno() == ano &&
                lembrete.getData().getMes() == mes) {
                lembretesEncontrados.add(lembrete);
            }
        }
        
        return lembretesEncontrados;
    }
    
    public List<Lembrete> buscar(Data data) {
        List<Lembrete> lembretesEncontrados = new LinkedList<>();
        
        for (Lembrete lembrete : lista) {
            if (lembrete.getData().equals(data)) {
                lembretesEncontrados.add(lembrete);
            }
        }
        
        return lembretesEncontrados;
    }
    
    public void ordenar() {
        Collections.sort(lista);
    }
    
    @Override
    public String toString() {
        return lista.toString();
    }
}
