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
        equipo1.setLocalidad("Barcelona");
        Calendar cal=Calendar.getInstance();
        cal.set(1899, Calendar.DECEMBER, 12);
        Date birthDate=cal.getTime();
        equipo1.setFechaCreacion(birthDate);
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Joventut Badalona");
        equipo2.setLocalidad("Badalona");
        Calendar cal2=Calendar.getInstance();
        cal2.set(1914, Calendar.APRIL, 23);
        Date birthDate2=cal2.getTime();
        equipo2.setFechaCreacion(birthDate2);
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("UCAM Murcia");
        equipo3.setLocalidad("Murcia");
        Calendar cal3=Calendar.getInstance();
        cal3.set(1983, Calendar.SEPTEMBER, 1);
        Date birthDate3=cal3.getTime();
        equipo3.setFechaCreacion(birthDate3);
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("Fuenlabrada");
        equipo4.setLocalidad("Madrid");
        Calendar cal4=Calendar.getInstance();
        cal4.set(1899, Calendar.DECEMBER, 12);
        Date birthDate4=cal4.getTime();
        equipo4.setFechaCreacion(birthDate4);
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("Baskonia");
        equipo5.setLocalidad("Vitoria");
        Calendar cal5=Calendar.getInstance();
        cal5.set(1934, Calendar.SEPTEMBER, 14);
        Date birthDate5=cal5.getTime();
        equipo4.setFechaCreacion(birthDate5);
        equipoRepository.save(equipo5);

        Jugador jugador = jugadorRepository.findByNombre("Kostas Papanikolaou");
        jugador.setEquipo(equipo1);
        jugadorRepository.save(jugador);
        Jugador jugador2 = jugadorRepository.findByNombre("Alex Abrines");
        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);
        Jugador jugador3 = jugadorRepository.findByNombre("Pau Gasol");
        jugador3.setEquipo(equipo1);
        jugadorRepository.save(jugador3);
        Jugador jugador4 = jugadorRepository.findByNombre("Carlos Arroyo");
        jugador4.setEquipo(equipo1);
        jugadorRepository.save(jugador4);
        Jugador jugador5 = jugadorRepository.findByNombre("Juan Carlos Navarro");
        jugador5.setEquipo(equipo1);
        jugadorRepository.save(jugador5);
        Jugador jugador6 = jugadorRepository.findByNombre("Ante Tomic");
        jugador6.setEquipo(equipo1);
        jugadorRepository.save(jugador6);


        System.out.println("Mostrar jugador: ");
        System.out.println(jugadorRepository.findByEquipoNombre("Barcelona"));
        System.out.println("Mostrar jugador: ");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("Barcelona", "Alero"));
        System.out.println("Mostrar jugador 3: ");
        System.out.println(jugadorRepository.findEmployeeOrderBySalaryFromProject(1L));


    }
}
