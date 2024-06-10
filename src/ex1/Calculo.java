package ex1;

public class Calculo extends Validacao {
    int conta;

    public Calculo(int nota1, int nota2) {
        super(nota1, nota2);
    }

    void contaPonderada(int peso1, int peso2) {
        this.conta = ((this.nota1 * peso1) + (this.nota2 * peso2)) / (peso1 + peso2);
        System.out.println("A média ponderada ficou " + conta);
    }

    void contaAritmetica() {
        this.conta = (this.nota1 + this.nota2) / 2;
        System.out.println("A média aritmética ficou " + conta);
    }
}
