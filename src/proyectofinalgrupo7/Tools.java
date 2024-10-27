package proyectofinalgrupo7;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Tools {

    public String FechayHora() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        return dtf.format(now);

    }

}
