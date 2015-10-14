package demo.Repository;

import demo.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by nilpanescoll on 07/10/15.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {
    public Equipo findByNombre(String nombre);
}
