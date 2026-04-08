package com.appsdeveloperblog.app.ws.futurespace.exercises.ej05_jpa;

import com.appsdeveloperblog.app.ws.futurespace.exercises.ej03_jpa.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Clase encargada de ejecutar y mostrar el resultado del Ejercicio 5.
 * Utiliza la derivación de consultas (Query Methods) de Spring Data JPA.
 */
@Component
@Order(3) // Se ejecuta después del Ejercicio 4
public class FindBooksMethodQuery implements CommandLineRunner {

    private final BookRepository bookRepository;

    public FindBooksMethodQuery(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n---------------------------------------------------------");
        System.out.println("                 RESULTADO EJERCICIO 5                   ");
        System.out.println("       Libros publicados despues del 01/12/2001 \n" +
                           "                 usando Query Method              ");
        System.out.println("---------------------------------------------------------");

        // Usamos la misma fecha de corte que en el ejercicio anterior
        LocalDate cutOffDate = LocalDate.of(2001, 12, 1);

        // Llamamos al nuevo método que NO tiene @Query
        bookRepository.findByPublicationDateAfter(cutOffDate).forEach(book -> {
            System.out.println("Libro: " + book.getTitle() + " | Fecha: " + book.getPublicationDate());
        });

        System.out.println("---------------------------------------------------------\n");
    }
}