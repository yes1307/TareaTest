import Utilidades.TipoPasajeroEnum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasajeroTest {
    @Test
    public void nombrePasajeroTest() {
        //Precondiciones
        String nombreEsperado = "Pablo Aguilar";
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.VIP;
        //Empieza el test
        Pasajero pabloAgilar = new Pasajero();
        pabloAgilar.SetPasajeroNombre(nombreEsperado);
        pabloAgilar.setTipoPasajero(tipoPasajeroEsperado);

        String nombreActual = pabloAgilar.getPasajeroNombre();
        TipoPasajeroEnum tipoPasajeroActual = pabloAgilar.getTipoPasajero();

        Assert.assertEquals(nombreActual, nombreEsperado);
        Assert.assertEquals(tipoPasajeroActual, tipoPasajeroEsperado);

    }

    @Test
    public void tipoPasajeroNoesVIP() {
        //Precondiciones
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.VIP;
        TipoPasajeroEnum tipoPasajeroNoEsperado = TipoPasajeroEnum.STANDARD;
        //Empieza el test
        Pasajero pabloAgilar = new Pasajero();
        pabloAgilar.setTipoPasajero(tipoPasajeroEsperado);
        TipoPasajeroEnum tipoPasajeroActual = pabloAgilar.getTipoPasajero();

        //Assert.assertNotEquals(tipoPasajeroActual, tipoPasajeroEsperado.STANDARD);
        Assert.assertNotEquals(tipoPasajeroActual, tipoPasajeroNoEsperado);
    }
}
