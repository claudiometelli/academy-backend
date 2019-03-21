package it.myti.academy.backend.repository;

import it.myti.academy.backend.model.Collo;
import it.myti.academy.backend.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    List<Evento> findAllByColloIn(List<Collo> colli);
}