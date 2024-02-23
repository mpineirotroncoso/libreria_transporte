public interface IComun {
    final int PALET = 0;
    final int CARTON = 1;
    final int CAJA_MADERA = 2;

    /**
     *
     * @param cp codigo postal
     * @return coste total
     */
    public float costeTotal(int cp);

    /**
     *
     * @param x tamaño x
     * @param y tamaño y
     * @param z tamaño z
     * @param peso peso del paquete
     * @return tipo de embalaje que se usa
     */
    public int tipoEmbalaje(float x, float y, float z, float peso);
}
