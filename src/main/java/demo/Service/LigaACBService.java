package demo.Service;

import demo.Model.LigaACB;
import demo.Repository.LigaACBRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by nilpanescoll on 14/10/15.
 */
@Service
@Transactional
public class LigaACBService {

    @Autowired
    private LigaACBRepository ligaACBRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void crearLiga(){
        LigaACB ligaACB = new LigaACB();
        ligaACB.setNombre("Liga ACB");
        ligaACBRepository.save(ligaACB);
    }
}
