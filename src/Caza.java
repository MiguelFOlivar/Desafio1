public class Caza extends Volador{

    public Caza(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public String toString() {
        return "Caza{" +
                "Nombre: " + this.getNombre() +
                "   Velocidad: " + this.getVelocidad() +
                "}";
    }
}
