/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mile
 */
public class MedicoIT {
    
    @Test
    public void testConstructorValido() {
        Medico medico = new Medico("Dr. Smith", "Cardiología");
        assertEquals(medico.getNombre(), "Dr. Smith");
    }

    @Test
    public void testConstructorNombreVacio() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Medico("", "Pediatría");
        });
        assertEquals("Nombre no puede estar vacío", exception.getMessage());
    }
}
