/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1807;

/**
 *
 * @author aluno
 */
public class Estoquista extends Funcionario{

    public Estoquista(double salario) {
        super(salario);
    }
    
    @Override
    public String toString() {
        return "Estoquista -> " + super.toString();
    }
}
