/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mile
 */
public class SistemaCitasIT {
    
    /**
     * Test of registrarPaciente method, of class SistemaCitas.
     */
    @Test
    public void testRegistrarPaciente() {
        System.out.println("registrarPaciente");
        String cedula = "0923546272";
        String nombre = "Gabriel";
        String correo = "correo@gmail.com";
        SistemaCitas sistemaCitas = new SistemaCitas();
        Paciente paciente = sistemaCitas.registrarPaciente(cedula, nombre, correo);
        List<Paciente> pacientes = sistemaCitas.getPacientes();
        for (Paciente comprobar : pacientes) {
            if (comprobar.getCedula().equals("0923546272")) {
                assertSame(paciente, comprobar);
            }
        }
    }

    // /**
    //  * Test of agendarCita method, of class SistemaCitas.
    //  */
    @Test
    public void testAgendarCita() {
        System.out.println("agendarCita");
        String cedulaPaciente = "0923546272";
        String especialidad = "Medico General";
        LocalDateTime fechaHora = LocalDateTime.now();
        SistemaCitas sistemaCitas = new SistemaCitas();

        CitaMedica citaMedica = sistemaCitas.agendarCita(cedulaPaciente, especialidad, fechaHora);
        List<CitaMedica> citaMedicas = sistemaCitas.getCitas();
        for (CitaMedica comprobar : citaMedicas) {
            if (comprobar.getPaciente().getCedula().equals("0923546272")) {
                assertSame(citaMedica, comprobar);
            }
        }
        
    }

    // /**
    //  * Test of solicitarExamen method, of class SistemaCitas.
    //  */
    @Test
    public void testSolicitarExamen() {
        System.out.println("solicitarExamen");
        String cedulaPaciente = "0923546272";
        String tipoExamen = "Ojos";
        SistemaCitas sistemaCitas= new SistemaCitas();
        
        ExamenLaboratorio examenLaboratorio = sistemaCitas.solicitarExamen(cedulaPaciente, tipoExamen);
        List<ExamenLaboratorio> examenLaboratorios = sistemaCitas.getExamenes();
        for (ExamenLaboratorio comprobar : examenLaboratorios) {
            if (comprobar.getPaciente().getCedula().equals("0923546272")) {
                assertSame(examenLaboratorio, comprobar);
            }
        }
    }

    // /**
    //  * Test of registrarResultado method, of class SistemaCitas.
    //  */
    @Test
    public void testRegistrarResultado() {
        System.out.println("registrarResultado");
        String cedulaPaciente = "";
        String tipoExamen = "";
        String resultado = "";
        SistemaCitas instance = new SistemaCitas();
        
    }

    // /**
    //  * Test of verHistorial method, of class SistemaCitas.
    //  */
    // @Test
    // public void testVerHistorial() {
    //     System.out.println("verHistorial");
    //     String cedulaPaciente = "";
    //     SistemaCitas instance = new SistemaCitas();
        
    // }
    
}
