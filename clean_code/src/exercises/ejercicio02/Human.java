package exercises.ejercicio02;

/**
 * Representa a una persona en el sistema.
 * Delega la gestion de la direccion a la clase especializada Address.
 */
public class Human {
    private String name;
    private String age;
    private Address address;

    /**
     * Obtiene la direccion completa del humano consultando a su objeto Address.
     * * @return La direccion formateada proporcionada por la clase Address.
     */
    public String getFullAddress() {
        return address.getFullAddress();
    }
}