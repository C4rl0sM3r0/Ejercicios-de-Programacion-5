package academico;

import academico.Estudiante;
import academico.Profesor;
import java.util.ArrayList;
import java.util.List;

public class Curso{

    private String codigo;
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void asignarProfesor(Profesor p) {
        this.profesor = p;
    }

    public void inscribirEstudiante(Estudiante e) {
        if (!estudiantes.contains(e)) {
            estudiantes.add(e);
        }
    }

    public void mostrarInformacionCurso() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor asignado:");
            profesor.mostrarDatos();
        } else {
            System.out.println("No hay profesor asignado.");
        }
        System.out.println("Número de estudiantes inscritos: " + estudiantes.size());
    }

    public void listarEstudiantes() {
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre() + " (" + e.getIdentificacion() + ")");
        }
    }

    public double calcularPromediosGenerales() {
        if (estudiantes.isEmpty()) return 0.0;
        double suma = 0;
        int cont = 0;

        for (Estudiante e : estudiantes) {
            suma += e.carcularPromedio();
            cont++;
        }
        return cont == 0 ? 0.0 : suma / cont;
    }
}