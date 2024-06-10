package ex1;

public class Validacao {
    int nota1;
    int nota2;

    public Validacao(int nota1, int nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    boolean validacao() {
        return (0 <= this.nota1 && this.nota1 <= 10) && (0 <= this.nota2 && this.nota2 <= 10);
    }
}
