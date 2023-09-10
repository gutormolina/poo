/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

import java.util.Comparator;

/**
 *
 * @author augus
 */
public class CompararData implements Comparator<Anotacao> {

    @Override
    public int compare(Anotacao o1, Anotacao o2) {
        if (o1.getData().getAno() != o2.getData().getAno()) {
            return Integer.compare(o1.getData().getAno(), o2.getData().getAno());
        }
        
        if (o1.getData().getMes() != o2.getData().getMes()) {
            return Integer.compare(o1.getData().getMes(), o2.getData().getMes());
        }
        
        if (o1.getData().getDia() != o2.getData().getDia()) {
            return Integer.compare(o1.getData().getDia(), o2.getData().getDia());
        }
        
        if (o1.getData().getTempo() != o2.getData().getTempo()) {
            return Long.compare(o1.getData().getTempo(), o2.getData().getTempo());
        }
        
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
