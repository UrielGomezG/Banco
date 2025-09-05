import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(0.0);
        int opcion = 0;

        System.out.println("Bienvenido al banco de tepito");
        System.out.println("---MENU---");
        System.out.println("1. Depositar\n2. Retirar\n3. Consultar saldo\n4. Salir");
        while (opcion != 4) {
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cuanto quieres depositar: ");
                    double cantidadDepositar = sc.nextDouble();
                    cuenta.depositar(cantidadDepositar);
                    System.out.println("Salio bien");
                    break;
                case 2:
                    System.out.print("Cuanto quieres sacar: ");
                    double cantidadRetirar = sc.nextDouble();
                    if (cantidadRetirar > cuenta.getSaldo()) {
                        System.out.println("no tienes dinero pa");
                    } else {
                        cuenta.retirar(cantidadRetirar);
                        System.out.println("Salio bien");
                    }
                    break;
                case 3:
                    cuenta.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Gracias por usar el banco de tepito");
                    break;
                default:
                    System.out.println("Opcion no valida");
            
        }
    }
 }
}
