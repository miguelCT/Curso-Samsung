package Patrones.FlyWeight.ejemplo_FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class Factoria {
    private final Map<String, PesoLigeroConcreto> mapa = new HashMap<String, PesoLigeroConcreto>();

    public PesoLigeroConcreto get(String clave) {
        if (mapa.containsKey(clave)) {
            return mapa.get(clave);
        }
        //Construcci�n perezosa
        PesoLigeroConcreto pl = new PesoLigeroConcreto(clave);
        mapa.put(clave, pl);
        return pl;
    }
}