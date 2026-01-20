package exercicios.aula10;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println("Oi meu nome é "+nome);
        System.out.println("Número "+numeroGrande);
        System.out.println("R$ "+salarioDouble);
        System.out.println("R$ "+salarioFloat);
        System.out.println("A idade é "+idadeByte+" anos");
        System.out.println("A idade é "+idadeShort+" anos");
        System.out.println("Condição "+verdadeiro);
        System.out.println("Condição "+falso);
        System.out.println("Caractere "+caractere);
    }
}
