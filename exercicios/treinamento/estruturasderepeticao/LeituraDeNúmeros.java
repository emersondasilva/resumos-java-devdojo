package exercicios.treinamento.estruturasderepeticao;

import java.util.Scanner;

public class LeituraDeNúmeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int totalDeNumerosPositivos = 0;

        System.out.print("Digite um número positivo (negativo para sair): ");
        numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Opção inválida!");
        }else{
            while (numero >= 0) {
                totalDeNumerosPositivos++;
                System.out.print("Digite um número positivo (negativo para sair): ");
                numero = teclado.nextInt();
            }
        }
        System.out.println("Total de números positivos digitados: " + totalDeNumerosPositivos);
        teclado.close();
    }
}
