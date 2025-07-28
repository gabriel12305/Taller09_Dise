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
public class PacienteIT {
    
    @Test
    public void testConstructorValido() {
        Paciente paciente = new Paciente("1234567890", "Juan Perez", "jperez@gmail.com");
        assertEquals(paciente.getCedula(), "1234567890");
    }


    @Test
    public void testConstructorCedulaInvalida() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Paciente("12345", "Ana Gomez", "agomez@gmail.com");
        });
        assertEquals(exception.getMessage(),"Cédula inválida" );
    }
 
        
}
