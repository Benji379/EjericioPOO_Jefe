package Logica;

/**
 *
 * @author Benji
 */
public class Main {

    public static void main(String[] args) {
        Jefe Benji = new Jefe("Benjamin", "Gerente", 71829343, "Contabilidad", 10);

        System.out.println("El sueldo base es: " + Benji.getSueldoBase());
        System.out.println("El monto de movilidad es de: S/" + Benji.getMontoMovilidad());
        System.out.println("El monto de Bonificación es: S/." + Benji.getMontoBonificacion());
        System.out.println("El sueldo Final es de: S/." + Benji.getSueldoFinal());

    }
}
