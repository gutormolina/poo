/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LembretesApp;

/**
 *
 * @author aluno
 */
public class LembretesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BlocoDeLembretes bloco = new BlocoDeLembretes();
        
        Lembrete l1 = new Lembrete("Prova de POO", 30);
        bloco.inserir(l1);
        bloco.inserir(new Lembrete("Trabalho de POO15", 15));
        bloco.inserir(new Lembrete("Aula de coleções", 20));
        
        bloco.ordenar();
        
        Lembrete l = bloco.buscar(0);
        System.out.println("Lembrete:\n" + l);
        
        //Lembrete excluido = bloco.remover(0);
        //System.out.println("Lembrete excluído: \n" + excluido);
        
        System.out.println(bloco);
    }
    
}
