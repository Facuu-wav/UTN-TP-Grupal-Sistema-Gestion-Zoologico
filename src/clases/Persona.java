package clases;

public abstract class Persona {
<<<<<<< HEAD
    private String nombre;
    private String dni;
    private int legajo;
    private double salario;

    public Persona(String nombre, String dni, int legajo, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
        this.salario = salario;
    }

=======

    /// ATRIBUTOS ************************************************************************************************** ///

    private static int    contLegajo = 0;
    private        String nombre;
    private        int    dni;
    private        int    legajo;
    private        double salario;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Persona(String nombre, int dni, int legajo, double salario) {
        this.nombre  = nombre;
        this.dni     = dni;
        this.legajo  = legajo;
        this.salario = salario;
    }

    /// MÉTODOS **************************************************************************************************** ///

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public static int getContLegajo() {
        return contLegajo;
    }

    public static void setContLegajo(int contLegajo) {
        Persona.contLegajo = contLegajo;
    }

>>>>>>> pareja-a
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

<<<<<<< HEAD
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
=======
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
>>>>>>> pareja-a
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
<<<<<<< HEAD


=======
>>>>>>> pareja-a
}
