public class ReporteDesempeño {
    // Sobrecarga: Reporte para un solo empleado
    public void generarReporte(Empleado emp) {
        System.out.println("Reporte Individual: " + emp.getNombre());
    }

    // Sobrecarga: Reporte para todo un departamento con métrica específica
    public void generarReporte(Departamento dep, String metrica) {
        System.out.println("Reporte de Departamento con metrica: " + metrica);
        dep.mostrarEmpleados();
    }
}