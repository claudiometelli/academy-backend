package it.myti.academy.backend.repository;

import it.myti.academy.backend.model.Collo;
import it.myti.academy.backend.model.UnitaLogistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UnitaLogisticaRepository extends JpaRepository<UnitaLogistica, Long> {
    List<UnitaLogistica> findAllBySpedizioniFatteContains(List<Collo> colli);

    Optional<UnitaLogistica> findById(Long id);
}