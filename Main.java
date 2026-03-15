public class Main {
    public static void main(String[] args) {
        try {
            //Crear Departamento
            Departamento deptoTI = new Departamento(1, "Tecnologia");

            //Crear Empleados (Polimorfismo)
            Empleado emp1 = new EmpleadoPermanente(101, "Ana Silva", "12345", 3000, 500);
            Empleado emp2 = new EmpleadoTemporal(102, "Juan Perez", "67890", 2000, "2024-12-31");

            //Asignar a Departamento
            deptoTI.agregarEmpleado(emp1);
            deptoTI.agregarEmpleado(emp2);

            // Generar Reportes 
            ReporteDesempeño reporte = new ReporteDesempeño();
            reporte.generarReporte(emp1); // Individual
            reporte.generarReporte(deptoTI, "Productividad"); // Por departamento

        } catch (Exception e) {
            System.err.println("Error en el sistema: " + e.getMessage());
        }
    }
}