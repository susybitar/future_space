package com.appsdeveloperblog.app.ws.futurespace.exercises.ej04_jpa;

import com.appsdeveloperblog.app.ws.futurespace.exercises.ej03_jpa.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Clase encargada de ejecutar y mostrar el resultado del Ejercicio 4.
 * Utiliza el repositorio de libros para buscar los publicados después de una fecha específica.
 */
@Component
@Order(2)
public class FindBooksCustomQuery implements CommandLineRunner {

    private final BookRepository bookRepository;

    /**
     * Constructor para la inyección de dependencias.
     *
     * @param bookRepository Repositorio de libros.
     */
    public FindBooksCustomQuery(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Método principal que se ejecuta automáticamente al arrancar la aplicación.
     * Muestra por consola los libros obtenidos mediante la consulta personalizada por fecha.
     *
     * @param args Argumentos de la línea de comandos.
     * @throws Exception En caso de error durante la ejecución de la consulta.
     */
    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n---------------------------------------------------------");
        System.out.println("                 RESULTADO EJERCICIO 4                   ");
        System.out.println("        Libros publicados despues del 01/12/2001         ");
        System.out.println("---------------------------------------------------------");

        // Definimos la fecha de corte exacta (1 de diciembre de 2001)
        LocalDate cutOffDate = LocalDate.of(2001, 12, 1);

        // Llamamos al nuevo método del repositorio pasando la fecha de corte
        bookRepository.findBooksAfterDate(cutOffDate).forEach(book -> {
            System.out.println("Titulo: " + book.getTitle() + " | Fecha: " + book.getPublicationDate());
        });

        System.out.println("---------------------------------------------------------\n");
    }
}