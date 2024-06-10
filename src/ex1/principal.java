package ex1;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo à calculadora de média. Digite o que você quer: 1 - Média aritmética, 2 - Média ponderada");
        int mediaDesejada = input.nextInt();

        System.out.println("Digite seu nome:");
        String nome = input.next();
        EntradaSaida conta = new EntradaSaida(nome);

        System.out.println("Digite uma nota");
        int n1 = input.nextInt();
        System.out.println("Digite outra nota");
        int n2 = input.nextInt();

        Validacao validacao = new Validacao(n1, n2);
        if (validacao.validacao()) {
            if (mediaDesejada == 1) {
                conta.receberAritmetica(n1, n2);
                Calculo result = new Calculo(n1, n2);
                result.contaAritmetica();
                Resultado aprovacao = new Resultado(n1, n2);
                aprovacao.result();
            } else if (mediaDesejada == 2) {
                System.out.println("Digite o peso da primeira nota");
                int peso1 = input.nextInt();
                System.out.println("Digite o peso da segunda nota");
                int peso2 = input.nextInt();
                conta.receberPonderada(n1, n2, peso1, peso2);
                Calculo result = new Calculo(n1, n2);
                result.contaPonderada(peso1, peso2);
                Resultado aprovacao = new Resultado(n1, n2);
                aprovacao.result();
            } else {
                System.out.println("Você digitou uma opção inválida.");
            }
        } else {
            System.out.println("Notas inválidas.");
        }
    }
}