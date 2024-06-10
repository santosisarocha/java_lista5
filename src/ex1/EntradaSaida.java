package ex1;


public class EntradaSaida {
    String nome;

    public EntradaSaida(String nome) {
        this.nome = nome;
    }

    void receberPonderada(int nota1, int nota2, int peso1, int peso2) {
        System.out.println("Suas notas " + this.nome + " são: " + nota1 + " e " + nota2 + " e seus pesos são: " + peso1 + " e " + peso2);
    }

    void receberAritmetica(int nota1, int nota2) {
        System.out.println("Suas notas " + this.nome + " são: " + nota1 + " e " + nota2);
    }
}