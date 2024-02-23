public class camion implements IComun{
    /**
     *
     * @param cp codigo postal
     * @return coste final
     */
    @Override
    public float costeTotal(int cp) {
        Float coste;
        if(cp > 34000) coste = 15f;
        else coste = 25f;
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
        Integer embalaje;
        if(peso > 30) embalaje = IComun.PALET;
        else if (peso >= 30 || peso >=10) embalaje = IComun.CAJA_MADERA;
        else embalaje = IComun.CARTON;
        return embalaje;
    }
}
