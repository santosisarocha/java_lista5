package ex1;

public class Resultado extends Validacao {

    public Resultado(int nota1, int nota2) {
        super(nota1, nota2);
    }

    void result() {
        int media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}
