/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l01e03;

/**
 *
 * @author aluno
 */
public class ControleRemoto {
    private Televisao tv;
    
    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }
    
    public void aumentarVolume() {
        tv.aumentarVolume();
    }
    
    public void diminuirVolume() {
        tv.diminuirVolume();
    }
    
    public void aumentarCanal() {
        tv.aumentarCanal();
    }
    
    public void diminuirCanal() {
        tv.diminuirCanal();
    }
    
    public void trocarCanal(int canal) {
        tv.trocarCanal(canal);
    }
    
    public void info() {
        tv.info();
    }
    
}