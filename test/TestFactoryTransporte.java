import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFactoryTransporte {
    @Test
    @DisplayName("Test de clase")
    public void testClass(){
        IComun salida = FactoryTransporte.getTransporte(FactoryTransporte.BICICLETA);
        Assertions.assertTrue(salida instanceof IComun);
    }
}
