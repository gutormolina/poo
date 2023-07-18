/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1807;

/**
 *
 * @author aluno
 */
public class Ex1807 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario supervisor = new Supervisor(124, 6500);
        Funcionario caixa = new Caixa(4500);
        Funcionario e1 = new Estoquista(3500);
        
        System.out.println("Autentica supervisor:");
        if (((Supervisor) supervisor).autenticar(1234)) // typecasting (funcionario não possui método autenticar)
            System.out.println("Supervisor autenticado!");
        else 
            System.out.println("Senha incorreta!");
        
        System.out.println(supervisor);
        System.out.println(caixa);
        System.out.println(e1);
    }
    
}
