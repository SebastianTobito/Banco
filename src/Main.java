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
            if(opcion == 1){
                System.out.println("Su saldo es de: $"+saldo);
            }else if(opcion == 2){
                System.out.println("Cuánto quiere sacar");
                double retiro = scanner.nextDouble();
                if (retiro>saldo){
                    System.out.println("No posee esa cantidad en su cuenta, su retiro no puede ser efectuado");
                }else {
                    saldo = saldo - retiro;
                    System.out.println("Su nuevo saldo es: $" + saldo);
                }
            }else if(opcion == 3){
                System.out.println("Cuánto quiere depositar");
                double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Su nuevo saldo es: $" + saldo);
            }else if(opcion == 7){
                System.out.println("Hasta luego que tenga un buen día");
            } else{
                System.out.println("Opción no valida");
            }
        }
    }
}