package exercicios.treinamento.estruturascondicionais;

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        
        System.out.print("Informe a sua idade: ");
        idade = teclado.nextInt();

        if (idade <= 0 || idade >= 120) {
            System.out.println("Idade inválida!");
        }else if (idade < 18) {
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
        }
        teclado.close();
    }
}
