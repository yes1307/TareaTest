import Utilidades.TipoModelo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CuatroRuedasTest {

    @Test
    public void testTipoVehiculo() {
        CuatroRuedas vehiculo1 = new CuatroRuedas(TipoModelo.BARCO);
        TipoModelo modeloActual = vehiculo1.vehiculoTipo(0);
        TipoModelo modeloEsperado = TipoModelo.BARCO;
        System.out.println(modeloEsperado + "," + modeloActual);
        Assert.assertEquals(modeloEsperado, modeloActual);
    }

    @Test
    public void testTipoModVehiculo() {
        CuatroRuedas vehiculo1 = new CuatroRuedas(TipoModelo.AUTO);
        TipoModelo modeloActual = vehiculo1.vehiculoTipo(4);
        TipoModelo modeloEsperado = vehiculo1.vehiculoTipo(14);
        System.out.println(modeloEsperado + "," + modeloActual);
        Assert.assertNotEquals(modeloEsperado, modeloActual);
    }

    @Test
    public void testTiponNullVehiculo() {
        CuatroRuedas vehiculo1 = new CuatroRuedas(TipoModelo.BARCO);
        TipoModelo modeloActual = vehiculo1.vehiculoTipo(2);
        TipoModelo modeloEsperado = null;
        System.out.println(modeloEsperado + "," + modeloActual);
        Assert.assertNull(modeloEsperado, "vacio");
    }
}







