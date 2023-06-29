/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import java.util.Scanner;

/**
 * Primeiro exemplo da aula de POO.
 * @author aluno
 */
public class Principal {

    /**
     * Este é o método principal.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 12;
        float f;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor float: ");
        f = sc.nextFloat();
        
        System.out.println("Olá mundo! i = " + (i + 50) + " | f = " + f);
        
        // Uso da classe Comanda
        Comanda c = new Comanda();
        c.nomeDoAtendente = "Joao";
        c.pesoComida = 0.5f;
        c.pesoSobremesa = 0.2f;
        c.refrigeranteLata = 1;
        c.imprimir();
    }
    
}
