package exe2;


import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("seja bem vindo");
        System.out.println("digite os dados abaixo para ver o quanto que vc vai receber");

        System.out.println("Digite seu nome:");
        String nome = input.next();
        entradaSaida funcionario = new entradaSaida(nome);



        System.out.println("digite seu salario:");
        int salario = input.nextInt();
        funcionario.receberPonderada(salario);

        calculo conta = new calculo(salario);
        conta.Desconto(salario);
        System.out.println("digite quantas horas extras vc fez");
        int hora_extra = input.nextInt();
        conta.Acrescimo(salario, hora_extra);
        conta.Salario(salario);

        validacao verifificar = new validacao(salario);



    }

}
