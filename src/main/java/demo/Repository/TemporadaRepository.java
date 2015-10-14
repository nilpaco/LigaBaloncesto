package demo.Repository;

import demo.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by nilpanescoll on 14/10/15.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {
    public Temporada findByNombre(String nombre);
}
