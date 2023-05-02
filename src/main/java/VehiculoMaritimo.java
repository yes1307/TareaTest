public class VehiculoMaritimo extends VehiculoBase {

    public VehiculoMaritimo(Utilidades.TipoModelo tipoModelo) {
        super(tipoModelo);
    }

    public boolean traporteMaritimo(String modeloMaritimo) {
        if (modeloMaritimo == "YATE" || modeloMaritimo == "BARCO") {
            System.out.println("Es tranporte maritimo");
            return true;
        } else {
            System.out.println("No es tranporte maritimo");
            return false;
        }
    }

}
