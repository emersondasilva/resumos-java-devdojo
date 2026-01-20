package exercicios.treinamento.estruturascondicionais;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero01, numero02;
        char operador;

        System.out.print("Digite o primeiro número: ");
        numero01 = teclado.nextDouble();

        System.out.print("Digite o operador [+ - * /]: ");
        operador = teclado.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        numero02 = teclado.nextDouble();

        switch (operador) {
            case '+':
                System.out.println(numero01+numero02);
                break;
            case '-':
                System.out.println(numero01-numero02);
                break;
            case '*':
                System.out.println(numero01*numero02);
                break;
            case '/':
                if (numero02 != 0) {
                    System.out.println(numero01/numero02);
                }else{
                    System.out.println("Operação inválida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        teclado.close();
    }
}
