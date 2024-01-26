package actividadesprogramacion;

class EmpleadoPorHora extends Empleado {
    // Clase derivada EmpleadoPorHora que hereda de Empleado
    private int horasTrabajadas;
    private double tarifaPorHora;
    private static final int HORAS_REGULARES = 40;

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        // Sobrescribe el método calcularSalario para tener en cuenta horas regulares y extras
        if (horasTrabajadas <= HORAS_REGULARES) {
            return super.calcularSalario() + horasTrabajadas * tarifaPorHora;
        } else {
            int horasRegulares = HORAS_REGULARES;
            int horasExtras = horasTrabajadas - HORAS_REGULARES;
            return super.calcularSalario() + (horasRegulares * tarifaPorHora) + (horasExtras * 1.5 * tarifaPorHora);
        }
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

}
