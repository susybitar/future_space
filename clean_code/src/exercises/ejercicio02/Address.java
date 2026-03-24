package exercises.ejercicio02;

/**
 * Representa la direccion fisica de un individuo.
 * Esta clase agrupa los datos de ubicacion para mejorar la cohesion.
 */
public class Address {
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    /**
     * Construye la direccion completa formateada con comas.
     * * @return Una cadena de texto con la direccion completa.
     */
    public String getFullAddress() {
        StringBuilder result = new StringBuilder();
        return result
                .append(country).append(",")
                .append(city).append(",")
                .append(street).append(",")
                .append(house).append(" ")
                .append(quarter).toString();
    }
}