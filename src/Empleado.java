public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String apellido1, String apellido2, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido1: " + apellido1 +
                "\nApellido2: " + apellido2 +
                "\nEdad: " + edad +
                "\nCasado: " + casado +
                "\nSalario: " + salario;
    }
}
