
public class ErrorRelativo {
    public static void main(String[] args) {
        double valorReal = 0.51*(10^2);
        double valorAproximado = 0.50*(10^2);

        double errorAbsolutoRelativo = Math.abs((valorReal - valorAproximado)/valorReal);

        System.out.println("El error relativo es: " + errorAbsolutoRelativo);
    }
}
