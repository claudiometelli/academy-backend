package it.myti.academy.backend.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UnitaLogisticaTest {
    public static final long ID = 1;
    public static final String CODICE = "AAAA";
    public static final String IDESTERNO = "UL2";
    public static final Short TEMPERATURAMASSIMA = 12;
    public static final Short TEMPERATURAMINIMA = -12;

    UnitaLogistica ul = new UnitaLogistica();
    private List<Collo> colli;
    private Collo collo;

    @Before
    public void setUp() throws Exception {
        ul.setId(ID);
        ul.setCodice(CODICE);
        ul.setIdEsterno(IDESTERNO);
        ul.setTemperatureMassima(TEMPERATURAMASSIMA);
        ul.setTemperaturaMinima(TEMPERATURAMINIMA);

        colli = new ArrayList<>();
        collo = new Collo();
        colli.add(collo);
        ul.setSpedizioniFatte(colli);

    }

    @Test
    public void getId() {
        assertEquals(1, ul.getId().longValue());
    }

    @Test
    public void getCodice() { assertEquals(CODICE, ul.getCodice()); }

    @Test
    public void getIdEsterno() { assertEquals(IDESTERNO, ul.getIdEsterno()); }

    @Test
    public void getTemperaturaMassima() { assertEquals(TEMPERATURAMASSIMA, ul.getTemperatureMassima()); }

    @Test
    public void getTemperaturaMinima() { assertEquals(TEMPERATURAMINIMA, ul.getTemperaturaMinima()); }

    @Test
    public void getSpedizioniFatte() {
        assertEquals(colli, ul.getSpedizioniFatte());
    }

    @Test
    public void setId() {
        long id = 1;
        ul.setId(id);
        assertEquals(ID, ul.getId().longValue());
    }

    @Test
    public void setCodice() {
        ul.setCodice("AAAA");
        assertEquals(CODICE, ul.getCodice());
    }

    @Test
    public void setIdEsterno() {
        ul.setIdEsterno("UL2");
        assertEquals(IDESTERNO, ul.getIdEsterno());
    }

    @Test
    public void setTemperaturaMassima(){
        short temp = 12;
        ul.setTemperatureMassima(temp);
        assertEquals(TEMPERATURAMASSIMA, ul.getTemperatureMassima());
    }

    @Test
    public void setTemperaturaMinima(){
        short temp = -12;
        ul.setTemperaturaMinima(temp);
        assertEquals(TEMPERATURAMINIMA, ul.getTemperaturaMinima());
    }

    @Test
    public void setSpedizioniFatte() {
        ul.setSpedizioniFatte(null);
        assertNotEquals(colli, ul.getSpedizioniFatte());
    }
}
