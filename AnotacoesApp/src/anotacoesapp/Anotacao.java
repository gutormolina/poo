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
    private Data getData;

    public Anotacao(String titulo, String descricao, Data data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.getData = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Data getData() {
        return getData;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(Data data) {
        this.getData = data;
    }
    
    @Override
    public String toString() {
        return titulo;
    }
    
    @Override
    public int compareTo(Anotacao a) {
        if (this.titulo != a.titulo) {
            return this.titulo.compareTo(a.titulo);
        }
            
        if (this.getData.getAno() != a.getData.getAno()) {
            return Integer.compare(this.getData.getAno(), a.getData.getAno());
        }
        
        if (this.getData.getMes() != a.getData.getMes()) {
            return Integer.compare(this.getData.getMes(), a.getData.getMes());
        }
        
        return Integer.compare(this.getData.getDia(), a.getData.getDia());
    }
}
