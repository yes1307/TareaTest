import Utilidades.TipoPasajeroEnum;

import java.util.HashMap;
import java.util.Map;

public class Pasajero implements ITipoPasajero, IDatosPersonalesPasajeros {//LLama para implementar 2 interfacez
    Map<Integer, String> tablaPasajeros = new HashMap<>();
    private Integer idPasajero;
    private String nombrePasajero;
    private TipoPasajeroEnum tipoPasajeroEnum;


    public Pasajero() {
        tablaPasajeros.put(1, "Pablo Gutierrez");
        tablaPasajeros.put(5, "Ester Gonzalez Gutierrez");
        tablaPasajeros.put(10, "Martha Debayle");
    }

    @Override
    public String getPasajeroNombre() {
        return this.nombrePasajero;
    }

    @Override
    public void SetPasajeroNombre(String pasajeroNombre) {
        this.nombrePasajero = pasajeroNombre;
    }

    @Override
    public TipoPasajeroEnum getTipoPasajero() {
        return this.tipoPasajeroEnum;
    }

    @Override
    public void setTipoPasajero(TipoPasajeroEnum tipoPasajero) {
        this.tipoPasajeroEnum = tipoPasajero;
    }
}
