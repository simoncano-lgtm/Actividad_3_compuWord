package actividad_2_compuword;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmpleadoTest {

    @Test
    public void testCalcularSalario() {

        Empleado emp =
            new Empleado(
                1,
                "Simon",
                "123",
                15000
            );

        assertEquals(
            15000,
            emp.calcularSalario(),
            0.01
        );

    }

}