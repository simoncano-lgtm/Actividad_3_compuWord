public class EmpleadoTemporal extends Empleado {
    private String fechaFinContrato;

    public EmpleadoTemporal(int id, String nom, String doc, double sal, String fechaFin) {
        super(id, nom, doc, sal);
        this.fechaFinContrato = fechaFin;
    }

    @Override
    public double calcularBono() {
        // temporales
        return getSalario() * 0.05; 
    }
}