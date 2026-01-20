package exercicios.aula26;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo
        String dia = "Sábado";
        switch (dia) {
            case "Domingo":
            case "Sábado":
                System.out.println("Final de semana");
                break;
            case "Segunda-feira":
            case "Terça-feira":
            case "Quarta-feira":
            case "Quinta-feira":
            case "Sexta-feira":
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
