/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author augus
 */
public class BlocoDeAnotacoes {
    private List<Anotacao> lista;
    
    public BlocoDeAnotacoes() {
        lista = new LinkedList();
    }
    
    public List<Anotacao> getLista() {
        return this.lista;
}
    
    public void inserir(Anotacao a) {
        lista.add(a);
    }
    
    public void remover(Anotacao a) {
        lista.remove(a);
    }
    
    public void ordenarTitulo() {
        Collections.sort(lista);
    }
    
    public void ordenarData() {
        Collections.sort(lista, new CompararData());
    }
}
