package it.myti.academy.backend.controller;

import it.myti.academy.backend.model.UnitaLogistica;
import it.myti.academy.backend.model.Utente;
import it.myti.academy.backend.repository.UtenteRepository;
import it.myti.academy.backend.service.impl.UnitaLogisticaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/unitalogistiche")
@RestController
public class UnitaLogisticaController {
    @Autowired
    UnitaLogisticaServiceImpl unitaLogisticaService;

    @Autowired
    UtenteRepository utenteRepository;

    @GetMapping("/utente/{id}")
    public List<UnitaLogistica> getByUtente(@PathVariable("id") long userId) {
        List<UnitaLogistica> result = null;
        Optional<Utente> utente = utenteRepository.findById(userId);
        if (utente.isPresent()) {
            result = unitaLogisticaService.getUnitaLogisticheByUtente(utente.get());
        }
        return result;
    }

    @GetMapping("/{id}")
    public UnitaLogistica getByIdAndUtente(@PathVariable("id") long ulId) {
        Optional<UnitaLogistica> ul = unitaLogisticaService.getUnitaLogisticaById(ulId);
        UnitaLogistica result = ul.isPresent() ? ul.get() : null;
        return result;
    }
}
