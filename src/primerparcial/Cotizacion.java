package primerparcial;

import entidades.Accesorio;
import entidades.Afinador;
import entidades.Guitarra;
import entidades.Instrumento;
import entidades.Pedido;
import fabricas.FabricaInstrumento;
import java.util.List;
import java.util.Random;
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
        
        FabricaInstrumento fabricaInstrumento = new FabricaInstrumento();
        
        //Usamos la fábrica
        Instrumento instrumento = fabricaInstrumento.getInstrumento("GUITARRA");
        
        pedido.ListaInstrumentos.add(instrumento);
        
        Random random = new Random();
        int rnd = random.nextInt(3 + 1) + 1;
        
        if(rnd == 1){
            Instrumento instRnd = fabricaInstrumento.getInstrumento("GUITARRA");
            //Uso de singleton
            Afinador afinador1 = Afinador.getInstancia();
            Afinador afinador2 = Afinador.getInstancia();
            Afinador afinador3 = Afinador.getInstancia();
            
            if(afinador1 == afinador2 && afinador2 == afinador3){
                System.out.println("No Singleton");
            }else{
                instRnd.ListaAccesorios.add(afinador1);
            }
            pedido.ListaInstrumentos.add(instRnd);
        }else if(rnd == 2){
            Instrumento instRnd = fabricaInstrumento.getInstrumento("BAJO");
            pedido.ListaInstrumentos.add(instRnd);
        }else{
            Instrumento instRnd = fabricaInstrumento.getInstrumento("PIANO");
            pedido.ListaInstrumentos.add(instRnd);
    }
        System.out.println("Total del pedido:");
        
        
        
        
        
        
        
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
            
            FabricaInstrumento fabrica = new FabricaInstrumento();
            
            for (int i = 0; i < cantidad; i++) {
                Instrumento instrumentoTemp = (Guitarra) fabrica.getInstrumento("GUITARRA");
                instrumento.Id = String.valueOf(i);
                instrumento.tipo = "eléctrica";
                instrumento.Precio = precioGuitarraElectrica;
                
                
                //instrumento.ListaAccesorios = InvocarAccesorios();
                
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
    
    /*public static List<Accesorio> InvocarAccesorios(){
        System.out.println("¿Desea agregar accesorios a este instrumento?");
        System.out.println("1) Sí");
        System.out.println("2) No");
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        opcion = leer.nextInt();
        
        if(opcion == 1){
            System.out.println("¿Qué accesorio desea agregar?");
            
        }else{
            
        }
    }*/
}
