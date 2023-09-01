package domain;

public class Alumno {
    private String nombre;
    private String apellido;
    private double[] notas ;
    private int indiceNotas;
    
    public Alumno() {
        this.notas =  new double[3];
    }

    public Alumno(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public double calcularPromedio() {
        double sumaCalif = 0;
        for(int i = 0; i<notas.length; i++) {
            sumaCalif += this.notas[i];
        }
        return sumaCalif / notas.length;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNota(double notas) {
        this.notas[indiceNotas++] = notas;
    }
    
    public String mostrarNotas() {
        String notas = "";
        for(int i = 0; i <this.getNotas().length; i++) {
            notas += this.notas[i] + " ";
        }
        return "\tNotas: ["+ notas + "]";
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", Promedio: " 
                + String.format("%.2f", this.calcularPromedio()) + this.mostrarNotas();
    }
    
}
