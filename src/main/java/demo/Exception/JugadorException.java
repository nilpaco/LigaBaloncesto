package demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by nilpanescoll on 28/10/15.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class JugadorException extends RuntimeException{
    public JugadorException(Long id){
        super("NO EXIST DEVELOPER WITH ID: " + id);
    }

}
