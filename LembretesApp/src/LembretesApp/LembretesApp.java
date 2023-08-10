/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LembretesApp;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int dia = 0, mes = 0, ano = 0;
        Data data = new Data(dia, mes, ano);

        int op = -1;
        while (op != 0) {
            op = menu();
            switch (op) {
                case 1:
                    System.out.println("Insira a descricao: ");
                    String desc = sc.nextLine();
                    System.out.println("Insira o dia: ");
                    dia = sc.nextInt();
                    System.out.println("Insira o mes: ");
                    mes = sc.nextInt();
                    System.out.println("Insira o ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    data = new Data(dia, mes, ano);
                    Lembrete lemb = new Lembrete(desc, data);
                    bloco.inserir(lemb);
                    break;
                
                case 2:
                    System.out.println("Insira o indice: ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    bloco.remover(i);
                    break;
                    
                case 3: // Precisa poder retornar mais de um lembrete
                    System.out.println("Insira a substring: ");
                    String s = sc.nextLine();
                    bloco.buscar(s);
                    break;
                    
                case 4: // Precisa poder retornar mais de um lembrete
                    System.out.println("Insira o mes: ");
                    mes = sc.nextInt();
                    System.out.println("Insira o ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    bloco.buscar(mes, ano);
                    break;
                    
                case 5: // Precisa poder retornar mais de um lembrete
                    System.out.println("Insira o dia: ");
                    dia = sc.nextInt();
                    System.out.println("Insira o mes: ");
                    mes = sc.nextInt();
                    System.out.println("Insira o ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    data = new Data(dia, mes, ano);
                    bloco.buscar(data);
                    break;
                    
                case 6:
                    bloco.ordenar();
                    System.out.println(bloco);
                    break;
                    
                case 7: // Filtrar e criar novo bloco
                    System.out.println("Insira o mes: ");
                    mes = sc.nextInt();
                    System.out.println("Insira o ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    bloco.ordenar();
                    System.out.println(bloco.buscar(mes, ano));
                    break;
                    
                case 8: // Filtrar e criar novo bloco
                    System.out.println("Insira o dia: ");
                    dia = sc.nextInt();
                    System.out.println("Insira o mes: ");
                    mes = sc.nextInt();
                    System.out.println("Insira o ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    data = new Data(dia, mes, ano);
                    bloco.ordenar();
                    System.out.println(bloco.buscar(data));
                    break;
            }
        }
        sc.close();
    }
    
    public static int menu() {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bem vindo ao LembretesAPP");
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Inserir lembrete");
            System.out.println("2 - Excluir lembrete");
            System.out.println("3 - Buscar substring");
            System.out.println("4 - Buscar mes");
            System.out.println("5 - Buscar dia");
            System.out.println("6 - Imprimir lembretes (todos)");
            System.out.println("7 - Imprimir lembretes (mes)");
            System.out.println("8 - Imprimir lembretes (dia)");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();
        } while (op < 0 || op > 8);
        
        return op;
    }
}
