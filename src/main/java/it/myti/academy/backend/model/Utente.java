package it.myti.academy.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by david at 2019-02-13
 */
@Data
@Entity
@Table(name = "utenti")
public class Utente {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(unique = true, length = 64)
    protected String username;

    @Column(unique = true, length = 64)
    protected String password;

    @Column(length = 64, nullable = false)
    protected String nome;

    @Column
    @OneToMany(mappedBy = "utente")
    protected List<Collo> spedizioniFatte;


    public Long getId() { return id; }

    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public String getNome() { return nome; }

    public List<Collo> getSpedizioniFatte() { return spedizioniFatte; }



    public void setId(Long id) { this.id = id; }

    public void setUsername(String username) { this.username = username; }

    public void setNome(String nome) { this.nome = nome; }

    public void setPassword(String password) { this.password = password; }

    public void setSpedizioniFatte(List<Collo> spedizioniFatte) { this.spedizioniFatte = spedizioniFatte; }
}
