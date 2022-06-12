package primerparcial;

import entidades.Guitarra;
import entidades.Instrumento;
import entidades.Pedido;
import fabricas.FabricaInstrumento;
import java.util.Scanner;
import static primerparcial.PrimerParcial.Menu;

public class Cotizacion {
    
    public static Pedido pedido;
    
    public Cotizacion(){
        pedido = new Pedido();
    }
    
    public static void HacerCotizacion(){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("Bienvenido al sistema de cotización");
        System.out.println("Escoga una opción:");
        System.out.println("1) Hacer pedido");
        System.out.println("2) Finalizar pedido");
        
        opcion = leer.nextInt();
        
        if(opcion == 1){
            RealizarPedido();
        }else if(opcion == 2){
            FinalizarPedido();
        }else{
            HacerCotizacion();
        }
    }
    
    public static void RealizarPedido(){
        System.out.println("¿Qué instrumentos busca?");
        System.out.println("1) Guitarra");
        System.out.println("2) Bajo");
        System.out.println("3) Piano");
        System.out.println("4) Volver");
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        if(opcion == 1){
            desplegarGuitarras();
        }else if(opcion == 2){
            desplegarBajos();
        }else if(opcion == 3){
            desplegarPianos();
        }else if(opcion == 4){
            HacerCotizacion();
        }else{
            RealizarPedido();
        }
    }
    
    public static void desplegarGuitarras(){
        
        int precioGuitarraElectrica = 2500;
        int precioGuitarraAcustica = 2000;
        
        System.out.println("¿Qué clase de guitarra busca?");
        System.out.println("1) Guitarra eléctrica");
        System.out.println("2) Guitarra acústica");
        System.out.println("3) Volver");
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        Scanner leerCantidad = new Scanner(System.in);
        int cantidad = 0;
        
        if(opcion == 1){
            System.out.println("Información de guitarra eléctrica: ");
            System.out.println("Precio: " + precioGuitarraElectrica);
            System.out.println("");
            System.out.println("¿Qué cantidad de guitarras eléctricas desea?");
            
            cantidad = leerCantidad.nextInt();
            
            for (int i = 0; i < cantidad; i++) {
                Guitarra instrumento = (Guitarra) FabricaInstrumento.getInstrumento("GUITARRA");
                instrumento.Id = String.valueOf(i);
                instrumento.tipo = "eléctrica";
                instrumento.Precio = precioGuitarraElectrica;
                
                pedido.ListaInstrumentos.add(instrumento);
            }
            
        }else if(opcion == 2){
            System.out.println("Información de guitarra acústica: ");
            System.out.println("Precio: " + precioGuitarraAcustica);
        }else if(opcion == 3){
            RealizarPedido();
        }else{
            desplegarGuitarras();
        }
    }
    
    public static void desplegarBajos(){
    
    }
    
    public static void desplegarPianos(){
        
    }
    
    public static void FinalizarPedido(){
        
    }
}
