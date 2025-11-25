package academico;
public abstract class Persona {

    //Atributos

    public Persona(String nombre, String identificacion) {
        Nombre = nombre;
        Identificacion = identificacion;
    }

    public String Nombre;
    public String Identificacion;

    public String getNombre() {
        return Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public abstract void mostrarRol();

    public void mostrarDatos(){
        System.out.printf("\nNombre: %s, identificacion: %s",this.Nombre,this.Identificacion);
    }

}
