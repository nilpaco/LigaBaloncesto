package demo.Service;

import demo.Model.Temporada;
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

    public void crearTemporada(){
        Temporada temporada1 = new Temporada();
        temporada1.setNombre("Temporada 15/16");
    }

}
