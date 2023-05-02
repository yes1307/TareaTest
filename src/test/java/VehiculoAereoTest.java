import org.testng.Assert;
import org.testng.annotations.Test;

public class VehiculoAereoTest {
    @Test
    public void pistaVelocidadTest() {
        VehiculoAereo velocidadAvion = new VehiculoAereo();
        double velocidadActual = velocidadAvion.calculaGS(100, 10);
        double velocidadEsperada = 10;
        Assert.assertTrue(velocidadEsperada == velocidadActual);

    }

    @Test
    public void pistaVelocidadNoTest() {
        VehiculoAereo velocidadAvion = new VehiculoAereo();
        double velocidadActual = velocidadAvion.calculaGS(100, 10);
        double velocidadEsperada = 16;
        Assert.assertTrue(velocidadEsperada != velocidadActual);
    }

    @Test
    public void comparacionVelocidadNoTest() {
        VehiculoAereo velocidadAvion = new VehiculoAereo();
        double velocidadActual = velocidadAvion.calculaGS(100, 10);
        double velocidadEsperada = 16;
        Assert.assertNotEquals(velocidadActual, velocidadEsperada);
    }
}
