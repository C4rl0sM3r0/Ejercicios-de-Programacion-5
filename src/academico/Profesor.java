package academico;

public  class Profesor extends Persona {
    private String especialidad;
//Setter y Getters
    public Profesor(String nombre, String identificacion, String especialidad) {
        super(nombre, identificacion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
//Constructor
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
//Metodos
    @Override
    public void mostrarRol() {
        System.out.printf("\nRol: Profesor, Especialidad:%s",this.especialidad);

    }
}
