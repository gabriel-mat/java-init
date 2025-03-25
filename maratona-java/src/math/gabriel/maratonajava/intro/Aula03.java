package math.gabriel.maratonajava.intro;

public class Aula03 {
    public static void main(String[] args) {
        // CASTING

        float tipoFloat = (float) 2500.0;
        float tipoFloat2 = (float) 2500D;

        // Podemos converter tipos: note que 2500.0 e 2500D sao do tipo double,
        // mas sao convertidos -explicitamente- em float.

        int tipoInt = (int) 100000000000L;

        // nao e uma boa pratica, use o tipo adequado.
    }
}
