/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mile
 */
public class CitaMedicaIT {
    
    public CitaMedicaIT() {
    }

    /**
     * Test of setEstado method, of class CitaMedica.
     */
    @Test
    public void testSetEstado() {
        Paciente paciente = new Paciente("0955461934", "Francis", "faloayza@espol.edu.ec");
        Medico medico = new Medico("Aquiles", "Pediatra");
        CitaMedica citamedica = new CitaMedica(paciente, medico, LocalDateTime.now());
        citamedica.setEstado("nuevo");
        assertEquals( "nuevo",citamedica.getEstado());
    }

    @Test
    public void testSetEstadoFallido() {
        Paciente paciente = new Paciente("0955461934", "Francis", "faloayza@espol.edu.ec");
        Medico medico = new Medico("Aquiles", "Pediatra");
        CitaMedica citamedica = new CitaMedica(paciente, medico, LocalDateTime.now());
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            citamedica.setEstado(null);
        });
        assertEquals("Estado no puede ser nulo", exception.getMessage());
    }

    /**
     * Test of toString method, of class CitaMedica.
     */
    @Test
    public void testToString() {
        Paciente paciente = new Paciente("0955461934", "Francis", "faloayza@espol.edu.ec");
        Medico medico = new Medico("Aquiles", "Pediatra");
        CitaMedica citaMedica= new CitaMedica(paciente, medico, LocalDateTime.now());
        LocalDateTime fechaHora =citaMedica.getFechaHora();
        String estado= citaMedica.getEstado();
        assertEquals("Cita con " + medico + " para " + paciente + " en " + fechaHora + " [" + estado + "]",citaMedica.toString());
    }
    
}
