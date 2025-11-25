package academico;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements Evaluable{

    private List<Double> notas;
    private String carrera;


    private  String getcarrera;

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String identificacion, String carrera) {
        super(nombre, identificacion);
        this.carrera = carrera;
        this.notas = new ArrayList<>();   //Inicia la lista
    }


    @Override
    public double carcularPromedio(){
        if (notas.isEmpty())
            return 0.0;

        double Suma=0;
        for (double valor: notas){
            Suma += valor;
        }
        return Suma/notas.size();
    }

    @Override
    public void agregarNota(double nota) {

        if (nota >=0 && nota <=10)
            notas.add((nota));
        else
            System.out.printf("Nota %.2f es invalida", nota);
    }

    @Override
    public void mostrarRol() {
        System.out.printf("Rol: Estudiante");
        System.out.printf("carrera: " + carrera);
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        mostrarRol();
        System.out.printf("Nottas: "+ notas);
        System.out.printf("Promedio: %.2f\n", carcularPromedio());
    }
}
