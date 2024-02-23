/**
 * Aplicacion tarea factory transporte
 */
public class Main {
    public static void main(String[] args) {
        IComun transporte;

        transporte=FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
        if (transporte instanceof camion) System.out.println("Camion:");
        System.out.println("Coste total: " + transporte.costeTotal(36900) + " Tipo de transporte: " + transporte.tipoEmbalaje(10f,10f,40f,100));

        transporte=FactoryTransporte.getTransporte(FactoryTransporte.BICICLETA);
        if (transporte instanceof bicicleta) System.out.println("Bicicleta:");
        System.out.println("Coste total: " + transporte.costeTotal(38020) + " Tipo de transporte: " + transporte.tipoEmbalaje(5f,5f,7f,10));
    }
}