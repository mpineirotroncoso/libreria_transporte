public class FactoryTransporte {
    public static final int CAMION = 0;
    public static final int BICICLETA = 1;

    /**
     *
     * @param opcion tipo de transporte
     * @return instancia del transporte elegido
     */
    public static IComun getTransporte(int opcion){
        switch (opcion){
            case 0:
                return new camion();
            case 1:
                return new bicicleta();
            default:
                return null;
        }
    }
}
