/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l01e03;

/**
 *
 * @author aluno
 */
public class Televisao {
    private int canal;
    private int volume;
    private final int VOLUME_MAXIMO = 100;
    private final int N_CANAIS = 110;
    
    public void aumentarVolume() {
        if (volume < VOLUME_MAXIMO) {
            volume++;
        }
    }
    
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }
    
    public void aumentarCanal() {
        if (canal < N_CANAIS) {
            canal++;
        }
    }
    
    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        }
    }
    
    public void trocarCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal <= N_CANAIS) {
            canal = novoCanal;
            
        }
    }
    
    public void info() {
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

}