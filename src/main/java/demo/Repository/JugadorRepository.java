package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by nilpanescoll on 05/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {
    public List<Jugador> findByNombreContaining(String nombre);
    public List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);
    public List<Jugador> findByAsistenciasBetween(Integer max, Integer min);
    public List<Jugador> findByPosicionLike(String posicion);
    public List<Jugador> findByFechaNacimientoLessThan(Date fechaNacimiento);
    public List<Jugador> findByNombreContainingAndFechaNacimientoLessThan(String nombre, Date fechaNacimiento);
}
