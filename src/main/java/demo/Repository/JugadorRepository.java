package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

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
    public Jugador findByNombre(String nombre);
    public List<Jugador> findByEquipoNombre(String nombre);
    public List<Jugador> findByEquipoNombreAndPosicion(String nombre, String posicion);
    public Jugador findTopByOrderByCanastasDesc();
    public List<Jugador> findFirst5ByOrderByAsistenciasDesc();
    @Query("SELECT j.nombre FROM Jugador j where j.equipo.id = :equipo_id order by j.canastas desc ")
    List<Jugador> findEmployeeOrderBySalaryFromProject(@Param("equipo_id") Long equipo_id);
}
