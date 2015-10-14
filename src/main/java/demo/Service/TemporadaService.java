package demo.Service;

import demo.Model.Equipo;
import demo.Model.Temporada;
import demo.Repository.EquipoRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by nilpanescoll on 14/10/15.
 */
@Service
@Transactional
public class TemporadaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void crearTemporada(){
        Temporada temporada1 = new Temporada();
        temporada1.setNombre("Temporada ACB 15/16");
        temporadaRepository.save(temporada1);

        Equipo equipo = equipoRepository.findByNombre("Barcelona");
        temporada1.getEquipos().add(equipo);
        temporadaRepository.save(temporada1);

    }

}
