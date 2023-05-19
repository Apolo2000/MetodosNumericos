
public class Ejercicio2 {
    public static void main(String[] args) {
        double numeroDecimal = 27.025;

        // Parte entera
        int parteEntera = (int) numeroDecimal;
        String binarioParteEntera = Integer.toBinaryString(parteEntera);

        // Parte decimal
        double parteDecimal = numeroDecimal - parteEntera;
        StringBuilder binarioParteDecimal = new StringBuilder();

        while (parteDecimal != 0) {
            parteDecimal *= 2;
            int bit = (int) parteDecimal;
            binarioParteDecimal.append(bit);
            parteDecimal -= bit;
        }

        // Combinar parte entera y parte decimal
        String resultadoBinario = binarioParteEntera + "." + binarioParteDecimal.toString();

        System.out.println("El número binario correspondiente es: " + resultadoBinario);
    }
}
