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
    
    public MedicoIT() {
    }

    /**
     * Test of getNombre method, of class Medico.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Medico instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspecialidad method, of class Medico.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Medico instance = null;
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Medico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Medico instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
