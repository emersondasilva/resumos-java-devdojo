package exercicios.treinamento.estruturasderepeticao;

public class PercorrerNumeros {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 30; numero++) {
            if (numero % 2 == 0) {
                continue;
            }
            if (numero > 25) {
                break;
            }
            System.out.print(numero + " ");
        }
    }
}
