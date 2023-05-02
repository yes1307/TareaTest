import Utilidades.TipoPasajeroEnum;

public interface ITipoPasajero {
    public TipoPasajeroEnum getTipoPasajero(); //Lo que me va a regresar son los valores del Enum Tipo Pasajero

    public void setTipoPasajero(TipoPasajeroEnum tipoPasajero);
}
