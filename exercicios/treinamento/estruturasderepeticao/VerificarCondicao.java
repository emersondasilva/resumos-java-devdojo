package exercicios.treinamento.estruturasderepeticao;

import java.util.Scanner;

public class VerificarCondicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número entre 10 e 20: ");
            numero = teclado.nextInt();
        } while (numero < 10 || numero > 20);
        teclado.close();
    }
}
