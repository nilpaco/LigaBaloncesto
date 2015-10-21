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
        Jugador jugador7 = jugadorRepository.findByNombre("Gustavo Ayon");
        jugador7.setEquipo(equipo2);
        jugadorRepository.save(jugador7);
        Jugador jugador8 = jugadorRepository.findByNombre("Lebron James");
        jugador8.setEquipo(equipo2);
        jugadorRepository.save(jugador8);
        Jugador jugador9 = jugadorRepository.findByNombre("Marc Gasol");
        jugador9.setEquipo(equipo2);
        jugadorRepository.save(jugador9);
        Jugador jugador10 = jugadorRepository.findByNombre("Rudy Fernandez");
        jugador10.setEquipo(equipo2);
        jugadorRepository.save(jugador10);
        Jugador jugador11 = jugadorRepository.findByNombre("Dimitris Diamantidis");
        jugador11.setEquipo(equipo2);

        jugadorRepository.save(jugador11);
        Jugador jugador12 = jugadorRepository.findByNombre("Brad Oleson");
        jugador12.setEquipo(equipo3);

        jugadorRepository.save(jugador12);
        Jugador jugador13 = jugadorRepository.findByNombre("Serio Llull");
        jugador13.setEquipo(equipo3);
        jugadorRepository.save(jugador13);
        Jugador jugador14 = jugadorRepository.findByNombre("James Feldeine");
        jugador14.setEquipo(equipo3);
        jugadorRepository.save(jugador14);
        Jugador jugador15 = jugadorRepository.findByNombre("Kobe Bryant");
        jugador15.setEquipo(equipo3);
        jugadorRepository.save(jugador15);
        Jugador jugador16 = jugadorRepository.findByNombre("Ricky Rubio");
        jugador16.setEquipo(equipo3);
        jugadorRepository.save(jugador16);
        Jugador jugador17 = jugadorRepository.findByNombre("Yao Ming");
        jugador17.setEquipo(equipo3);
        jugadorRepository.save(jugador17);

        Jugador jugador18 = jugadorRepository.findByNombre("Alberto Corbacho");
        jugador18.setEquipo(equipo4);
        jugadorRepository.save(jugador18);
        Jugador jugador19 = jugadorRepository.findByNombre("Pablo Aguilar");
        jugador19.setEquipo(equipo4);
        jugadorRepository.save(jugador19);
        Jugador jugador20 = jugadorRepository.findByNombre("Mirza Teletovic");
        jugador20.setEquipo(equipo4);
        jugadorRepository.save(jugador20);
        Jugador jugador21 = jugadorRepository.findByNombre("Nemanja Bjelica");
        jugador21.setEquipo(equipo4);
        jugadorRepository.save(jugador21);
        Jugador jugador22 = jugadorRepository.findByNombre("Xavi Rabaseda");
        jugador22.setEquipo(equipo4);
        jugadorRepository.save(jugador22);

        Jugador jugador23 = jugadorRepository.findByNombre("Sonny Weems");
        jugador23.setEquipo(equipo5);
        jugadorRepository.save(jugador23);
        Jugador jugador24 = jugadorRepository.findByNombre("Aaron Jackson");
        jugador24.setEquipo(equipo5);
        jugadorRepository.save(jugador24);
        Jugador jugador25 = jugadorRepository.findByNombre("Marko Todorovic");
        jugador25.setEquipo(equipo5);
        jugadorRepository.save(jugador25);
        Jugador jugador26 = jugadorRepository.findByNombre("Alexey Shved");
        jugador26.setEquipo(equipo5);
        jugadorRepository.save(jugador26);









        System.out.println("Mostrar jugador: ");
        System.out.println(jugadorRepository.findByEquipoNombre("Barcelona"));
        System.out.println("Mostrar jugador: ");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("Barcelona", "Alero"));
        System.out.println("Mostrar jugador 3: ");
        System.out.println(jugadorRepository.findEmployeeOrderBySalaryFromProject(1L));


    }
}
