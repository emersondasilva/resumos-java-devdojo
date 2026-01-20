package exercicios.treinamento.estruturasderepeticao;

public class CalcularProduto {
    public static void main(String[] args) {
        boolean parar = false;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j >= 12) {
                    System.out.println("Primeiro par encontrado: i = " + i + ", j = " + j);
                    parar = true;
                    break;
                }
            }
            if (parar) {
                break;
            }
        }
        System.out.println("Laços encerrados.");
    }
}
