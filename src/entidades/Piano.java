package entidades;

import java.util.List;

public class Piano implements Instrumento{
    public String Id;
    public List<Accesorio> ListaAccesorios;
    public String tipo;
    public int Precio;
    
    public void afinar(){}
    
    public void interpretar(){}
}
