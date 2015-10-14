package demo.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nilpanescoll on 13/10/15.
 */
@Entity
public class LigaACB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @OneToMany (mappedBy = "temporada")
    private Set<Temporada> temporadas = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "LigaACB{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
