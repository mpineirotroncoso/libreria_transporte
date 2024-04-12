import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFactoryTransporte {
    @Test
    @DisplayName("Test de clase bicicleta")
    public void testClaseBicicleta(){
        IComun factor = FactoryTransporte.getTransporte(FactoryTransporte.BICICLETA);
        Assertions.assertTrue(factor instanceof IComun);
    }

    @Test
    @DisplayName("Test de clase camion")
    public void testClaseCamion(){
        IComun factor = FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
        Assertions.assertTrue(factor instanceof IComun);
    }
}
