package it.myti.academy.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by david at 2019-02-13
 */
@Data
@Entity(name = "unita_logistiche")
public class UnitaLogistica {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(unique = true, length = 10)
    protected String codice;

    @Column(name = "id_esterno", unique = true)
    protected String idEsterno;

    @Column(name = "temp_massima")
    protected Short temperatureMassima;

    @Column(name = "temp_minima")
    protected Short temperaturaMinima;

    @ManyToOne
    @JoinColumn(name = "stato_id")
    @JsonIgnore
    protected StatoUnitaLogistica stato;

    @Column
    @OneToMany(mappedBy = "unitaLogistica")
    protected List<Collo> spedizioniFatte;


    public Long getId() { return id; }

    public String getCodice() { return codice; }

    public String getIdEsterno() { return idEsterno; }

    public Short getTemperatureMassima() { return temperatureMassima; }

    public Short getTemperaturaMinima() { return temperaturaMinima; }

    public StatoUnitaLogistica getStato() { return stato; }

    public List<Collo> getSpedizioniFatte() { return spedizioniFatte; }



    public void setId(Long id) { this.id = id; }

    public void setCodice(String codice) { this.codice = codice; }

    public void setIdEsterno(String idEsterno) { this.idEsterno = idEsterno; }

    public void setTemperatureMassima(Short temperatureMassima) { this.temperatureMassima = temperatureMassima; }

    public void setTemperaturaMinima(Short temperaturaMinima) { this.temperaturaMinima = temperaturaMinima; }

    public void setStato(StatoUnitaLogistica stato) { this.stato = stato; }

    public void setSpedizioniFatte(List<Collo> spedizioniFatte) { this.spedizioniFatte = spedizioniFatte; }

}
