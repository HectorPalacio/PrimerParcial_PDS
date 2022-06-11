package singleton;

import entidades.Afinador;

public class SingletonAfinador {
    private static Afinador objeto = null;
    private SingletonAfinador(){}
    public static Afinador getInstancia(){
        if(objeto == null){
            objeto = new Afinador();
        }
        return objeto;
    }
}
