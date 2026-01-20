package exercicios.aula30;

public class EstruturasDeRepeticao {
    // Dado o valor de um carro, descubra em qunatas vezes ele pode ser parcelado
    // Condição valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
