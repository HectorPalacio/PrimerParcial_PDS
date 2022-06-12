package entidades;

//Uso de herencia para utilizar la abstracción también
public class Guitarra extends Instrumento {
    
    public Guitarra(){
        Precio = 2500;
    }
    
    @Override
    public void afinar(){}
    @Override
    public void interpretar(){}
}
