package exercicios.treinamento.estruturascondicionais;

import java.util.Scanner;

public class TipoDeDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String diaDaSemana;

        System.out.print("Informe um dia da semana: ");
        diaDaSemana = teclado.nextLine().toLowerCase();

        switch (diaDaSemana) {
            case "domingo":
            case "sabado":
                System.out.println("Final de semana");
                break;
            case "segunda-feira":
            case "terça-feira":
            case "quarta-feira":
            case "quinta-feira":
            case "sexta-feira":
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        teclado.close();
    }
}
