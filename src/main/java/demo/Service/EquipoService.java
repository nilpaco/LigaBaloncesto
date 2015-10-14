package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nilpanescoll on 07/10/15.
 */
@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;


    public void crearEquipo(){
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Barcelona");
        equipo1.setLoclidad("Barcelona");
        Calendar cal3=Calendar.getInstance();
        cal3.set(1899, Calendar.DECEMBER, 12);
        Date birthDate3=cal3.getTime();
        equipo1.setFechaCreacion(birthDate3);
        equipoRepository.save(equipo1);

        Jugador jugador = jugadorRepository.findByNombre("Kostas Papanikolaou");

        jugador.setEquipo(equipo1);

        jugadorRepository.save(jugador);


    }
}
