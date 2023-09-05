/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

/**
 *
 * @author augus
 */
public class Anotacao implements Comparable<Anotacao> {
    private String titulo;
    private String descricao;
    private Data data;

    public Anotacao(String titulo, String descricao, Data data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Data getData() {
        return data;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return titulo;
    }
    
    @Override
    public int compareTo(Anotacao a) {
        if (this.data.getAno() != a.data.getAno()) {
            return Integer.compare(this.data.getAno(), a.data.getAno());
        }
        
        if (this.data.getMes() != a.data.getMes()) {
            return Integer.compare(this.data.getMes(), a.data.getMes());
        }
        
        if (this.data.getDia() != a.data.getDia()) {
            return Integer.compare(this.data.getDia(), a.data.getDia());
        }
        
        return this.descricao.compareTo(a.titulo);
    }
    
    public int ordenarTitulo(Anotacao a) {
        if (this.titulo != a.titulo) {
            return this.titulo.compareTo(a.titulo);
        }
            
        if (this.data.getAno() != a.data.getAno()) {
            return Integer.compare(this.data.getAno(), a.data.getAno());
        }
        
        if (this.data.getMes() != a.data.getMes()) {
            return Integer.compare(this.data.getMes(), a.data.getMes());
        }
        
        return Integer.compare(this.data.getDia(), a.data.getDia());
    }
}
