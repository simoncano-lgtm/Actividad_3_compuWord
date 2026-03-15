public class EmpleadoPermanente extends Empleado {
    private double beneficios;

    public EmpleadoPermanente(int id, String nom, String doc, double sal, double ben) {
        super(id, nom, doc, sal);
        this.beneficios = ben;
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.10 + beneficios;
    }
}