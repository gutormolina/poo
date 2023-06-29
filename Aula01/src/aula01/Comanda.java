/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author aluno
 */
public class Comanda {
    String nomeDoAtendente;
    float pesoComida;
    float pesoSobremesa;
    int refrigerante600;
    int refrigeranteLata;
    
    public float totaliza() {
        float valor = 0;
        valor += pesoComida * 50;
        valor += pesoSobremesa * 70;
        valor += refrigerante600 * 7;
        valor += refrigeranteLata * 5;
        return valor;
    }
    
    public void imprimir() {
        System.out.println("Nome do Atendente: " + nomeDoAtendente);
        System.out.println("Peso da Comida: " + pesoComida);
        System.out.println("Peso da Sobremesa: " + pesoSobremesa);
        System.out.println("N. Refri 600: " + refrigerante600);
        System.out.println("N. Refri Lata: " + refrigeranteLata);
        System.out.println("Total: " + totaliza());
    }
}
 