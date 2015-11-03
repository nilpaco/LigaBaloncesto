package demo.Controller;

import demo.Exception.EquipoException;
import demo.Model.Equipo;
import demo.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nilpanescoll on 3/11/15.
 */

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo save(@RequestBody Equipo equipo){
        return equipoRepository.save(equipo);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Equipo> findAll(){
        List<Equipo> equipos = new ArrayList<Equipo>();
        Iterator<Equipo> iterator = equipoRepository.findAll().iterator();

        while (iterator.hasNext()){
            equipos.add(iterator.next());
        }
        return equipos;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        Equipo jugador = equipoRepository.findOne(id);

        if(jugador == null){throw new EquipoException(id);}

        equipoRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Equipo getById(@PathVariable Long id){
        Equipo jugador = equipoRepository.findOne(id);

        if(jugador == null){throw new EquipoException(id);}

        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Equipo updateById(@PathVariable Long id, @RequestBody Equipo jugador){
        Equipo d1 = equipoRepository.findOne(id);

        if(d1 == null){throw new EquipoException(id);}

        return equipoRepository.save(jugador);
    }


}
