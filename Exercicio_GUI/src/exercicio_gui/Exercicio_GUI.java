/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_gui;

import java.awt.EventQueue;

/**
 *
 * @author augus
 */
public class Exercicio_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run() {
                MinhaJanela janela = new MinhaJanela();
            }
        });
    }
}
