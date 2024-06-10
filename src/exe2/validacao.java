package exe2;

public class validacao
{
    public validacao(int salario) {
        if(salario>500&salario<30000){
            System.out.println("seu salario esta entre 500 a 30000");
        }
        else{
            System.out.println("seu salario nao esta validado ");
        }
    }
}
