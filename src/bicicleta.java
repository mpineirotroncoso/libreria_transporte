public class bicicleta implements IComun {
    /**
     *
     * @param cp codigo postal
     * @return coste final
     */
    @Override
    public float costeTotal(int cp) {
        Float coste;
        if(cp > 34000) coste = 10f;
        else coste = 15f;
        return coste;
    }
    /**
     *
     * @param x tamaño x
     * @param y tamaño y
     * @param z tamaño z
     * @param peso peso del paquete
     * @return tipo de embalaje que se usa
     */
    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        Integer embalaje = null;
        if(peso >= 0 || peso <= 10) embalaje = IComun.CARTON;
        return embalaje;
    }
}
