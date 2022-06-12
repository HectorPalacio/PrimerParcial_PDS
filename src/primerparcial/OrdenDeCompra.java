package primerparcial;

import entidades.Afinador;
import entidades.Cliente;
import entidades.Instrumento;
import fabricas.FabricaInstrumento;
import java.util.Random;

public class OrdenDeCompra {
    public static void generarOrdenDeCompra(Cliente cliente){
        FabricaInstrumento fabricaInstrumento = new FabricaInstrumento();
        //Usamos la fábrica y abstracción
        Instrumento instrumento = fabricaInstrumento.getInstrumento("GUITARRA");
        Random random = new Random();
        int rnd = random.nextInt(3 + 1) + 1;
        
        Instrumento instRnd;
        Afinador afinador;
        if(rnd == 1){
            instRnd = fabricaInstrumento.getInstrumento("GUITARRA");
            //Uso de singleton
            Afinador afinador1 = Afinador.getInstancia();
            Afinador afinador2 = Afinador.getInstancia();
            Afinador afinador3 = Afinador.getInstancia();
            
            afinador = afinador1;
            
            if(afinador1 == afinador2 && afinador2 == afinador3){
                System.out.println(afinador1.Precio);    
                System.out.println("Sí Singleton");
                
            }else{
                System.out.println(afinador1.Precio);
                System.out.println(afinador2.Precio);
                System.out.println(afinador3.Precio);
                System.out.println("No Singleton");
            }
        }else if(rnd == 2){
            instRnd = fabricaInstrumento.getInstrumento("BAJO");
            //Uso de singleton
            Afinador afinador1 = Afinador.getInstancia();
            Afinador afinador2 = Afinador.getInstancia();
            Afinador afinador3 = Afinador.getInstancia();
            
            afinador = afinador1;
            
            if(afinador1 == afinador2 && afinador2 == afinador3){
                System.out.println(afinador1.Precio);    
                System.out.println("Sí Singleton");
                
            }else{
                System.out.println(afinador1.Precio);
                System.out.println(afinador2.Precio);
                System.out.println(afinador3.Precio);
                System.out.println("No Singleton");
            }
        }else{
            instRnd = fabricaInstrumento.getInstrumento("PIANO");
            //Uso de singleton
            Afinador afinador1 = Afinador.getInstancia();
            Afinador afinador2 = Afinador.getInstancia();
            Afinador afinador3 = Afinador.getInstancia();
            
            afinador = afinador1;
            
            if(afinador1 == afinador2 && afinador2 == afinador3){
                System.out.println(afinador1.Precio);    
                System.out.println("Sí Singleton");
                
            }else{
                System.out.println(afinador1.Precio);
                System.out.println(afinador2.Precio);
                System.out.println(afinador3.Precio);
                System.out.println("No Singleton");
            }
    }
        System.out.println("Total del pedido:");
        System.out.println("Precio producto: " + instrumento.Precio);
        System.out.println("Precio producto 2: " + instRnd.Precio);
        System.out.println("Precio accesorio producto 2: " + afinador.Precio);
        
        System.out.println("Total del pedido:");
        int costoPedido = instrumento.Precio + instRnd.Precio + afinador.Precio;
        System.out.println(costoPedido);
        
        System.out.println("Factura");
        System.out.println("Identificación cliente: " + cliente.Id);
        System.out.println("Nombre cliente: " + cliente.Nombre);
        System.out.println("Valor de la factura: " + costoPedido);
    }
}
