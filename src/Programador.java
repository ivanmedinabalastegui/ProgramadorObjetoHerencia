public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    private double sueldoAlAnio;

    public Programador(String nombre, String apellido1, String apellido2, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante, double sueldoAlAnio){
        super(nombre, apellido1, apellido2, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
        this.sueldoAlAnio = sueldoAlAnio;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    public double getSueldoAlAnio() {
        return sueldoAlAnio;
    }

    public void setSueldoAlAnio(double sueldoAlAnio) {
        this.sueldoAlAnio = sueldoAlAnio;
    }

    public void DatosEmpleado(){
        if(getEdad() <= 21) {
            System.out.println("Nombre: " + getNombre() +
                    "\nApellidos: " + getApellido1() + " " + getApellido2() +
                    "\nEdad: " + getEdad() + ", Principiante" +
                    "\nCasado: " + getCasado() +
                    "\nSalario: " + getSalario());
        } else if(getEdad() < 21 || getEdad() < 35) {
            System.out.println("Nombre: " + getNombre() +
                    "\nApellidos: " + getApellido1() + " " + getApellido2() +
                    "\nEdad: " + getEdad() + ", Intermedio" +
                    "\nCasado: " + getCasado() +
                    "\nSalario: " + getSalario());
        } else if(getEdad() >= 35) {
            System.out.println("Nombre: " + getNombre() +
                    "\nApellidos: " + getApellido1() + " " + getApellido2() +
                    "\nEdad: " + getEdad() + ", Senior" +
                    "\nCasado: " + getCasado() +
                    "\nSalario: " + getSalario());
        }
    }
}