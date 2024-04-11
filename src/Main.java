import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usuario = "Enzo Golden";
        String tipoDeCuenta = "Ahorros";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("Bienvenido a Dog´s Bank su banco de confianza");
        System.out.println("\nNombre de usuario: " + usuario);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo en la cuenta es de: $"+saldo);

        String menu = """ 
                \nMarque la opción deseada
                1 - Consultar saldo
                2 - Retirar 
                3 - Depositar
                7 - Salir
                """;

        while(opcion != 7){
            System.out.println(menu);
            opcion = scanner.nextInt();
        }
    }
}