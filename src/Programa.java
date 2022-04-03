public class Programa {
    public static void main (String[] args){
        Programador p1 = new Programador("Luis", "Romero", "Marín", 35, false, 1350.35, 1000, "Java", 25500);
        //Ver Datos del empleado
        System.out.println("\nDatos del empleado");
        p1.DatosEmpleado();
        System.out.println("Líneas de código por hora: " + p1.getLineasDeCodigoPorHora() + "\nLenguaje dominante: " + p1.getLenguajeDominante() +
                "\nSueldo al año: " + p1.getSueldoAlAnio());

        //Porcentaje
        double total = (p1.getSalario() * Double.parseDouble(args[0])/100);
        double totalS = (p1.getSueldoAlAnio() * Double.parseDouble(args[0])/100);
        System.out.println("\nSalario mensual actual: \n" + p1.getSalario() + "\nSalario anual actual: \n" + p1.getSueldoAlAnio() +
                "\n\nPorcentaje: \n" + args[0] + "%" + "\nSalario mensual con el porcentaje: \n" + (total + p1.getSalario()) +
                "\nSalario anual con el porcentaje: \n" + (totalS + p1.getSueldoAlAnio()));
    }
}
