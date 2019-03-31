package it.myti.academy.backend.service.impl;

import it.myti.academy.backend.model.UnitaLogistica;
import it.myti.academy.backend.repository.ColloRepository;
import it.myti.academy.backend.repository.UnitaLogisticaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@DataJpaTest
@RunWith(SpringRunner.class)
public class UnitaLogisticaServiceImplTest {

    @Autowired
    UnitaLogisticaRepository unitaLogisticaRepository;

    @Autowired
    ColloRepository colloRepository;

    @Test
    public void getUnitaLogisticaById(){
        long id = 1;
        final Optional<UnitaLogistica> ul = unitaLogisticaRepository.findById(id);
        assertNotNull(ul);
        if(ul.isPresent())
            assertEquals(ul.get().getId().longValue(), id);
    }
}
