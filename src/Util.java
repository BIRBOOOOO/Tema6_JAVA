import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

    public static String fechaDeHoy() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String resultado = hoy.format(formato);

        return resultado;
    }

    public static boolean esFechaValida(int dia, int mes, int anyo) {
        int[] meses30dias = { 4, 6, 9, 11 };

        if (mes < 1 || mes > 12) {
            return false;
        } else if (dia < 1 || dia > 31) {
            return false;
        }

        for (int s : meses30dias) {
            if (s == (mes)) {

                if (dia > 30) {
                    return false;
                }
            }
        }
        if (mes == 2) {

            if (anyo % 4 == 0 && anyo % 100 != 0
                    || anyo % 400 == 0) {
                if (dia > 29) {
                    return false;
                }
            } else if (dia > 28) {
                return false;
            }

        }
        return true;

    }
}
