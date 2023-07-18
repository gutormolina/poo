/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1807;

/**
 *
 * @author aluno
 */
public class AppMeuMercado {
    Funcionario[] ListaFuncionarios;
    Item[] ListaItens;

    public AppMeuMercado(Funcionario[] ListaFuncionarios, Item[] ListaItens) {
        this.ListaFuncionarios = ListaFuncionarios;
        this.ListaItens = ListaItens;
    }
    
    private void processarCompra(Caixa caixa, Item item) {
        caixa.inserirItem(0);
        caixa.removerItem(0);
        caixa.solicitarPagamento();
        caixa.encerrarConta();
    }
}
