package entidades;

public class Afinador extends Accesorio{
    public int Precio;
    private static Afinador objeto = null;
    private Afinador(){}
    public static Afinador getInstancia(){
        if(objeto == null) {
            objeto = new Afinador();
        }
        return objeto;
    }
}
