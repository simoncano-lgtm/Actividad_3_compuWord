public abstract class Empleado {
    private int idEmpleado;
    private String nombre;
    private String documento;
    private double salario;

    public Empleado(int idEmpleado, String nombre, String documento, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
    }

    // Métodos Getter y Setter
    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }

    // Método abstracto para Polimorfismo
    public abstract double calcularBono();
}