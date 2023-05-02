import Utilidades.TipoModelo;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VehiculoMartimoTest {
    @Test
    public void testTransporteMaritimo() {
        VehiculoMaritimo vehmodelo1 = new VehiculoMaritimo(TipoModelo.YATE);
        Assert.assertEquals(vehmodelo1.getModelo(), TipoModelo.YATE);
    }

    @Test
    public void tipoMaritimoTest() {
        VehiculoMaritimo vehmodelo1 = new VehiculoMaritimo(TipoModelo.YATE);
        System.out.println(vehmodelo1.getModelo());
        boolean modeloMaritimo = vehmodelo1.traporteMaritimo("YATE");
        System.out.println(modeloMaritimo);
        Assert.assertEquals(modeloMaritimo, true);
    }

    @Test
    public void tipoMaritimoFalseTest() {
        VehiculoMaritimo vehmodelo1 = new VehiculoMaritimo(TipoModelo.YATE);
        boolean modeloMaritimo = vehmodelo1.traporteMaritimo("AUTO");
        boolean modeloNoMaritimo = false;
        System.out.println(modeloMaritimo + "," + modeloNoMaritimo);
        Assert.assertFalse(modeloMaritimo);
    }
}
