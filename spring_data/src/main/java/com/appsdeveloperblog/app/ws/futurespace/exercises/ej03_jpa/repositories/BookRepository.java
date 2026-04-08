package com.appsdeveloperblog.app.ws.futurespace.exercises.ej03_jpa.repositories;

import com.appsdeveloperblog.app.ws.futurespace.exercises.ej02_jpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Repositorio para gestionar las operaciones de base de datos de la entidad Book.
 * Proporciona métodos CRUD gracias a la herencia de JpaRepository.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * Ejercicio JPA 4: Busca y devuelve los libros publicados después de una fecha exacta.
     * Utiliza el parámetro dinámico :fechaLimite.
     *
     * @param fechaLimite Fecha a partir de la cual se buscarán los libros.
     * @return Lista de libros publicados después de la fecha indicada.
     */
    @Query(
            value = "SELECT book FROM Book book WHERE book.publicationDate > :fechaLimite"
    )
    List<Book> findBooksAfterDate(@Param("fechaLimite") LocalDate fechaLimite);

    /**
     * Ejercicio JPA 5: Busca y devuelve los libros publicados después de una fecha exacta.
     * Utiliza la derivación de consultas de Spring Data JPA (Query Method)
     * basada en el nombre del método.
     *
     * @param date Fecha límite para la búsqueda.
     * @return Lista de libros cuya fecha de publicación es posterior a la indicada.
     */
    List<Book> findByPublicationDateAfter(LocalDate date);
}