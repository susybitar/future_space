package com.appsdeveloperblog.app.ws.futurespace.exercises.ej02_jpa.repositories;

import com.appsdeveloperblog.app.ws.futurespace.exercises.ej02_jpa.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para gestionar las operaciones de base de datos de la entidad Author.
 * Proporciona métodos CRUD gracias a la herencia de JpaRepository.
 */

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
