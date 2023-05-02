import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DosRuedasTest {
    @Test
    public void encenderDosRuedasTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        boolean encendio = dosRuedas.arrancarApagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }

    @Test
    public void tipoCombustibleGasolinaTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertEquals(dosRuedas.getCombustible(), Combustible.GASOLINA);
    }

    @Test
    public void tipoCombustibleNotTurbosina() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertNotEquals(dosRuedas.getCombustible(), Combustible.TURBOSINA);
    }

}
