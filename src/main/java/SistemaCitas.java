import java.util.*;
import java.time.LocalDateTime;

public class SistemaCitas {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<CitaMedica> citas = new ArrayList<>();
    private List<ExamenLaboratorio> examenes = new ArrayList<>();

    public Paciente registrarPaciente(String cedula, String nombre, String correo) {
        Paciente paciente = new Paciente(cedula, nombre, correo);
        pacientes.add(paciente);
        return paciente;
    }
    
    public void registrarMedico(String nombre, String especialidad) {
        medicos.add(new Medico(nombre, especialidad));
    }

    public CitaMedica agendarCita(String cedulaPaciente, String especialidad, LocalDateTime fechaHora) {
        Paciente p = buscarPaciente(cedulaPaciente);
        if (p == null) {
            System.out.println("Paciente no encontrado.");
            return null;
        }
        Medico m = medicos.stream()
            .filter(med -> med.getEspecialidad().equalsIgnoreCase(especialidad))
            .findFirst().orElse(null);
        if (m == null) {
            System.out.println("No hay médico disponible.");
            return null;
        }
        CitaMedica citaMedica = new CitaMedica(p, m, fechaHora);
        citas.add(citaMedica);
        return citaMedica;
    }

    public ExamenLaboratorio solicitarExamen(String cedulaPaciente, String tipoExamen) {
        Paciente p = buscarPaciente(cedulaPaciente);
        if (p != null) {
            ExamenLaboratorio examenLaboratorio = new ExamenLaboratorio(p, tipoExamen);
            examenes.add(examenLaboratorio);
            return examenLaboratorio;
        }
        return null;
    }

    public void registrarResultado(String cedulaPaciente, String tipoExamen, String resultado) {
        for (ExamenLaboratorio e : examenes) {
            if (e.toString().contains(cedulaPaciente) && e.toString().contains(tipoExamen)) {
                e.registrarResultado(resultado);
                break;
            }
        }
    }

    public void verHistorial(String cedulaPaciente) {
        citas.stream()
            .filter(c -> c.getPaciente().getCedula().equals(cedulaPaciente))
            .forEach(System.out::println);

        examenes.stream()
            .filter(e -> e.toString().contains(cedulaPaciente))
            .forEach(System.out::println);
    }

    private Paciente buscarPaciente(String cedula) {
        return pacientes.stream()
            .filter(p -> p.getCedula().equals(cedula))
            .findFirst().orElse(null);
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public List<Medico> getMedicos() {
        return medicos;
    }
    public List<CitaMedica> getCitas() {
        return citas;
    }
    public List<ExamenLaboratorio> getExamenes() {
        return examenes;
    }
}