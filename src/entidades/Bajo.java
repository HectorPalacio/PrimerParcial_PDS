package entidades;

//Uso de herencia para utilizar la abstracción también
public class Bajo extends Instrumento{
    
    public Bajo(){
        Precio = 5000;
    }
    
    @Override
    public void afinar(){}
    @Override
    public void interpretar(){}
}
