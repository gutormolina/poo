/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private Data nascimento;
    private float altura;

    public Pessoa(String nome, Data nascimento, float altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " +
                this.nascimento.dia() + "/" +
                this.nascimento.mes() + "/" +
                this.nascimento.ano());
        System.out.println("Altura: " + this.altura);
    }
    
    public int calcularIdade(Data dataAtual) {
        int idade = dataAtual.ano() - this.nascimento.ano();
        if (dataAtual.mes() < this.nascimento.mes())
            idade--;
        else if (dataAtual.mes() == this.nascimento.mes() &&
                dataAtual.dia() < this.nascimento.dia())
            idade--;
        return idade;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Augusto");
        Data d = new Data(11, 8, 2000);
        p1.setNascimento(d);
        p1.setAltura(1.78f);
        
        p1.imprimir();
        
        System.out.println("Idade: " + p1.calcularIdade(new Data(27, 6, 2023)));
    }
    
}
