package exe2;

public class calculo {
    double containss;
    double contairpf;
    double contasaude;
    double horaextra;

    public calculo(int salario) {
        super();
    }

    void Desconto(int salario) {
        this.containss = (salario * 0.20);
        this.contairpf = (salario * 0.10);
        this.contasaude = (salario * 0.05);
        System.out.println("desconto inss: " + containss);
        System.out.println("desconto irpf: " + contairpf);
        System.out.println("desconto saude: " + contasaude );
    }
    void Acrescimo(int salario, int hora_extra) {
        this.horaextra = hora_extra + (salario*0.5);
        System.out.println("o quanto que vc vai receber no acrescimo" + hora_extra);
    }


    void Salario(int salario) {
        double salario_desconto = (salario - (containss + contairpf + contasaude)) + horaextra;
        System.out.println("o seu salario total " + salario_desconto);
    }
}
