package it.myti.academy.backend.service;

import it.myti.academy.backend.model.UnitaLogistica;
import it.myti.academy.backend.model.Utente;

import java.util.List;
import java.util.Optional;

public interface UnitaLogisticaService {
    List<UnitaLogistica> getUnitaLogisticheByUtente(Utente utente);

    Optional<UnitaLogistica> getUnitaLogisticaById(long id);
}