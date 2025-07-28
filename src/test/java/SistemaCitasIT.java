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
public class SistemaCitasIT {
    
    public SistemaCitasIT() {
    }

    /**
     * Test of registrarPaciente method, of class SistemaCitas.
     */
    @Test
    public void testRegistrarPaciente() {
        System.out.println("registrarPaciente");
        String cedula = "";
        String nombre = "";
        String correo = "";
        SistemaCitas instance = new SistemaCitas();
        instance.registrarPaciente(cedula, nombre, correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarMedico method, of class SistemaCitas.
     */
    @Test
    public void testRegistrarMedico() {
        System.out.println("registrarMedico");
        String nombre = "";
        String especialidad = "";
        SistemaCitas instance = new SistemaCitas();
        instance.registrarMedico(nombre, especialidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agendarCita method, of class SistemaCitas.
     */
    @Test
    public void testAgendarCita() {
        System.out.println("agendarCita");
        String cedulaPaciente = "";
        String especialidad = "";
        LocalDateTime fechaHora = null;
        SistemaCitas instance = new SistemaCitas();
        instance.agendarCita(cedulaPaciente, especialidad, fechaHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solicitarExamen method, of class SistemaCitas.
     */
    @Test
    public void testSolicitarExamen() {
        System.out.println("solicitarExamen");
        String cedulaPaciente = "";
        String tipoExamen = "";
        SistemaCitas instance = new SistemaCitas();
        instance.solicitarExamen(cedulaPaciente, tipoExamen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarResultado method, of class SistemaCitas.
     */
    @Test
    public void testRegistrarResultado() {
        System.out.println("registrarResultado");
        String cedulaPaciente = "";
        String tipoExamen = "";
        String resultado = "";
        SistemaCitas instance = new SistemaCitas();
        instance.registrarResultado(cedulaPaciente, tipoExamen, resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verHistorial method, of class SistemaCitas.
     */
    @Test
    public void testVerHistorial() {
        System.out.println("verHistorial");
        String cedulaPaciente = "";
        SistemaCitas instance = new SistemaCitas();
        instance.verHistorial(cedulaPaciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
