/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1807;

/**
 *
 * @author aluno
 */
public abstract class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Salario: " + this.salario;
    }
}
