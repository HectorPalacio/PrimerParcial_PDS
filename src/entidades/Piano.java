package entidades;

//Uso de herencia para utilizar la abstracción también
public class Piano extends Instrumento{
    
    public Piano(){
        Precio = 10000;
    }
    
    @Override
    public void afinar(){}
    @Override
    public void interpretar(){}
}
