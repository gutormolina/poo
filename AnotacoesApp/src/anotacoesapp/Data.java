/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotacoesapp;

/**
 *
 * @author augus
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private long tempo;

    public Data(int dia, int mes, int ano, long tempo) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.tempo = tempo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    public long getTempo() {
        return tempo;
    }
}
