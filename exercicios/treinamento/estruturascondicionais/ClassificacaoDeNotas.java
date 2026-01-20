package exercicios.treinamento.estruturascondicionais;

import java.util.Scanner;

public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota01, nota02;
        double mediaFinal;

        System.out.print("Informe a primeira nota: ");
        nota01 = teclado.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota02 = teclado.nextDouble();

        mediaFinal = (nota01 + nota02) / 2;

        if (mediaFinal >= 7) {
            System.out.println("Aluno aprovado");
        }else if (mediaFinal >= 5 && mediaFinal <= 6.9) {
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
        teclado.close();
    }
}
