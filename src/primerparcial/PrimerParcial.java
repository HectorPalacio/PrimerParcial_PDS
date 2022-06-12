package primerparcial;

import entidades.Cliente;
import java.util.Scanner;
import static primerparcial.Cotizacion.RealizarPedido;
import static primerparcial.OrdenDeCompra.generarOrdenDeCompra;

public class PrimerParcial {
    public static Cliente cliente;
    public static void main(String[] args) {
        cliente = new Cliente();
        
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
                generarOrdenDeCompra(cliente);
            }
            case 3 -> {
                RealizarPedido();
            }
            default -> {
                //F
            }
        }
    }
}
