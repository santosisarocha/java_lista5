package exe3;

public class Emprestimo {Pessoa pessoa;

    public Emprestimo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void validarEmprestimo() {
        double parcela = calcularParcela();
        if (parcela > 0) {
            System.out.println("Olá, " + pessoa.nome + "! Você pode fazer o empréstimo.");
            System.out.println("O valor de cada parcela será de: R$" + parcela);
            System.out.println("O valor total a ser pago será de: R$" + parcela * 24);
        } else {
            System.out.println("Olá, " + pessoa.nome + "! Infelizmente, você não pode fazer o empréstimo.");
        }
    }

    private double calcularParcela() {
        double valorTotalEmprestimo = pessoa.valorEmprestimo * 1.35;
        double valorParcela = valorTotalEmprestimo / 24;
        double percentualSalario = valorParcela / pessoa.salario * 100;

        if (valorTotalEmprestimo <= 200_000 && percentualSalario <= 15) {
            return valorParcela;
        } else {
            return -1;
        }
    }
}
