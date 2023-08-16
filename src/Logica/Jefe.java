package Logica;

/**
 *
 * @author Benji
 */
public class Jefe {

    private String nombre;
    private String cargo;
    private int dni;
    private String area;
    private int añosAntiguedad;

    public Jefe(String nombre, String cargo, int dni, String area, int añoAntiguedad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dni = dni;
        this.area = area;
        this.añosAntiguedad = añoAntiguedad;
    }

    public double getSueldoBase() {
        double sueldoBase = 0;

        switch (cargo) {
            case "Gerente":
                switch (area) {
                    case "Contabilidad":
                        sueldoBase = 6000;
                        break;
                    case "Planificación":
                        sueldoBase = 7000;
                        break;
                }
                break;
            case "Subgerente":
                switch (area) {
                    case "Contabilidad":
                        sueldoBase = 5000;
                        break;
                    case "Planificación":
                        sueldoBase = 6000;
                        break;
                }
                break;
        }
        return sueldoBase;
    }

    public double getMontoMovilidad() {
        double montoMovilidad = 0;
        switch (cargo) {
            case "Gerente":
                montoMovilidad = 700;
                break;
            case "Subgerente":
                montoMovilidad = 400;
                break;
        }
        return montoMovilidad;
    }

    public double getMontoBonificacion() {
        double montoBonificacion = 0;
        if (añosAntiguedad <= 7) {
            montoBonificacion = getSueldoBase() * 0.05;
        } else {
            if (añosAntiguedad >= 8) {
                montoBonificacion = getSueldoBase() * 0.04;
            }
        }
        return montoBonificacion;
    }

    public double getSueldoFinal() {
        double sueldoFinal = 0;
        sueldoFinal = getSueldoBase() + getMontoBonificacion() + getMontoMovilidad();
        return sueldoFinal;
    }

}
