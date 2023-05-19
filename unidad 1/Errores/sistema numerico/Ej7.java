
public class Ej7 {
    public static void main(String[] args) {
        String numeroHexadecimal = "ABCD";
        int decimal = Integer.parseInt(numeroHexadecimal, 16);

        System.out.println("El número decimal correspondiente es: " + decimal);
    }
}
