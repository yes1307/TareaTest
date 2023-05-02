import Utilidades.TipoModelo;

public class CuatroRuedas extends VehiculoBase {

    public CuatroRuedas(Utilidades.TipoModelo tipoModelo) {
        super(tipoModelo);
    }

    public TipoModelo vehiculoTipo(int numeroLlantas) {

        if (numeroLlantas == 0) {
            return TipoModelo.BARCO;
        }
        if (numeroLlantas == 4) {
            return TipoModelo.AUTO;
        }
        if (numeroLlantas >= 12 && numeroLlantas <= 16) {
            return TipoModelo.AVION;
        }
        if (numeroLlantas >= 18) {
            return TipoModelo.TREN;
        }
        return null;
    }
}