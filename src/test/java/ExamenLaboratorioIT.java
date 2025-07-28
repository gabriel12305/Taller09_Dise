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
public class ExamenLaboratorioIT {
    
    public ExamenLaboratorioIT() {
    }

    /**
     * Test of registrarResultado method, of class ExamenLaboratorio.
     */
    @Test
    public void testRegistrarResultado() {
        System.out.println("registrarResultado");
        String resultado = "";
        ExamenLaboratorio instance = null;
        instance.registrarResultado(resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ExamenLaboratorio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ExamenLaboratorio instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
