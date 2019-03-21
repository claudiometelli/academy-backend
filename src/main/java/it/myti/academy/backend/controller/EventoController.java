package it.myti.academy.backend.controller;

import it.myti.academy.backend.model.Evento;
import it.myti.academy.backend.model.Utente;
import it.myti.academy.backend.repository.UtenteRepository;
import it.myti.academy.backend.service.EventoService;
import it.myti.academy.backend.service.impl.EventoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/eventi")
@RestController
public class EventoController {

    @Autowired
    EventoServiceImpl eventoService;

    @Autowired
    UtenteRepository utenteRepository;


    @GetMapping("/utente/{id}")
    public List<Evento> getEventoByUtenteAndSpedizioneAndUnitaLogistica (@PathVariable("id") long id){
        List<Evento> eventi = null;
        Optional<Utente> utente = utenteRepository.findById(id);
        if(utente.isPresent()){
            eventi = eventoService.getByUtenteAndSpedizioneAndUnitaLogistica(utente.get());
            return eventi;
        }
        return null;
    }
}