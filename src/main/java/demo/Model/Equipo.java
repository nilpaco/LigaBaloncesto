package demo.Model;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nilpanescoll on 07/10/15.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String loclidad;

    private Date fechaCreacion;

    @OneToMany (mappedBy = "equipo")
    private Set<Jugador> jugadores = new HashSet<>();

    @ManyToMany (mappedBy = "equipos")
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

    public String getLoclidad() {
        return loclidad;
    }

    public void setLoclidad(String loclidad) {
        this.loclidad = loclidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", loclidad='" + loclidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", jugadores=" + jugadores +
                '}';
    }
}
