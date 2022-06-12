package entidades;

//Uso de herencia

import java.util.Random;

public class Afinador extends Accesorio{
    public int Precio;
    private static Afinador objeto = null;
    private Afinador(){}
    public static Afinador getInstancia(){
        if(objeto == null) {
            objeto = new Afinador();
            objeto.Id = "1";
            Random random = new Random();
            objeto.Precio = random.nextInt(10000 + 1000) + 1000;
        }
        return objeto;
    }
}
