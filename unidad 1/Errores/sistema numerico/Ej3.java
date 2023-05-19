
public class Ej3 {
     public static void main(String[] args) {
        String numeroOctal = "42";
        int decimal = Integer.parseInt(numeroOctal, 8);

        System.out.println("El número decimal correspondiente es: " + decimal);
    }
}
