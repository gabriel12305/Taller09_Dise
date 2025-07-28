/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mile
 */
public class ExamenLaboratorioIT {
    
    public ExamenLaboratorioIT() {
    }

    /**
     * Test of registrarResultado method, of class ExamenLaboratorio.
     */
    @Test
    public void testRegistrarResultado() {
        System.out.println("registrarResultado");
        String resultado = "Positivo";
        Paciente pacienteInstance = new Paciente("0961238761", "Danilo", "dani@gmail.com");
        ExamenLaboratorio instance = new ExamenLaboratorio(pacienteInstance, "Examen de Ojo");
        instance.registrarResultado(resultado);
        assertEquals(resultado, instance.getResultado());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ExamenLaboratorio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paciente pacienteInstance = new Paciente("0961238761", "Danilo", "dani@gmail.com");
        ExamenLaboratorio instance = new ExamenLaboratorio(pacienteInstance, "Examen de Autismo");
        String result = instance.toString();
        assertTrue(result.endsWith("Pendiente")); 
    }
    
}
