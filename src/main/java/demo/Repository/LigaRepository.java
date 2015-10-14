package demo.Repository;

import demo.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by nilpanescoll on 14/10/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {
}
