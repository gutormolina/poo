/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elevador;

/**
 *
 * @author aluno
 */
public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidade;
    private int qtdPessoas;
    
    public void inicializa(int capacidade, int totalDeAndares) {
        this.capacidade = capacidade;
        this.totalDeAndares = totalDeAndares;
        this.andarAtual = 0; // Terreo
        this.qtdPessoas = 0; // Vazio
    }
    
    public void entra() {
        if (qtdPessoas < capacidade) {
            qtdPessoas++;
        }
    }
    
    public void sai() {
        if (qtdPessoas > 0) {
            qtdPessoas--;
        }
    }
    
    public void sobe() {
        if (andarAtual < totalDeAndares) {
            andarAtual++;
        }
    }
    
    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }
    
    public void imprimir() {
        System.out.println("Andar atual: " +
                            this.andarAtual +
                            "(" + this.totalDeAndares + ")");
        System.out.println("Quantidade de Pessoas: " +
                            this.qtdPessoas +
                            "(" + this.capacidade + ")");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elevador e = new Elevador();
        e.inicializa(6, 10);
        e.imprimir();
        e.entra();
        e.imprimir();
        e.entra();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sai();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sobe();
        e.imprimir();
        e.sai();
        e.imprimir();
        e.desce();
        e.imprimir();
    }
    
}
