package exercicios.treinamento.estruturascondicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        String resultado = numero % 2 == 0 ? numero+" é PAR" : numero+" é ÍMPAR";
        System.out.println(resultado);
        teclado.close();
    }
}
