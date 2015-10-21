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

        Temporada temporada2 = new Temporada();
        temporada2.setNombre("Temporada ACB 16/17");
        temporadaRepository.save(temporada2);

        Equipo equipo = equipoRepository.findByNombre("Barcelona");
        temporada1.getEquipos().add(equipo);
        temporadaRepository.save(temporada1);
        temporada2.getEquipos().add(equipo);
        temporadaRepository.save(temporada2);


        Equipo equipo1 = equipoRepository.findByNombre("Joventut Badalona");
        temporada1.getEquipos().add(equipo1);
        temporadaRepository.save(temporada1);
        temporada2.getEquipos().add(equipo1);
        temporadaRepository.save(temporada2);

        Equipo equipo2 = equipoRepository.findByNombre("UCAM Murcia");
        temporada1.getEquipos().add(equipo2);
        temporadaRepository.save(temporada1);
        temporada2.getEquipos().add(equipo2);
        temporadaRepository.save(temporada2);


        Equipo equipo3 = equipoRepository.findByNombre("Fuenlabrada");
        temporada1.getEquipos().add(equipo3);
        temporadaRepository.save(temporada1);
        temporada2.getEquipos().add(equipo3);
        temporadaRepository.save(temporada2);


        Equipo equipo4 = equipoRepository.findByNombre("Baskonia");
        temporada1.getEquipos().add(equipo4);
        temporadaRepository.save(temporada1);
        temporada2.getEquipos().add(equipo4);
        temporadaRepository.save(temporada2);

    }

}
