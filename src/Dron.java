public class Dron extends Volador{

    public Dron(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public String toString() {
        return "Dron{" +
                "Nombre: " + this.getNombre() +
                "   Velocidad: " + this.getVelocidad() +
                "}";
    }
}
