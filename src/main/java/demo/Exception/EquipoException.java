package demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by nilpanescoll on 3/11/15.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends RuntimeException{
    public EquipoException(Long id){
        super("NO EXIST DEVELOPER WITH ID: " + id);
    }
}
