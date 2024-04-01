import java.util.Scanner;

public class ConvertidorBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número binario de 16 dígitos: ");
        String binario = scanner.nextLine();

        // Verificar si la longitud del número binario es 16
        if (binario.length() != 16) {
            System.out.println("El número binario debe tener 16 dígitos.");
            return;
        }

        // Convertir binario a decimal
        int decimal = Integer.parseInt(binario, 2);

        // Convertir decimal a octal
        String octal = Integer.toOctalString(decimal);

        // Convertir decimal a hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        // Mostrar resultados
        System.out.println("Número decimal: " + decimal);
        System.out.println("Número octal: " + octal);
        System.out.println("Número hexadecimal: " + hexadecimal);
    }
}