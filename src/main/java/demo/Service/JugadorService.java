package demo.Service;

import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by nilpanescoll on 05/10/15.
 */
@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void crearJugador(){

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Kostas Papanikolaou");
        Calendar cal=Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate=cal.getTime();
        jugador1.setFechaNacimiento(birthDate);
        jugador1.setPosicion("Alero");
        jugador1.setCanastas(120);
        jugador1.setAsistencias(20);
        jugador1.setRebotes(49);
        jugadorRepository.save(jugador1);


        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Juan Carlos Navarro");
        Calendar cal2=Calendar.getInstance();
        cal2.set(1980, Calendar.FEBRUARY, 2);
        Date birthDate2=cal2.getTime();
        jugador2.setFechaNacimiento(birthDate2);
        jugador2.setPosicion("Escolta");
        jugador2.setCanastas(511);
        jugador2.setAsistencias(243);
        jugador2.setRebotes(193);
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Ante Tomic");
        Calendar cal3=Calendar.getInstance();
        cal3.set(1988, Calendar.DECEMBER, 12);
        Date birthDate3=cal3.getTime();
        jugador3.setFechaNacimiento(birthDate3);
        jugador3.setPosicion("Pivot");
        jugador3.setCanastas(293);
        jugador3.setAsistencias(102);
        jugador3.setRebotes(212);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Carlos Arroyo");
        Calendar cal4=Calendar.getInstance();
        cal4.set(1986, Calendar.MARCH, 12);
        Date birthDate4=cal4.getTime();
        jugador4.setFechaNacimiento(birthDate4);
        jugador4.setPosicion("Base");
        jugador4.setCanastas(432);
        jugador4.setAsistencias(321);
        jugador4.setRebotes(126);
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Pau Gasol");
        Calendar cal5=Calendar.getInstance();
        cal5.set(1982, Calendar.APRIL, 29);
        Date birthDate5=cal5.getTime();
        jugador5.setFechaNacimiento(birthDate5);
        jugador5.setPosicion("Ala-Pivot");
        jugador5.setCanastas(623);
        jugador5.setAsistencias(248);
        jugador5.setRebotes(483);
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador();
        jugador6.setNombre("Alex Abrines");
        Calendar cal6=Calendar.getInstance();
        cal6.set(1992, Calendar.JANUARY, 5);
        Date birthDate6=cal6.getTime();
        jugador6.setFechaNacimiento(birthDate6);
        jugador6.setPosicion("Escolta");
        jugador6.setCanastas(183);
        jugador6.setAsistencias(50);
        jugador6.setRebotes(29);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("Gustavo Ayon");
        Calendar cal7=Calendar.getInstance();
        Date birthDate7=cal7.getTime();
        jugador7.setFechaNacimiento(birthDate7);
        jugador7.setPosicion("Pivot");
        jugador7.setCanastas(231);
        jugador7.setAsistencias(28);
        jugador7.setRebotes(342);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("James Feldeine");
        Calendar cal8=Calendar.getInstance();
        Date birthDate8=cal8.getTime();
        jugador8.setFechaNacimiento(birthDate8);
        jugador8.setCanastas(274);
        jugador8.setAsistencias(83);
        jugador8.setRebotes(174);
        jugadorRepository.save(jugador8);

        //cambiar nombres

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("James Feldeine");
        Calendar cal9=Calendar.getInstance();
        Date birthDate9=cal9.getTime();
        jugador9.setFechaNacimiento(birthDate9);
        jugador9.setCanastas(274);
        jugador9.setAsistencias(132);
        jugador9.setRebotes(174);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("James Feldeine");
        Calendar cal10=Calendar.getInstance();
        Date birthDate10=cal10.getTime();
        jugador10.setFechaNacimiento(birthDate10);
        jugador10.setCanastas(274);
        jugador10.setAsistencias(28);
        jugador10.setRebotes(174);
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador();
        jugador11.setNombre("James Feldeine");
        Calendar cal11=Calendar.getInstance();
        Date birthDate11=cal11.getTime();
        jugador11.setFechaNacimiento(birthDate11);
        jugador11.setCanastas(274);
        jugador11.setAsistencias(28);
        jugador11.setRebotes(174);
        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador();
        jugador12.setNombre("James Feldeine");
        Calendar cal12=Calendar.getInstance();
        Date birthDate12=cal12.getTime();
        jugador12.setFechaNacimiento(birthDate12);
        jugador12.setCanastas(274);
        jugador12.setAsistencias(28);
        jugador12.setRebotes(174);
        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador();
        jugador13.setNombre("James Feldeine");
        Calendar cal13=Calendar.getInstance();
        Date birthDate13=cal13.getTime();
        jugador13.setFechaNacimiento(birthDate13);
        jugador13.setCanastas(274);
        jugador13.setAsistencias(28);
        jugador13.setRebotes(174);
        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador();
        jugador14.setNombre("James Feldeine");
        Calendar cal14=Calendar.getInstance();
        Date birthDate14=cal14.getTime();
        jugador14.setFechaNacimiento(birthDate14);
        jugador14.setCanastas(274);
        jugador14.setAsistencias(28);
        jugador14.setRebotes(174);
        jugadorRepository.save(jugador14);

        System.out.println(jugadorRepository.findByNombreContaining("Carlos"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(511));
        List<Jugador> jugadores = jugadorRepository.findByAsistenciasBetween(220, 300);

        for (Jugador currentJugador : jugadores){
            System.out.println("Nombre: " + currentJugador.getNombre() + "Asistencias: " + currentJugador.getAsistencias());
        }

        System.out.println(jugadorRepository.findByAsistenciasBetween(220, 300));
        System.out.println(jugadorRepository.findByPosicionLike("Base"));

        Calendar calSearch=Calendar.getInstance();
        calSearch.set(1981, Calendar.JANUARY, 29);
        Date calSearch1=calSearch.getTime();
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(calSearch1));
        System.out.println(jugadorRepository.findByNombreContainingAndFechaNacimientoLessThan("carlos", calSearch1));
        System.out.println("Mostrar jugador numero canastas: ");
        System.out.println(jugadorRepository.findTopByOrderByCanastasDesc());
        System.out.println(jugadorRepository.findFirst5ByOrderByAsistenciasDesc());

    }
}
