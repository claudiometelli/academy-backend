package it.myti.academy.backend.service.impl;

import it.myti.academy.backend.model.Evento;
import it.myti.academy.backend.model.Utente;
import it.myti.academy.backend.repository.ColloRepository;
import it.myti.academy.backend.repository.EventoRepository;
import it.myti.academy.backend.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    EventoRepository eventoRepository;

    @Autowired
    ColloRepository colloRepository;


    @Override
    public List<Evento> getByUtenteAndSpedizioneAndUnitaLogistica(Utente utente) {
        return eventoRepository.findAllByColloIn(colloRepository.findAllByUtente(utente));
    }
}
