package exe3;
import java.text.NumberFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao Simulador de Empréstimo!");
        System.out.println("Por favor, insira seus dados abaixo para verificar a possibilidade de empréstimo.");

        System.out.print("Nome: ");
        String nome = input.next();

        System.out.print("Idade: ");
        int idade = input.nextInt();

        System.out.print("CPF: ");
        int cpf = input.nextInt();

        System.out.print("Salário: R$");
        double salario = input.nextDouble();

        System.out.print("Valor do empréstimo desejado: R$");
        double valorEmprestimo = input.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, cpf, salario, valorEmprestimo);
        Emprestimo emprestimo = new Emprestimo(pessoa);

        emprestimo.validarEmprestimo();
    }
}
