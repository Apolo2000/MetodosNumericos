
public class Error {
   public static void main(String[] args) {
        double valorReal = 0.51*(10^2);
        double valorAproximado = 0.50*(10^2);

        double errorAbsoluto = Math.abs(valorReal - valorAproximado);

        System.out.println("El error absoluto es: " + errorAbsoluto);
    }
}
