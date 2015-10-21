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
        cal7.set(1980, Calendar.FEBRUARY, 5);
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
        cal8.set(1982, Calendar.APRIL, 21);
        Date birthDate8=cal8.getTime();
        jugador8.setFechaNacimiento(birthDate8);
        jugador8.setCanastas(274);
        jugador8.setAsistencias(83);
        jugador8.setRebotes(174);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("Lebron James");
        Calendar cal9=Calendar.getInstance();
        cal9.set(1986, Calendar.JULY, 16);
        Date birthDate9=cal9.getTime();
        jugador9.setFechaNacimiento(birthDate9);
        jugador9.setCanastas(1234);
        jugador9.setAsistencias(342);
        jugador9.setRebotes(43);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("Marc Gasol");
        Calendar cal10=Calendar.getInstance();
        cal10.set(1987, Calendar.DECEMBER, 23);
        Date birthDate10=cal10.getTime();
        jugador10.setFechaNacimiento(birthDate10);
        jugador10.setCanastas(232);
        jugador10.setAsistencias(248);
        jugador10.setRebotes(474);
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador();
        jugador11.setNombre("Rudy Fernandez");
        Calendar cal11=Calendar.getInstance();
        cal11.set(1972, Calendar.NOVEMBER, 28);
        Date birthDate11=cal11.getTime();
        jugador11.setFechaNacimiento(birthDate11);
        jugador11.setCanastas(2);
        jugador11.setAsistencias(2);
        jugador11.setRebotes(1);
        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador();
        jugador12.setNombre("Dimitris Diamantidis");
        Calendar cal12=Calendar.getInstance();
        cal12.set(1980, Calendar.SEPTEMBER, 29);
        Date birthDate12=cal12.getTime();
        jugador12.setFechaNacimiento(birthDate12);
        jugador12.setCanastas(234);
        jugador12.setAsistencias(123);
        jugador12.setRebotes(432);
        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador();
        jugador13.setNombre("Brad Oleson");
        Calendar cal13=Calendar.getInstance();
        cal13.set(1983, Calendar.AUGUST, 23);
        Date birthDate13=cal13.getTime();
        jugador13.setFechaNacimiento(birthDate13);
        jugador13.setCanastas(234);
        jugador13.setAsistencias(562);
        jugador13.setRebotes(34);
        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador();
        jugador14.setNombre("Serio Llull");
        Calendar cal14=Calendar.getInstance();
        cal14.set(1982, Calendar.JANUARY, 23);
        Date birthDate14=cal14.getTime();
        jugador14.setFechaNacimiento(birthDate14);
        jugador14.setCanastas(123);
        jugador14.setAsistencias(12);
        jugador14.setRebotes(12);
        jugadorRepository.save(jugador14);

        Jugador jugador15 = new Jugador();
        jugador15.setNombre("Kobe Bryant");
        Calendar cal15=Calendar.getInstance();
        cal15.set(1972, Calendar.FEBRUARY, 21);
        Date birthDate15=cal15.getTime();
        jugador15.setFechaNacimiento(birthDate14);
        jugador15.setCanastas(824);
        jugador15.setAsistencias(0);
        jugador15.setRebotes(153);
        jugadorRepository.save(jugador15);

        Jugador jugador16 = new Jugador();
        jugador16.setNombre("Ricky Rubio");
        Calendar cal16=Calendar.getInstance();
        cal16.set(1982, Calendar.JANUARY, 23);
        Date birthDate16=cal16.getTime();
        jugador16.setFechaNacimiento(birthDate16);
        jugador16.setCanastas(82);
        jugador16.setAsistencias(613);
        jugador16.setRebotes(234);
        jugadorRepository.save(jugador16);

        Jugador jugador17 = new Jugador();
        jugador17.setNombre("Yao Ming");
        Calendar cal17=Calendar.getInstance();
        cal17.set(1982, Calendar.MAY, 3);
        Date birthDate17=cal17.getTime();
        jugador17.setFechaNacimiento(birthDate17);
        jugador17.setCanastas(613);
        jugador17.setAsistencias(513);
        jugador17.setRebotes(425);
        jugadorRepository.save(jugador17);

        Jugador jugador18 = new Jugador();
        jugador18.setNombre("Alberto Corbacho");
        Calendar cal18=Calendar.getInstance();
        cal18.set(1983, Calendar.MAY, 30);
        Date birthDate18=cal18.getTime();
        jugador18.setFechaNacimiento(birthDate18);
        jugador18.setCanastas(2432);
        jugador18.setAsistencias(513);
        jugador18.setRebotes(154);
        jugadorRepository.save(jugador18);

        Jugador jugador19 = new Jugador();
        jugador19.setNombre("Pablo Aguilar");
        Calendar cal19=Calendar.getInstance();
        cal19.set(1986, Calendar.MARCH, 18);
        Date birthDate19=cal17.getTime();
        jugador19.setFechaNacimiento(birthDate19);
        jugador19.setCanastas(61);
        jugador19.setAsistencias(34);
        jugador19.setRebotes(513);
        jugadorRepository.save(jugador19);

        Jugador jugador20 = new Jugador();
        jugador20.setNombre("Mirza Teletovic");
        Calendar cal20=Calendar.getInstance();
        cal20.set(1997, Calendar.MARCH, 18);
        Date birthDate20=cal17.getTime();
        jugador20.setFechaNacimiento(birthDate20);
        jugador20.setCanastas(412);
        jugador20.setAsistencias(54);
        jugador20.setRebotes(351);
        jugadorRepository.save(jugador20);

        Jugador jugador21 = new Jugador();
        jugador21.setNombre("Nemanja Bjelica");
        Calendar cal21=Calendar.getInstance();
        cal21.set(1990, Calendar.JUNE, 1);
        Date birthDate21=cal21.getTime();
        jugador21.setFechaNacimiento(birthDate21);
        jugador21.setCanastas(513);
        jugador21.setAsistencias(513);
        jugador21.setRebotes(51);
        jugadorRepository.save(jugador21);

        Jugador jugador22 = new Jugador();
        jugador22.setNombre("Xavi Rabaseda");
        Calendar cal22=Calendar.getInstance();
        cal22.set(1995, Calendar.FEBRUARY, 12);
        Date birthDate22=cal22.getTime();
        jugador22.setFechaNacimiento(birthDate22);
        jugador22.setCanastas(513);
        jugador22.setAsistencias(513);
        jugador22.setRebotes(51);
        jugadorRepository.save(jugador22);

        Jugador jugador23 = new Jugador();
        jugador23.setNombre("Sonny Weems");
        Calendar cal23=Calendar.getInstance();
        cal23.set(1985, Calendar.FEBRUARY, 12);
        Date birthDate23=cal23.getTime();
        jugador23.setFechaNacimiento(birthDate23);
        jugador23.setCanastas(524);
        jugador23.setAsistencias(62);
        jugador23.setRebotes(183);
        jugadorRepository.save(jugador23);

        Jugador jugador24 = new Jugador();
        jugador24.setNombre("Aaron Jackson");
        Calendar cal24=Calendar.getInstance();
        cal24.set(1990, Calendar.MARCH, 17);
        Date birthDate24=cal24.getTime();
        jugador24.setFechaNacimiento(birthDate24);
        jugador24.setCanastas(295);
        jugador24.setAsistencias(239);
        jugador24.setRebotes(67);
        jugadorRepository.save(jugador24);

        Jugador jugador25 = new Jugador();
        jugador25.setNombre("Marko Todorovic");
        Calendar cal25=Calendar.getInstance();
        cal25.set(1993, Calendar.FEBRUARY, 2);
        Date birthDate25=cal25.getTime();
        jugador25.setFechaNacimiento(birthDate25);
        jugador25.setCanastas(162);
        jugador25.setAsistencias(182);
        jugador25.setRebotes(372);
        jugadorRepository.save(jugador25);

        Jugador jugador26 = new Jugador();
        jugador26.setNombre("Alexey Shved");
        Calendar cal26=Calendar.getInstance();
        cal26.set(1989, Calendar.DECEMBER, 24);
        Date birthDate26=cal26.getTime();
        jugador26.setFechaNacimiento(birthDate26);
        jugador26.setCanastas(328);
        jugador26.setAsistencias(182);
        jugador26.setRebotes(192);
        jugadorRepository.save(jugador26);

        Jugador jugador27 = new Jugador();
        jugador27.setNombre("Bojan Dubljevic");
        Calendar cal27=Calendar.getInstance();
        cal27.set(1984, Calendar.JUNE, 17);
        Date birthDate27=cal27.getTime();
        jugador27.setFechaNacimiento(birthDate27);
        jugador27.setCanastas(285);
        jugador27.setAsistencias(251);
        jugador27.setRebotes(231);
        jugadorRepository.save(jugador27);



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
