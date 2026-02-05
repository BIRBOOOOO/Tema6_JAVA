public class Persona {

    private String nombre;

    private String fechaNac;

    private int altura;

    private double peso;

    private String estadoCivil;

    private boolean esFechaValida;

    private int edad;

    public Persona(String nombre, String fechaNac, int altura, double peso, String estadoCivil) {

        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.altura = altura;
        this.peso = peso;
        this.estadoCivil = estadoCivil;
        if (this.fechaValida()) {
            this.setEsfechaValida(true);
        } else {
            this.setEsfechaValida(false);
            this.setFechaNac("00/00/0000");
        }
    }

    public Persona() {
        this.nombre = "";
        this.fechaNac = "00/00/0000";
        this.altura = 0;
        this.peso = 0;
        this.estadoCivil = "";
        if (this.fechaValida()) {
            this.setEsfechaValida(true);
        } else {
            this.setEsfechaValida(false);
        }
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {

        this.estadoCivil = estadoCivil;

    }

    public int getAltura() {

        return this.altura;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setAltura(int altura) {

        this.altura = altura;

    }

    public double getPeso() {

        return this.peso;

    }

    public void setPeso(double peso) {

        this.peso = peso;

    }

    public String getFechaNac() {

        return this.fechaNac;

    }

    public void setFechaNac(String fechaNac) {

        boolean esValida = fechaValida(fechaNac);

        if (esValida) {
            this.fechaNac = fechaNac;
            System.out.println("La fecha fué cambiada con éxito");
            this.setEsfechaValida(true);
        } else {
            System.out.println(
                    "La fecha de nacimiento no fué cambiada con éxito. Se asignó la fecha por defecto '00/00/0000'. ");
            this.fechaNac = "00/00/0000";
            this.setEsfechaValida(false);
        }
    }

    public void setEsfechaValida(boolean v) {
        this.esFechaValida = v;
    }

    public boolean getEsfechaValida() {
        return this.esFechaValida;
    }

    public void getDiaMesAnyo() {
        String fecha = this.getFechaNac();
        String[] fechaTxt = fecha.split("/");

        System.out.println(fechaTxt[0] + " / " + fechaTxt[1] + " / " + fechaTxt[2]);
    }

    public boolean fechaValida() {

        String[] meses30dias = { "04", "06", "09", "11" };

        String fechaHoy = Util.fechaDeHoy();
        String[] valoresTxtFechaHoy = fechaHoy.split("/");
        String fechaNac = getFechaNac();
        String[] valoresTxtFechaNac = fechaNac.split("/");

        if (Integer.parseInt(valoresTxtFechaNac[2]) > Integer.parseInt(valoresTxtFechaHoy[2])) {

            return false;
        } else if (Integer.parseInt(valoresTxtFechaNac[2]) == Integer.parseInt(valoresTxtFechaHoy[2])) {

            if (Integer.parseInt(valoresTxtFechaNac[1]) > Integer.parseInt(valoresTxtFechaHoy[1])) {

                return false;
            }
        } else if (Integer.parseInt(valoresTxtFechaNac[1]) == Integer.parseInt(valoresTxtFechaHoy[1])) {

            if (Integer.parseInt(valoresTxtFechaNac[0]) > Integer.parseInt(valoresTxtFechaHoy[0])) {

                return false;
            }
        }

        if (Integer.parseInt(valoresTxtFechaNac[1]) < 1 || Integer.parseInt(valoresTxtFechaNac[1]) > 12) {
            return false;
        } else if (Integer.parseInt(valoresTxtFechaNac[0]) < 1 || Integer.parseInt(valoresTxtFechaHoy[0]) > 31) {
            return false;
        }

        for (String s : meses30dias) {
            if (s.equals(valoresTxtFechaNac[1])) {

                if (Integer.parseInt(valoresTxtFechaNac[0]) > 30) {
                    return false;
                }
            }
        }
        if (valoresTxtFechaHoy[1].equals("02")) {

            if ((Integer.parseInt(valoresTxtFechaNac[2]) % 4 == 0 && Integer.parseInt(valoresTxtFechaNac[2]) % 100 != 0)
                    || Integer.parseInt(valoresTxtFechaNac[2]) % 400 == 0) {
                if (Integer.parseInt(valoresTxtFechaNac[0]) > 29) {
                    return false;
                }
            } else if (Integer.parseInt(valoresTxtFechaNac[0]) > 28) {
                return false;
            }

        }
        return true;
    }

    public boolean fechaValida(String fechaNac) {

        String[] meses30dias = { "04", "06", "09", "11" };

        String fechaHoy = Util.fechaDeHoy();
        String[] valoresTxtFechaHoy = fechaHoy.split("/");
        String[] valoresTxtFechaNac = fechaNac.split("/");

        if (Integer.parseInt(valoresTxtFechaNac[2]) > Integer.parseInt(valoresTxtFechaHoy[2])) {

            return false;
        } else if (Integer.parseInt(valoresTxtFechaNac[2]) == Integer.parseInt(valoresTxtFechaHoy[2])) {

            if (Integer.parseInt(valoresTxtFechaNac[1]) > Integer.parseInt(valoresTxtFechaHoy[1])) {

                return false;
            }
        } else if (Integer.parseInt(valoresTxtFechaNac[1]) == Integer.parseInt(valoresTxtFechaHoy[1])) {

            if (Integer.parseInt(valoresTxtFechaNac[0]) > Integer.parseInt(valoresTxtFechaHoy[0])) {

                return false;
            }
        }

        if (Integer.parseInt(valoresTxtFechaNac[1]) < 1 || Integer.parseInt(valoresTxtFechaNac[1]) > 12) {
            return false;
        } else if (Integer.parseInt(valoresTxtFechaNac[0]) < 1 || Integer.parseInt(valoresTxtFechaHoy[0]) > 31) {
            return false;
        }

        for (String s : meses30dias) {
            if (s.equals(valoresTxtFechaNac[1])) {

                if (Integer.parseInt(valoresTxtFechaNac[0]) > 30) {
                    return false;
                }
            }
        }
        if (valoresTxtFechaHoy[1].equals("02")) {

            if ((Integer.parseInt(valoresTxtFechaNac[2]) % 4 == 0 && Integer.parseInt(valoresTxtFechaNac[2]) % 100 != 0)
                    || Integer.parseInt(valoresTxtFechaNac[2]) % 400 == 0) {
                if (Integer.parseInt(valoresTxtFechaNac[0]) > 29) {
                    return false;
                }
            } else if (Integer.parseInt(valoresTxtFechaNac[0]) > 28) {
                return false;
            }

        }
        return true;
    }

    public int EdadValida() {
        String fecha = Util.fechaDeHoy();
        String[] valoresTxtFechaHoy = fecha.split("/");
        String fechaNac = this.getFechaNac();
        String[] valoresTxtFechaNac = fechaNac.split("/");

        boolean haCumplido = false;
        if (Integer.parseInt(valoresTxtFechaNac[1]) == Integer.parseInt(valoresTxtFechaHoy[1])
                && Integer.parseInt(valoresTxtFechaNac[0]) >= Integer.parseInt(valoresTxtFechaHoy[0])) {
            haCumplido = true;
        } else if (Integer.parseInt(valoresTxtFechaNac[1]) < Integer.parseInt(valoresTxtFechaHoy[1])) {
            haCumplido = true;
        }

        int edadReal = haCumplido ? Integer.parseInt(valoresTxtFechaHoy[2]) - Integer.parseInt(valoresTxtFechaNac[2])
                : Integer.parseInt(valoresTxtFechaHoy[2]) - Integer.parseInt(valoresTxtFechaNac[2]) - 1;

        return edadReal;
    }

    @Override
    public String toString() {
        String fechaValida = (this.esFechaValida) ? "Si" : "No";
        return "Nombre: " + this.nombre + "\nFecha nacimeinto: " + this.fechaNac + "\nAltura: " + this.altura
                + "\nPeso: "
                + this.peso + "\nEstado civil: " + this.estadoCivil + "\nFecha nacimiento valida: " + fechaValida;
    }
}
