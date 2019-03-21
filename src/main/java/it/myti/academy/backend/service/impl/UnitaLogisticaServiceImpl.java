
package it.myti.academy.backend.service.impl;

import it.myti.academy.backend.model.UnitaLogistica;
import it.myti.academy.backend.model.Utente;
import it.myti.academy.backend.repository.ColloRepository;
import it.myti.academy.backend.repository.UnitaLogisticaRepository;
import it.myti.academy.backend.service.UnitaLogisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitaLogisticaServiceImpl implements UnitaLogisticaService {
    @Autowired
    UnitaLogisticaRepository unitaLogisticaRepository;
    @Autowired
    ColloRepository colloRepository;

    @Override
    public List<UnitaLogistica> getUnitaLogisticheByUtente(Utente utente) {
        return unitaLogisticaRepository.findAllBySpedizioniFatteContains(colloRepository.findAllByUtente(utente));
    }

    @Override
    public Optional<UnitaLogistica> getUnitaLogisticaById(long id) {
        return unitaLogisticaRepository.findById(id);
    }
}