package math.gabriel.maratonajava.intro;

public class Aula02 {
    public static void main(String[] args) {
        // Tipos primitivos: int, double, float, char, byte, short, long, boolean

        int tipoInteiroNome;
        char tipoCaractere;

        float tipoFloat = 2000F;
        double tipoDouble = 2000.0;

        // note que numeros com casas decimais sao considerados como double
        // float X = 2000.0 - esta errado!
        // double X = 2000D ou double X = 2000.0 estao corretos

        tipoInteiroNome = 10;
        System.out.println("Inteiro: " + tipoInteiroNome + " unidades.");
        System.out.printf("Inteiro: %d unidades.\n", tipoInteiroNome);
    }
}
