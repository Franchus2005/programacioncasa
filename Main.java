package actividadesprogramacion;


public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso en la clase principal (Main)
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", 2000, 500);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Maria", 15, 45, 10);

        // Muestra información detallada sobre cada empleado
        mostrarInformacionEmpleado(empleadoAsalariado);
        mostrarInformacionEmpleado(empleadoPorHora);
    }

    private static void mostrarInformacionEmpleado(Empleado empleado) {
        // Muestra información detallada sobre el empleado
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario Base: $" + empleado.calcularSalario());

        // Muestra información específica para EmpleadoPorHora
        if (empleado instanceof EmpleadoPorHora) {
            EmpleadoPorHora empleadoPorHora = (EmpleadoPorHora) empleado;
            System.out.println("Horas Trabajadas: " + empleadoPorHora.getHorasTrabajadas());
        }

        // Muestra el salario total
        System.out.println("Salario Total: $" + empleado.calcularSalario());
        System.out.println("------------------------");
    }
}