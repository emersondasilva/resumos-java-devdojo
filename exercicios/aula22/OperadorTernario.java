package exercicios.aula22;

public class OperadorTernario {
    public static void main(String[] args) {
        //Doar se salário > 5000
        double salario = 6000;
        //(condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }
}
