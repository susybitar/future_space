package com.appsdeveloperblog.app.ws.futurespace.exercises.ej02_jpa.repositories;

import com.appsdeveloperblog.app.ws.futurespace.exercises.ej02_jpa.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para gestionar las operaciones de base de datos de la entidad Publisher.
 * Proporciona métodos CRUD gracias a la herencia de JpaRepository.
 */

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
