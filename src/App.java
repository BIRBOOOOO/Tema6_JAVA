public class App {

    public static void main(String[] args) throws Exception {
        Persona psn2 = new Persona();

        System.out.println(psn2.toString());

        Persona psnTest = new Persona("Oriol", "04/09/2006", 170, 62, "Estudiante");
        System.out.println(psnTest.getEsfechaValida());

        System.out.println(psnTest.EdadValida());

        psnTest.getDiaMesAnyo();
        psnTest.setFechaNac("01/05/2000");
        System.out.println(psnTest.getFechaNac());

        System.out.println(Util.esFechaValida(29, 2, 2021));
    }

}
