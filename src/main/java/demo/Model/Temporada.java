package demo.Model;

import javax.persistence.*;

/**
 * Created by nilpanescoll on 14/10/15.
 */
@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @ManyToOne
    private Liga liga;

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

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
