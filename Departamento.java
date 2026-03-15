import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    private String nombre;
    private List<Empleado> listaEmpleados;

    public Departamento(int id, String nombre) {
        this.idDepartamento = id;
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) throws Exception {
        if (emp == null) {
            
            //Excecion
            throw new Exception("Error: No se puede asignar un empleado"); 
        }
        listaEmpleados.add(emp);
    }

    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre);
        for (Empleado e : listaEmpleados) {
            System.out.println("- " + e.getNombre());
        }
    }
}