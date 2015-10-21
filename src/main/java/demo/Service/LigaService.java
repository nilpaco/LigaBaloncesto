package demo.Service;

import demo.Model.Liga;
import demo.Model.Temporada;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by nilpanescoll on 14/10/15.
 */
@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void crearLiga(){
        Liga liga = new Liga();
        liga.setNombre("Liga ACB");
        ligaRepository.save(liga);

        Temporada temporada = temporadaRepository.findByNombre("Temporada ACB 15/16");
        temporada.setLiga(liga);
        temporadaRepository.save(temporada);

        Temporada temporada2 = temporadaRepository.findByNombre("Temporada ACB 16/17");
        temporada2.setLiga(liga);
        temporadaRepository.save(temporada2);


    }
}
