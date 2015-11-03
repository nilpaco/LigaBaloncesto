package demo.Controller;

import demo.Exception.JugadorException;
import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nilpanescoll on 28/10/15.
 */
@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador){
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Jugador> findAll(){
        List<Jugador> jugadors = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext()){
            jugadors.add(iterator.next());
        }
        return jugadors;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null){throw new JugadorException(id);}

        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Jugador getById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null){throw new JugadorException(id);}

        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador){
        Jugador d1 = jugadorRepository.findOne(id);

        if(d1 == null){throw new JugadorException(id);}

        return jugadorRepository.save(jugador);
    }


}
