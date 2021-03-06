package demo;

import demo.Service.EquipoService;
import demo.Service.JugadorService;
import demo.Service.LigaService;
import demo.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBaloncestoApplication {
    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    private static TemporadaService temporadaService;
    private static LigaService ligaService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBaloncestoApplication.class, args);
        jugadorService = context.getBean(JugadorService.class);
        jugadorService.crearJugador();
        equipoService = context.getBean(EquipoService.class);
        equipoService.crearEquipo();
        temporadaService = context.getBean(TemporadaService.class);
        temporadaService.crearTemporada();
        ligaService = context.getBean(LigaService.class);
        ligaService.crearLiga();
    }
}