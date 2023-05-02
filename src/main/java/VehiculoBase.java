import Utilidades.Combustible;
import Utilidades.TipoModelo;

public class VehiculoBase {
    private Combustible Combustible; //private indica una encapsulación
    private TipoModelo Modelo;
    public String marca;
    private int numeroLlantas;

    public VehiculoBase(Combustible tipoCombustible) {
        this.Combustible = tipoCombustible;
    }

    public VehiculoBase(TipoModelo tipoModelo) {
        this.Modelo = tipoModelo;
    }

    public boolean arrancarApagarVehiculo(boolean encender) {
        System.out.println("El vehiculo se necesita encender");
        if (encender) {
            System.out.println("El vehiculo encendido");
            return true;
        } else {
            System.out.println("El vehiculo apagado");
            return false;
        }
    }

    public Combustible getCombustible() {
        return this.Combustible;
    }

    public TipoModelo getModelo() {
        return this.Modelo;
    }

    public int getLlantas() {
        return this.numeroLlantas;
    }

}
