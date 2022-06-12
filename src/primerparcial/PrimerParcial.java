package primerparcial;

import entidades.Cliente;
import java.util.Scanner;

public class PrimerParcial {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        Scanner leerId = new Scanner(System.in);
        Scanner leerNombre = new Scanner(System.in);
        
        System.out.println("Introduzca su identificación:");
        cliente.Id = leerId.nextLine();
        System.out.println("Introduzca su nombre:");
        cliente.Nombre = leerNombre.nextLine();
        System.out.println("Bienvenido, " + cliente.Nombre);
        
        Menu();
    }
    
    public static void Menu(){
        int opcion;
        System.out.println("Escoge una opción: ");
        System.out.println("1) Hacer cotización");
        System.out.println("2) Pagar orden de compra");
        System.out.println("3) Realizar pedido");
        
        Scanner leerOpcion = new Scanner(System.in);
        
        opcion = leerOpcion.nextInt();
        
        switch (opcion) {
            case 1 -> {
                Cotizacion.HacerCotizacion();
            }
            case 2 -> {
                //Pagar orden de compra
            }
            case 3 -> {
                //Realizar pedido
            }
            default -> {
                //F
            }
        }
    }
}
