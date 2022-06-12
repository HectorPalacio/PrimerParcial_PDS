package entidades;

public class Calcomania extends Accesorio{
    public int Precio;
    private static Calcomania objeto = null;
    private Calcomania(){}
    public static Calcomania getInstancia(){
        if(objeto == null) {
            objeto = new Calcomania();
        }
        return objeto;
    }
}