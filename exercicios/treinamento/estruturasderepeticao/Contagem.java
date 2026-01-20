package exercicios.treinamento.estruturasderepeticao;

public class Contagem {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 5 == 0) {
                continue;
            }
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
        }
    }
}
