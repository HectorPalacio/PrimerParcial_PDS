package fabricas;

import entidades.Accesorio;
import entidades.Calcomania;

public class FabricaCalcomania {
    public Accesorio getCalcomania(){
        return new Calcomania();
    }
}
