/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LembretesApp;

/**
 *
 * @author aluno
 */
public class Lembrete implements Comparable<Lembrete> {
    private String descricao;
    private Data data; 
    
    public Lembrete(String descricao, Data data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Data getData() {
        return data;
    }
    
    @Override
    public String toString() {
        return data.getDia() + "/" + data.getMes() + "/" + data.getAno() + " Descricao: " + descricao + "\n";
    }
    
    @Override
    public int compareTo(Lembrete l) {
        if (this.data.getAno() != l.data.getAno()) {
        return Integer.compare(this.data.getAno(), l.data.getAno());
    } else if (this.data.getMes() != l.data.getMes()) {
        return Integer.compare(this.data.getMes(), l.data.getMes());
    } else if (this.data.getDia() != l.data.getDia()) {
        return Integer.compare(this.data.getDia(), l.data.getDia());
    }
        
//        int compareYear = this.data.getAno() - l.data.getAno();
//        if (compareYear != 0) {
//            return compareYear;
//        }
//        
//        int compareMonth = this.data.getMes() - l.data.getMes();
//        if (compareMonth != 0) {
//            return compareYear;
//        }
//        
//        int compareDay = this.data.getDia() - l.data.getDia();
//        if (compareDay != 0) {
//            return compareDay;
//        }
        
        return this.descricao.compareTo(l.descricao);
    }
}
