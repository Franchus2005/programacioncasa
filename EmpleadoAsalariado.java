package actividadesprogramacion;

class EmpleadoAsalariado extends Empleado {
    // Clase derivada EmpleadoAsalariado que hereda de Empleado
    private double bonoAnual;

    public EmpleadoAsalariado(String nombre, double salarioBase, double bonoAnual) {
        super(nombre, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalario() {
        // Sobrescribe el método calcularSalario para incluir el bono anual en el salario total
        return super.calcularSalario() + bonoAnual;
    }
}