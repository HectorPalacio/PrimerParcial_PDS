package fabricas;

import entidades.Bajo;
import entidades.Guitarra;
import entidades.Instrumento;
import entidades.Piano;

public class FabricaInstrumento {
    public static Instrumento getInstrumento(String tipo){
        if(tipo.toUpperCase().equals("GUITARRA")){
            return new Guitarra();
        }else if(tipo.toUpperCase().equals("BAJO")){
            return new Bajo();
        }else{
            return new Piano();
        }
    }
}
