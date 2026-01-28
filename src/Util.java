import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

    public static String fechaDeHoy() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String resultado = hoy.format(formato);

        return resultado;
    }
}
